package com.yb.dict.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.dict.entity.PriceLevelTypes;
import com.yb.dict.service.PriceLevelTypesService;
import com.yb.entity.Status;

@Controller
@RequestMapping("/priceLevelTypes")
public class PriceLevelTypesController{

	@Resource
	private PriceLevelTypesService priceLevelTypesService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(@RequestBody List<PriceLevelTypes> list) {
		// TODO Auto-generated method stub
		try {
			priceLevelTypesService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
	}

}
