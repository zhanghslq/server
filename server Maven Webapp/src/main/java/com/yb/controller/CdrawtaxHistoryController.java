package com.yb.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.CdrawtaxHistory;
import com.yb.service.CdrawtaxHistoryService;

@Controller
@RequestMapping("/cdrawtaxHistory/*")
public class CdrawtaxHistoryController {
	@Resource
	private CdrawtaxHistoryService cdrawtaxHistoryService;
	
	@RequestMapping(value="/insert/{cdrawtaxHistory}",method=RequestMethod.POST)
	public void insert(@PathVariable String cdrawtaxHistory){
		if(cdrawtaxHistory!=null&&!cdrawtaxHistory.equals("")){
			try {
				List<CdrawtaxHistory> list = JSON.parseArray(cdrawtaxHistory, CdrawtaxHistory.class);
				cdrawtaxHistoryService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
