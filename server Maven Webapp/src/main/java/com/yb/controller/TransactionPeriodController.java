package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.TransactionPeriod;
import com.yb.service.TransactionPeriodService;

@Controller
@RequestMapping("/transactionPeriod")
public class TransactionPeriodController {
	@Resource
	private TransactionPeriodService transactionPeriodService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<TransactionPeriod> list){
		
		transactionPeriodService.insert(list);
		
	}
}
