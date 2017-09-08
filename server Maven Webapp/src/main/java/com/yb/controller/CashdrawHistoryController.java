package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.CashdrawHistory;
import com.yb.entity.Status;
import com.yb.service.CashdrawHistoryService;
import com.yb.util.DynamicDataSourceHolder;

@Controller
@RequestMapping("/cashdrawHistory")
@Scope("prototype")
public class CashdrawHistoryController {
	@Resource
	private CashdrawHistoryService cashdrawHistoryService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(@RequestBody List<CashdrawHistory> cashdrawHistorys){	
		try {
			if(cashdrawHistorys!=null&&cashdrawHistorys.size()!=0){
				String stationId = cashdrawHistorys.get(0).getStationId();
				DynamicDataSourceHolder.putDataSourceKey(stationId);
			}
			cashdrawHistoryService.insert(cashdrawHistorys);
			return new Status("success", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}	
	}
}