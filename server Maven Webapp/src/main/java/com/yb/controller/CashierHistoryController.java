package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.CashierHistory;
import com.yb.service.CashierHistoryService;

@Controller
@RequestMapping("/cashierHistory")
public class CashierHistoryController {
	@Resource
	private CashierHistoryService cashierHistoryService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<CashierHistory>list){
		
				cashierHistoryService.insert(list);
			
	}
}
