package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.CdrawtaxHistory;
import com.yb.entity.Status;
import com.yb.service.CdrawtaxHistoryService;
import com.yb.util.DynamicDataSourceHolder;

@Controller
@RequestMapping("/cdrawtaxHistory")
@Scope("prototype")
public class CdrawtaxHistoryController {
	@Resource
	private CdrawtaxHistoryService cdrawtaxHistoryService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(@RequestBody List<CdrawtaxHistory>list){
		
		try {
			DynamicDataSourceHolder.putDataSourceKey("sqlserver");
			cdrawtaxHistoryService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error",e.getMessage());
		}
	}
}