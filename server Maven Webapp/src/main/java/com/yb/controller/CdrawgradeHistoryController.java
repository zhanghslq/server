package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.CdrawgradeHistory;
import com.yb.service.CdrawgradeHistoryService;

@Controller
@RequestMapping("/cdrawgradeHistory/*")
public class CdrawgradeHistoryController {
	@Resource
	private CdrawgradeHistoryService cdrawgradeHistoryService;
	
	@RequestMapping	(value="/insert/{cdrawgradeHistory}",method=RequestMethod.POST)
	public void insert(@PathVariable String cdrawgradeHistory){
		if(cdrawgradeHistory!=null&&!cdrawgradeHistory.equals("")){
			try {
				List<CdrawgradeHistory> list = JSON.parseArray(cdrawgradeHistory, CdrawgradeHistory.class);
				cdrawgradeHistoryService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
