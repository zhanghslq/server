package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.DictTradeStatus;
import com.yb.entity.Status;
import com.yb.service.DictTradeStatusService;
@Controller
@RequestMapping("/dictTradeStatus")
public class DictTradeStatusController{

	@Resource
	private DictTradeStatusService dictTradeStatusService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(@RequestBody List<DictTradeStatus> list) {
		// TODO Auto-generated method stub
		try {
			dictTradeStatusService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
	}

}