package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.TransactionPeriod;
import com.yb.service.TransactionPeriodService;

@Controller
@RequestMapping("/transactionPeriod/*")
public class TransactionPeriodController {
	@Resource
	private TransactionPeriodService transactionPeriodService;
	
	@RequestMapping(value="/insert/{transactionPeriod}",method=RequestMethod.POST)
	public void insert(@PathVariable String transactionPeriod){
		if(!transactionPeriod.equals("")&&transactionPeriod!=null){
			try {
				List<TransactionPeriod> list = JSON.parseArray(transactionPeriod, TransactionPeriod.class);
				transactionPeriodService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
