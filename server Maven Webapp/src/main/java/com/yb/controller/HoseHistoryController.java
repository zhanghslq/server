package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.HoseHistory;
import com.yb.service.HoseHistoryService;

@Controller
@RequestMapping("/hoseHistory/*")
public class HoseHistoryController {
	@Resource
	private HoseHistoryService historyService;
	
	@RequestMapping(value="/insert/{hoseHistory}",method=RequestMethod.POST)
	public void insert(@PathVariable String hoseHistory){
		if(!hoseHistory.equals("")&&hoseHistory!=null){
			try {
				List<HoseHistory> list = JSON.parseArray(hoseHistory, HoseHistory.class);
				historyService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
