package com.yb.dict.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.dict.entity.DictGoodsRuleType;
import com.yb.dict.service.DictGoodsRuleTypeService;
import com.yb.entity.Status;
@Controller
@RequestMapping("/dictGoodsRuleType")
public class DictGoodsRuleTypeController{

	@Resource
	private DictGoodsRuleTypeService dictGoodsRuleTypeService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(@RequestBody List<DictGoodsRuleType> list) {
		// TODO Auto-generated method stub
		try {
			dictGoodsRuleTypeService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
	}

}
