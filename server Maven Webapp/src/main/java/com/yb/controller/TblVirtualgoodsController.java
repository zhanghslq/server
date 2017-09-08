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
import com.yb.entity.TblVirtualgoods;
import com.yb.service.TblVirtualgoodsService;
import com.yb.util.DynamicDataSourceHolder;

@Controller
@RequestMapping("/tblVirtualgoods")
@Scope("prototype")
public class TblVirtualgoodsController{
	
	@Resource
	private TblVirtualgoodsService tblVirtualgoodsService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(@RequestBody List<TblVirtualgoods> list) {
		try {
			DynamicDataSourceHolder.putDataSourceKey("master");
			tblVirtualgoodsService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
	}
}
