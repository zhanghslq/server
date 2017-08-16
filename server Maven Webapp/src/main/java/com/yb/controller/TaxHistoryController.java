package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.TaxHistory;
import com.yb.service.TaxHistoryService;

@Controller
@RequestMapping("/taxHistory/*")
public class TaxHistoryController {
	@Resource
	private TaxHistoryService taxHistoryService;
	
	@RequestMapping(value="/insert/{cashdrawHistory}",method=RequestMethod.POST)
	public void insert(@PathVariable String taxHistory){
		if(!taxHistory.equals("")&&taxHistory!=null){
			try {
				List<TaxHistory> list = JSON.parseArray(taxHistory, TaxHistory.class);
				taxHistoryService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
