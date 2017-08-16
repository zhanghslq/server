package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.Periods;
import com.yb.service.PeriodsService;

@Controller
@RequestMapping("/periods/*")
public class PeriodsController {
	@Resource
	private PeriodsService periodsService;
	
	@RequestMapping(value="/insert/{periods}",method=RequestMethod.POST)
	public void insert(@PathVariable String periods){
		if(!periods.equals("")&&periods!=null){
			try {
				List<Periods> list = JSON.parseArray(periods, Periods.class);
				periodsService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
