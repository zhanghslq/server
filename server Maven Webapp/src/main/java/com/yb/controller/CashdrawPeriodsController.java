package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.CashdrawPeriods;
import com.yb.service.CashdrawPeriodsService;


@Controller
@RequestMapping("/cashdrawPeriods")
public class CashdrawPeriodsController {
	
	@Resource
	private CashdrawPeriodsService cashdrawPeriodsService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<CashdrawPeriods> list){	
				cashdrawPeriodsService.insert(list);	
	}
}
