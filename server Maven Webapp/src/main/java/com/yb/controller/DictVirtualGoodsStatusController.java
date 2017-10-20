package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.DictVirtualGoodsStatus;
import com.yb.entity.Status;
import com.yb.service.DictVirtualGoodsStatusService;
import com.yb.util.DynamicDataSourceHolder;
@Controller
@RequestMapping("/dictVirtualGoodsStatus")
@Scope("prototype")
public class DictVirtualGoodsStatusController{

	@Resource
	private DictVirtualGoodsStatusService dictVirtualGoodsStatusService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(@RequestBody List<DictVirtualGoodsStatus> list) {
		// TODO Auto-generated method stub
		try {
			DynamicDataSourceHolder.putDataSourceKey("oracle");
			dictVirtualGoodsStatusService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
	}

}
