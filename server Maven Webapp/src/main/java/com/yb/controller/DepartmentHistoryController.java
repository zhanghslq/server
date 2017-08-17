package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.DepartmentHistory;
import com.yb.service.DepartmentHistoryService;

@Controller
@RequestMapping("/departmentHistory")
public class DepartmentHistoryController {
	@Resource
	private DepartmentHistoryService departmentHistoryService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<DepartmentHistory>list){
		
				departmentHistoryService.insert(list);
			
	}
}
