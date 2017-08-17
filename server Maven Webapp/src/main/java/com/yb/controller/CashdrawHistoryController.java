package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.CashdrawHistory;
import com.yb.service.CashdrawHistoryService;

@Controller
@RequestMapping("/cashdrawHistory")
public class CashdrawHistoryController {
	@Resource
	private CashdrawHistoryService cashdrawHistoryService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<CashdrawHistory> cashdrawHistorys){	
				cashdrawHistoryService.insert(cashdrawHistorys);	
	}
}
