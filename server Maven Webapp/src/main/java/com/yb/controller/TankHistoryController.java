package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.TankHistory;
import com.yb.service.TankHistoryService;

@Controller
@RequestMapping("/tankHistory")
public class TankHistoryController {
	@Resource
	private TankHistoryService tankHistoryService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<TankHistory> list){
		
		tankHistoryService.insert(list);
		
		
	}
}
