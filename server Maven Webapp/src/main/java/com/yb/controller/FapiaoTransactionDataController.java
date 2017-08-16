package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.FapiaoTransactionData;
import com.yb.service.FapiaoTransactionDataService;

@Controller
@RequestMapping("/fapiaoTransactionData/*")
public class FapiaoTransactionDataController {
	@Resource
	private FapiaoTransactionDataService fapiaoTransactionDataService;
	
	@RequestMapping(value="/insert/{fapiaoTransactionData}",method=RequestMethod.POST)
	public void insert(@PathVariable String fapiaoTransactionData){
		if(!fapiaoTransactionData.equals("")&&fapiaoTransactionData!=null){
			try {
				List<FapiaoTransactionData> list = JSON.parseArray(fapiaoTransactionData, FapiaoTransactionData.class);
				fapiaoTransactionDataService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
