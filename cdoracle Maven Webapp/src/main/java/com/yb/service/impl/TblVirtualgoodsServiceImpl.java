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
import com.yb.dao.TblVirtualgoodsDao;
import com.yb.entity.Status;
import com.yb.entity.TblVirtualgoods;
import com.yb.service.TblVirtualgoodsService;

@Service
@Transactional
public class TblVirtualgoodsServiceImpl implements TblVirtualgoodsService{
	@Autowired
	private TblVirtualgoodsDao tblVirtualgoodsDao;
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
			File file = new File("TblVirtualgoodsCDSHELL.txt");
			if(!file.exists()){
				writer = new PrintWriter(file);
				Long queryMinId = tblVirtualgoodsDao.queryMinId();
				writer.print(String.valueOf(queryMinId));
				writer.flush();
			}
			if(file.isFile() && file.exists()) {
				isr = new InputStreamReader(new FileInputStream(file), "utf-8");
				br = new BufferedReader(isr);
				String readLine = br.readLine();//读取数据
				id = Long.valueOf(readLine);
			}
			List<TblVirtualgoods> list = tblVirtualgoodsDao.queryAll(id,id+100000);//一次查询十万条
			if(list.size()!=0){
					ArrayList<TblVirtualgoods> arrayList = new ArrayList<TblVirtualgoods>();
					for (TblVirtualgoods tblVirtualgoods : list) {
						arrayList.add(tblVirtualgoods);//添加的一条数据
						count++;
						if(count%40==0){
							String jsonString = JSON.toJSONString(arrayList);
							HttpEntity httpEntity = new StringEntity(jsonString,"UTF-8");
					        String asString = Request.Post("http://localhost:8989/cdserver/tblVirtualgoods/insert")
					                .body(httpEntity).setHeader("content-type", "application/json;charset=UTF-8")
					                .execute().returnContent().asString();
					        Status status = JSON.parseObject(asString, Status.class);
					        if(status.getStatus().equals("error")){
					        	out = new BufferedWriter(new FileWriter("system.log",true));
					        	out.write(asString+"----count-----"+count+"\n");
					        }
					        arrayList.clear();//把临时的集合 的数据清空
						}
						if(arrayList.size()!=0){//最后还有数据，也传输过去
							String jsonString = JSON.toJSONString(arrayList);
							HttpEntity httpEntity = new StringEntity(jsonString,"UTF-8");
					        String asString = Request.Post("http://localhost:8989/cdserver/tblVirtualgoods/insert")
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
			}else {//查询之后为空，证明没数据了
				pw=new PrintWriter(file);
				Long queryMaxId = tblVirtualgoodsDao.queryMaxId();
				pw.write(String.valueOf(queryMaxId-200));//把最新的id写入文件，因为查询的时候是大于等于，所以为了避免重复前面写入的时候直接加1
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
