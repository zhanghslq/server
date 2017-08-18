package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.FapiaoTransactionData;
import com.yb.service.FapiaoTransactionDataService;

@Controller
@RequestMapping("/fapiaoTransactionData")
public class FapiaoTransactionDataController {
	@Resource
	private FapiaoTransactionDataService fapiaoTransactionDataService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<FapiaoTransactionData>list){
		
		fapiaoTransactionDataService.insert(list);
			
		
	}
}
