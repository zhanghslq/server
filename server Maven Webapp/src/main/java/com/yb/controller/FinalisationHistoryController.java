package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.FinalisationHistory;
import com.yb.service.FinalisationHistoryService;

@Controller
@RequestMapping("/finalisationHistory")
public class FinalisationHistoryController {
	@Resource
	private FinalisationHistoryService finalisationHistoryService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<FinalisationHistory>list){
		
				finalisationHistoryService.insert(list);
			
	}
}
