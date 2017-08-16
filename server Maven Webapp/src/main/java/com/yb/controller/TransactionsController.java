package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.Transactions;
import com.yb.service.TransactionsService;

@Controller
@RequestMapping("/transactions/*")
public class TransactionsController {
	@Resource
	private TransactionsService transactionsService;
	
	@RequestMapping(value="/insert/{transactions}",method=RequestMethod.POST)
	public void insert(@PathVariable String transactions){
		if(!transactions.equals("")&&transactions!=null){
			try {
				List<Transactions> list = JSON.parseArray(transactions, Transactions.class);
				transactionsService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
