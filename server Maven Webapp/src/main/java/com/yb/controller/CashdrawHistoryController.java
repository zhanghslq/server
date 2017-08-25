package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.CashdrawHistory;
import com.yb.entity.Status;
import com.yb.service.CashdrawHistoryService;

@Controller
@RequestMapping("/cashdrawHistory")
public class CashdrawHistoryController {
	@Resource
	private CashdrawHistoryService cashdrawHistoryService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(@RequestBody List<CashdrawHistory> cashdrawHistorys){	
		try {
			cashdrawHistoryService.insert(cashdrawHistorys);
			return new Status("success", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}	
	}
}