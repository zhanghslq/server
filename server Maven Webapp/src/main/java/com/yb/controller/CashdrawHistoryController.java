package com.yb.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.CashdrawHistory;
import com.yb.service.CashdrawHistoryService;

@Controller
@RequestMapping("/cashdrawHistory/*")
public class CashdrawHistoryController {
	@Resource
	private CashdrawHistoryService cashdrawHistoryService;
	
	@RequestMapping(value="/insert/{cashdrawHistory}",method=RequestMethod.POST)
	public void insert(@PathVariable String cashdrawHistory){
		if(!cashdrawHistory.equals("")&&cashdrawHistory!=null){
			try {
				List<CashdrawHistory> list = JSON.parseArray(cashdrawHistory, CashdrawHistory.class);
				cashdrawHistoryService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
