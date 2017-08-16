package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.FinalisationHistory;
import com.yb.service.FinalisationHistoryService;

@Controller
@RequestMapping("/finalisationHistory/*")
public class FinalisationHistoryController {
	@Resource
	private FinalisationHistoryService finalisationHistoryService;
	
	@RequestMapping(value="/insert/{finalisationHistory}",method=RequestMethod.POST)
	public void insert(@PathVariable String finalisationHistory){
		if(finalisationHistory!=null&&!finalisationHistory.equals("")){
			try {
				List<FinalisationHistory> list = JSON.parseArray(finalisationHistory, FinalisationHistory.class);
				finalisationHistoryService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
