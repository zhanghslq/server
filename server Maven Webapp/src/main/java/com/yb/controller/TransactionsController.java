package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.Transactions;
import com.yb.service.TransactionsService;

@Controller
@RequestMapping("/transactions")
public class TransactionsController {
	@Resource
	private TransactionsService transactionsService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<Transactions> list){
		
		transactionsService.insert(list);
			
	}
}
