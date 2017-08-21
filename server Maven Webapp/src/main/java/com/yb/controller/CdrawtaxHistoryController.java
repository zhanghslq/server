package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.CdrawtaxHistory;
import com.yb.service.CdrawtaxHistoryService;

@Controller
@RequestMapping("/cdrawtaxHistory")
public class CdrawtaxHistoryController {
	@Resource
	private CdrawtaxHistoryService cdrawtaxHistoryService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public String insert(@RequestBody List<CdrawtaxHistory>list){
		
		try {
			cdrawtaxHistoryService.insert(list);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
			
	}
}