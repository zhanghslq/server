package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.CdrawgradeHistory;
import com.yb.entity.Status;
import com.yb.service.CdrawgradeHistoryService;
import com.yb.util.DynamicDataSourceHolder;

@Controller
@RequestMapping("/cdrawgradeHistory")
@Scope("prototype")
public class CdrawgradeHistoryController {
	@Resource
	private CdrawgradeHistoryService cdrawgradeHistoryService;
	
	@RequestMapping	(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(@RequestBody List<CdrawgradeHistory>list){
		
		try {
			if(list!=null&&list.size()!=0){
				String stationId = list.get(0).getStationId();
				DynamicDataSourceHolder.putDataSourceKey(stationId);
			}
			cdrawgradeHistoryService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
	}
}
