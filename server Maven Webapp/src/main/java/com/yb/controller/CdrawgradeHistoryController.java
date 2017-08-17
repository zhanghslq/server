package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.CdrawgradeHistory;
import com.yb.service.CdrawgradeHistoryService;

@Controller
@RequestMapping("/cdrawgradeHistory")
public class CdrawgradeHistoryController {
	@Resource
	private CdrawgradeHistoryService cdrawgradeHistoryService;
	
	@RequestMapping	(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<CdrawgradeHistory>list){
		
				cdrawgradeHistoryService.insert(list);
			
	}
}
