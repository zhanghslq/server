package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.TransactionItems;
import com.yb.service.TransactionItemsService;

@Controller
@RequestMapping("/transactionItems/*")
public class TransactionItemsController {
	@Resource
	private TransactionItemsService transactionItemsService;
	
	@RequestMapping(value="/insert/{transactionItems}",method=RequestMethod.POST)
	public void insert(@PathVariable String transactionItems){
		if(!transactionItems.equals("")&&transactionItems!=null){
			try {
				List<TransactionItems> list = JSON.parseArray(transactionItems, TransactionItems.class);
				transactionItemsService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
