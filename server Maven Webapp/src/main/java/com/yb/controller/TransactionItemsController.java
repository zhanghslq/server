package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.TransactionItems;
import com.yb.service.TransactionItemsService;

@Controller
@RequestMapping("/transactionItems")
public class TransactionItemsController {
	@Resource
	private TransactionItemsService transactionItemsService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<TransactionItems> list){
		
				transactionItemsService.insert(list);
			
	}
}
