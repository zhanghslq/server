package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.Periods;
import com.yb.service.PeriodsService;

@Controller
@RequestMapping("/periods")
public class PeriodsController {
	@Resource
	private PeriodsService periodsService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<Periods> list){
		periodsService.insert(list);
	
	}
}
