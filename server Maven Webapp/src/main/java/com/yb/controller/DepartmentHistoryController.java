package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.DepartmentHistory;
import com.yb.entity.Status;
import com.yb.service.DepartmentHistoryService;
import com.yb.util.DynamicDataSourceHolder;

@Controller
@RequestMapping("/departmentHistory")
@Scope("prototype")
public class DepartmentHistoryController {
	@Resource
	private DepartmentHistoryService departmentHistoryService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(HttpServletRequest request,@RequestBody List<DepartmentHistory>list){
		
		try {
			DynamicDataSourceHolder.putDataSourceKey("sqlserver");
			departmentHistoryService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
			
	}
}
