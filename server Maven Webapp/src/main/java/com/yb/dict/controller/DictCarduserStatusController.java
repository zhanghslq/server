package com.yb.dict.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.dict.entity.DictCarduserStatus;
import com.yb.dict.service.DictCarduserStatusService;
import com.yb.entity.Status;
@Controller
@RequestMapping("/dictCarduserStatus")
public class DictCarduserStatusController{

	@Resource
	private DictCarduserStatusService dictCarduserStatusService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(@RequestBody List<DictCarduserStatus> list) {
		// TODO Auto-generated method stub
		try {
			dictCarduserStatusService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
	}

}
