package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.TransactionItems;
import com.yb.service.TransactionItemsService;

@Controller
@RequestMapping("/transactionItems")
public class TransactionItemsController {
	@Resource
	private TransactionItemsService transactionItemsService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public String insert(@RequestBody List<TransactionItems> list){
		
		try {
			transactionItemsService.insert(list);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}	
	}
}
