package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.CashdrawPeriods;
import com.yb.entity.Status;
import com.yb.service.CashdrawPeriodsService;
import com.yb.util.DynamicDataSourceHolder;


@Controller
@RequestMapping("/cashdrawPeriods")
@Scope("prototype")
public class CashdrawPeriodsController {
	
	@Resource
	private CashdrawPeriodsService cashdrawPeriodsService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(@RequestBody List<CashdrawPeriods> list){	
		try {
			if(list!=null&&list.size()!=0){
				String stationId = list.get(0).getStationId();
				DynamicDataSourceHolder.putDataSourceKey(stationId);
			}
			cashdrawPeriodsService.insert(list);
			return new Status("success", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}	
	}
}
