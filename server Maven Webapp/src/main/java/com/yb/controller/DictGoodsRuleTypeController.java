package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.DictGoodsRuleType;
import com.yb.entity.Status;
import com.yb.service.DictGoodsRuleTypeService;
import com.yb.util.DynamicDataSourceHolder;
@Controller
@RequestMapping("/dictGoodsRuleType")
@Scope("prototype")
public class DictGoodsRuleTypeController{

	@Resource
	private DictGoodsRuleTypeService dictGoodsRuleTypeService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(HttpServletRequest request,@RequestBody List<DictGoodsRuleType> list) {
		// TODO Auto-generated method stub
		try {
			DynamicDataSourceHolder.putDataSourceKey("oracle");
			dictGoodsRuleTypeService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
	}

}
