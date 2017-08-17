package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.TaxHistory;
import com.yb.service.TaxHistoryService;

@Controller
@RequestMapping("/taxHistory")
public class TaxHistoryController {
	@Resource
	private TaxHistoryService taxHistoryService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<TaxHistory> list ){
		
				taxHistoryService.insert(list);
			
		
	}
}
