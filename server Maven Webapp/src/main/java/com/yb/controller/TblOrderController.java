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
import com.yb.entity.TblOrder;
import com.yb.service.TblOrderService;
import com.yb.util.DynamicDataSourceHolder;

@Controller
@RequestMapping("/tblOrder")
@Scope("prototype")
public class TblOrderController{

	@Resource
	private TblOrderService tblOrderService;

	@ResponseBody
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public Status insert(@RequestBody List<TblOrder> list) {
		
		try {
			DynamicDataSourceHolder.putDataSourceKey("master");
			tblOrderService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
		
	}
	
	
}
