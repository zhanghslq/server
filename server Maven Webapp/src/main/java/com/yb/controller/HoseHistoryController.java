package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.HoseHistory;
import com.yb.service.HoseHistoryService;

@Controller
@RequestMapping("/hoseHistory")
public class HoseHistoryController {
	@Resource
	private HoseHistoryService historyService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<HoseHistory> list){
		
		historyService.insert(list);
			
	}
}