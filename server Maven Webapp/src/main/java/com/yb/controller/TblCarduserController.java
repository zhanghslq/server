package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.Status;
import com.yb.entity.TblCarduser;
import com.yb.service.TblCarduserService;
import com.yb.util.DynamicDataSourceHolder;

@Controller
@RequestMapping("/tblCarduser")
@Scope("prototype")
public class TblCarduserController{
	@Resource
	private TblCarduserService tblCarduserService;
	
	@ResponseBody
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public Status insert(@RequestBody List<TblCarduser> list){
		try {
			DynamicDataSourceHolder.putDataSourceKey("master");
			tblCarduserService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
	}
}
