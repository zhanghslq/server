package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.CdrawtaxHistory;
import com.yb.service.CdrawtaxHistoryService;

@Controller
@RequestMapping("/cdrawtaxHistory")
public class CdrawtaxHistoryController {
	@Resource
	private CdrawtaxHistoryService cdrawtaxHistoryService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<CdrawtaxHistory>list){
		
		cdrawtaxHistoryService.insert(list);
			
	}
}