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
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.StringEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.yb.dao.TblEvaluationDao;
import com.yb.entity.Status;
import com.yb.entity.TblEvaluation;
import com.yb.entity.TblEvaluationProblem;
import com.yb.entity.TblEvaluationRelProblem;
import com.yb.service.TblEvaluationService;

@Service
@Transactional
public class TblEvaluationServiceImpl implements TblEvaluationService{

	@Autowired
	private TblEvaluationDao tblEvaluationDao;
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
			File file = new File("TblEvaluationCDSHELL.txt");
			if(!file.exists()){
				writer = new PrintWriter(file);
				writer.println(0);
				writer.flush();
			}
			if(file.isFile() && file.exists()) {
				isr = new InputStreamReader(new FileInputStream(file), "utf-8");
				br = new BufferedReader(isr);
				String readLine = br.readLine();//读取数据
				id = Long.valueOf(readLine);
			}
			List<TblEvaluation> list = tblEvaluationDao.queryAll(id);
			if(list.size()!=0&&list!=null){//取出来的有数据，才会调用
				ArrayList<TblEvaluation> arrayList = new ArrayList<TblEvaluation>();
				for (TblEvaluation tblEvaluation : list) {
					arrayList.add(tblEvaluation);//添加的一条数据
					count++;
					if(count%30==0){
						String jsonString = JSON.toJSONString(arrayList);
						HttpEntity httpEntity = new StringEntity(jsonString,"UTF-8");
				        String asString = Request.Post("http://localhost:8989/cdserver/tblEvaluation/insert")
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
			        String asString = Request.Post("http://localhost:8989/cdserver/tblEvaluation/insert")
			                .body(httpEntity).setHeader("content-type", "application/json;charset=UTF-8")
			                .execute().returnContent().asString();//调用接口，提交数据
			        Status status = JSON.parseObject(asString, Status.class);
			        if(status.getStatus().equals("error")){
			        	out = new BufferedWriter(new FileWriter("system.log",true));
			        	out.write(asString+"----count-----"+count+"\n");
			        	throw new RuntimeException();
			        }
			        arrayList.clear();//把临时的集合 的数据清空
				}
				Long maxId = tblEvaluationDao.queryMaxId();
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
	
	@Override
	public void queryProblem() {
		List<TblEvaluationProblem> list = tblEvaluationDao.queryProblem();
				String jsonString = JSON.toJSONString(list);
				HttpEntity httpEntity = new StringEntity(jsonString,"UTF-8");
		        try {
					Request.Post("http://localhost:8989/cdserver/tblEvaluationProblem/insert")
					        .body(httpEntity).setHeader("content-type", "application/json;charset=UTF-8")
					        .execute().returnContent().asString();
				} catch (ClientProtocolException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	@Override
	public void queryRelProblems() {
		// TODO Auto-generated method stub
		PrintWriter writer=null;//第一次用来没有的创建个初始为0的
		PrintWriter pw=null;//查寻到的数据的id最大的
		Long id=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		BufferedWriter out=null;
		int count=0;
		try {
			File file = new File("tblEvaluationRelProblemCDSHELL.txt");
			if(!file.exists()){
				writer = new PrintWriter(file);
				Long queryMinId = tblEvaluationDao.queryRelMinId();
				writer.println(String.valueOf(queryMinId));
				writer.flush();
			}
			if(file.isFile() && file.exists()) {
				isr = new InputStreamReader(new FileInputStream(file), "utf-8");
				br = new BufferedReader(isr);
				String readLine = br.readLine();//读取数据
				id = Long.valueOf(readLine);
			}
		
			List<TblEvaluationRelProblem> list = tblEvaluationDao.queryRelProblems(id,id+100000);
			//分页查询
			if(list.size()!=0){
					ArrayList<TblEvaluationRelProblem> arrayList = new ArrayList<TblEvaluationRelProblem>();
					for (TblEvaluationRelProblem tblTrade : list) {
						arrayList.add(tblTrade);//添加的一条数据
						count++;
						if(count%40==0){//满40条发送一次
							String jsonString = JSON.toJSONString(arrayList);
							HttpEntity httpEntity = new StringEntity(jsonString,"UTF-8");
					        String asString = Request.Post("http://localhost:8989/cdserver/tblEvaluationRelProblem/insert")
					                .body(httpEntity).setHeader("content-type", "application/json;charset=UTF-8")
					                .execute().returnContent().asString();
					        Status status = JSON.parseObject(asString, Status.class);
					        if(status.getStatus().equals("error")){
					        	out = new BufferedWriter(new FileWriter("system.log",true));
					        	out.write(asString+"----count-----"+count+"\n");
					        }
					        arrayList.clear();//把临时的集合 的数据清空
						}//最后的不满足40条的话
						if(arrayList.size()!=0){//最后的没有经过清除，的数据
							String jsonString = JSON.toJSONString(arrayList);
							HttpEntity httpEntity = new StringEntity(jsonString,"UTF-8");
					        String asString = Request.Post("http://localhost:8989/cdserver/tblEvaluationRelProblem/insert")
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
				}else {
					 pw=new PrintWriter(file);
					 Long queryMaxId = tblEvaluationDao.queryRelMaxId();
					 pw.write(String.valueOf(queryMaxId+1));//把最新的id写入文件
					 pw.flush();
					 list.clear();
				}
		} catch (Exception e) {
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
