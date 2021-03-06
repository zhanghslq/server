package com.yb.service.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.StringEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.yb.dao.DictAccountStatusDao;
import com.yb.entity.DictAccountStatus;
import com.yb.entity.Status;
import com.yb.service.DictAccountStatusService;
@Service
@Transactional
public class DictAccountStatusServiceImpl implements DictAccountStatusService {

	@Autowired
	private DictAccountStatusDao dictAccountStatusDao;
	
	@Override
	public void queryAll() {
		// TODO Auto-generated method stub
		PrintWriter writer=null;//第一次用来没有的创建个初始为0的
		PrintWriter pw=null;//查寻到的数据的id最大的
		Integer id=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		BufferedWriter out=null;
		int count=0;
		try {
			File file = new File("dictAccountStatusCDSHELL.txt");
			if(!file.exists()){
				writer = new PrintWriter(file);
				writer.println(0);
				writer.flush();
			}
			if(file.isFile() && file.exists()) {
				isr = new InputStreamReader(new FileInputStream(file), "utf-8");
				br = new BufferedReader(isr);
				String readLine = br.readLine();//读取数据
				id = Integer.valueOf(readLine);
			}
			List<DictAccountStatus> list = dictAccountStatusDao.queryAll(id);
			if(list.size()!=0&&list!=null){//取出来的有数据，才会调用
				ArrayList<DictAccountStatus> arrayList = new ArrayList<DictAccountStatus>();
				for (DictAccountStatus dictAccountStatus : list) {
					arrayList.add(dictAccountStatus);//添加的一条数据
					count++;
					if(count%30==0){
						String jsonString = JSON.toJSONString(arrayList);
						HttpEntity httpEntity = new StringEntity(jsonString,"UTF-8");
				        String asString = Request.Post("http://localhost:8989/cdserver/dictAccountStatus/insert")
				                .body(httpEntity).setHeader("content-type", "application/json;charset=UTF-8")
				                .execute().returnContent().asString();
				        Status status = JSON.parseObject(asString, Status.class);
				        if(status.getStatus().equals("error")){
				        	out = new BufferedWriter(new FileWriter("system.log",true));
				        	out.write(asString+"----count-----"+count+"\n");
				        }
				        arrayList.clear();//把临时的集合 的数据清空
					}
				}
				list.clear();
				if(count%30!=0){//证明最后还有未提交的数据
					String jsonString = JSON.toJSONString(arrayList);
					HttpEntity httpEntity = new StringEntity(jsonString,"UTF-8");
			        String asString = Request.Post("http://localhost:8989/cdserver/dictAccountStatus/insert")
			                .body(httpEntity).setHeader("content-type", "application/json;charset=UTF-8")
			                .execute().returnContent().asString();//调用接口，提交数据
			        Status status = JSON.parseObject(asString, Status.class);
			        if(status.getStatus().equals("error")){
			        	out = new BufferedWriter(new FileWriter("system.log",true));
			        	out.write(asString+"----count-----"+count+"\n");
			        }
			        arrayList.clear();//把临时的集合 的数据清空
				}
				Integer maxId = dictAccountStatusDao.queryMaxId();
				pw=new PrintWriter(file);
				pw.write(String.valueOf(maxId));//把最新的id最大的写入文件
				pw.flush();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(writer!=null){
				writer.close();
			}
			try {
				if(br!=null){
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(isr!=null){
					isr.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(out!=null){
					out.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(pw!=null){
				pw.close();
			}
		}
	}
	
	
}
