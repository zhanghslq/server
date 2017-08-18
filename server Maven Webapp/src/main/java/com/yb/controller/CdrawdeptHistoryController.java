package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.CdrawdeptHistory;
import com.yb.service.CdrawdeptHistoryService;

@Controller
@RequestMapping("/cdrawdeptHistory/*")
public class CdrawdeptHistoryController {
	@Resource
	private CdrawdeptHistoryService cdrawdeptHistoryService;
	@RequestMapping(value="/insert/{cdrawdeptHistory}",method=RequestMethod.POST)
	public void insert(@RequestBody List<CdrawdeptHistory> list){
		
		cdrawdeptHistoryService.insert(list);
			
	}
}
