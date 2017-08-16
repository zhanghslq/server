package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.CashdrawPeriods;
import com.yb.service.CashdrawPeriodsService;


@Controller
@RequestMapping("/cashdrawPeriods/*")
public class CashdrawPeriodsController {
	
	@Resource
	private CashdrawPeriodsService cashdrawPeriodsService;
	@RequestMapping(value="/insert/{cashdrawPeriods}",method=RequestMethod.POST)
	public void insert(@PathVariable String cashdrawPeriods){
		if(cashdrawPeriods.equals("")&&cashdrawPeriods!=null){
			try {
				List<CashdrawPeriods> list = JSON.parseArray(cashdrawPeriods, CashdrawPeriods.class);
				cashdrawPeriodsService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
