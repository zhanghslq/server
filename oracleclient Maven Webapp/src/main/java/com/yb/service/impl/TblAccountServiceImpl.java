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
import com.yb.dao.TblAccountDao;
import com.yb.entity.Status;
import com.yb.entity.TblAccount;
import com.yb.service.TblAccountService;

@Service
@Transactional
public class TblAccountServiceImpl implements TblAccountService {

	@Autowired
	private TblAccountDao tblAccountDao;
	@Override
	public void queryAll() {
		// TODO Auto-generated method stub
		PrintWriter writer=null;//第一次用来没有的创建个初始为0的
		PrintWriter pw=null;//查寻到的数据的id最大的
		Long id=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		BufferedWriter out=null;
		int count=0;
		try {
			File file = new File("TblAccount.txt");
			if(!file.exists()){
				writer = new PrintWriter(file);
				Long queryMinId = tblAccountDao.queryMinId();
				writer.println(String.valueOf(queryMinId));
				writer.flush();
			}
			if(file.isFile() && file.exists()) {
				isr = new InputStreamReader(new FileInputStream(file), "utf-8");
				br = new BufferedReader(isr);
				String readLine = br.readLine();//读取数据
				id = Long.valueOf(readLine);
			}
			
			List<TblAccount> list = tblAccountDao.queryAll(id,id+100000);
			
			
			
			if(list.size()!=0){
					ArrayList<TblAccount> arrayList = new ArrayList<TblAccount>();
					for (TblAccount tblAccount : list) {
						arrayList.add(tblAccount);//添加的一条数据
						count++;
						if(count%40==0){
							String jsonString = JSON.toJSONString(arrayList);
							HttpEntity httpEntity = new StringEntity(jsonString,"UTF-8");
					        String asString = Request.Post("http://localhost:8989/server/tblAccount/insert")
					                .body(httpEntity).setHeader("content-type", "application/json;charset=UTF-8")
					                .execute().returnContent().asString();
					        Status status = JSON.parseObject(asString, Status.class);
					        if(status.getStatus().equals("error")){
					        	out = new BufferedWriter(new FileWriter("system.log",true));
					        	out.write(asString+"----count-----"+count+"\n");
					        }
					        arrayList.clear();//把临时的集合 的数据清空
						}
						if(arrayList.size()!=0){
							String jsonString = JSON.toJSONString(arrayList);
							HttpEntity httpEntity = new StringEntity(jsonString,"UTF-8");
					        String asString = Request.Post("http://localhost:8989/server/tblAccount/insert")
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
					pw=new PrintWriter(file);
					pw.write(String.valueOf(id+100000));//把最新的id写入文件
					pw.flush();
					list.clear();
					queryAll();//继续调用
				}else {//抽取数据完成，把记录清空，下次重新全部抽取
					pw=new PrintWriter(file);
					Long queryMinId = tblAccountDao.queryMaxId();
					pw.write(String.valueOf(queryMinId+1));//把最新的id写入文件
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