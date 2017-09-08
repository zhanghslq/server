package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.Status;
import com.yb.entity.TankDeliveryState;
import com.yb.service.TankDeliveryStateService;
import com.yb.util.DynamicDataSourceHolder;
@Controller
@RequestMapping("/tankDeliveryState")
@Scope("prototype")
public class TankDeliveryStateController{

	@Resource
	private TankDeliveryStateService tankDeliveryStateService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(@RequestBody List<TankDeliveryState> list) {
		// TODO Auto-generated method stub
		try {
			if(list!=null&&list.size()!=0){
				String stationId = list.get(0).getStationId();
				DynamicDataSourceHolder.putDataSourceKey(stationId);
			}
			tankDeliveryStateService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
	}

}
