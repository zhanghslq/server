package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.TankHistory;
import com.yb.service.TankHistoryService;

@Controller
@RequestMapping("/tankHistory/*")
public class TankHistoryController {
	@Resource
	private TankHistoryService tankHistoryService;
	
	@RequestMapping(value="/insert/{tankHistory}",method=RequestMethod.POST)
	public void insert(@PathVariable String tankHistory){
		if(!tankHistory.equals("")&&tankHistory!=null){
			try {
				List<TankHistory> list = JSON.parseArray(tankHistory, TankHistory.class);
				tankHistoryService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
