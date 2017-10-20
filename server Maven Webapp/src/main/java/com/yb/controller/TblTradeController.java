package com.yb.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.Status;
import com.yb.entity.TblTrade;
import com.yb.service.TblTradeService;
import com.yb.util.DynamicDataSourceHolder;


@Controller
@RequestMapping("/tblTrade")
@Scope("prototype")
public class TblTradeController{
	@Resource
	private TblTradeService tblTradeService;
	
	@ResponseBody
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public Status insert(@RequestBody List<TblTrade> list,HttpServletRequest request) throws IOException {
		
		try {
			DynamicDataSourceHolder.putDataSourceKey("oracle");
			tblTradeService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			String realPath = request.getSession().getServletContext().getRealPath("/");
			String[] split = realPath.split("webapps");
			String path=split[0]+"webapps";
			File file = new File(path,"file");
			if(!file.exists()){
				file.mkdirs();
			}
			File file2 = new File(file, "TblTradeController.txt");
			file2.createNewFile();
			PrintWriter printWriter = new PrintWriter(file2);
			printWriter.write("错误信息"+e.getMessage()+"\n"+"\n时间"+new Date()+"\n传入数据的条数"+list.size()+"\n传入的数据"+list.toString());
			printWriter.close();
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
		
	}
	
}
