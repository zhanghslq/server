package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.DepartmentHistory;
import com.yb.service.DepartmentHistoryService;

@Controller
@RequestMapping("/departmentHistory")
public class DepartmentHistoryController {
	@Resource
	private DepartmentHistoryService departmentHistoryService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public String insert(@RequestBody List<DepartmentHistory>list){
		
		try {
			departmentHistoryService.insert(list);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
			
	}
}
