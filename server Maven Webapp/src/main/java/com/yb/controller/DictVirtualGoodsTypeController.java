package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.DictVirtualGoodsType;
import com.yb.entity.Status;
import com.yb.service.DictVirtualGoodsTypeService;
import com.yb.util.DynamicDataSourceHolder;
@Controller
@RequestMapping("/dictVirtualGoodsType")
@Scope("prototype")
public class DictVirtualGoodsTypeController{

	@Resource
	private DictVirtualGoodsTypeService dictVirtualGoodsTypeService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(@RequestBody List<DictVirtualGoodsType> list) {
		// TODO Auto-generated method stub
		try {
			DynamicDataSourceHolder.putDataSourceKey("master");
			dictVirtualGoodsTypeService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
	}

}
