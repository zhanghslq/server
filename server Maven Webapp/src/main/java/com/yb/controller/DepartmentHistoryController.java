package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.DepartmentHistory;
import com.yb.service.DepartmentHistoryService;

@Controller
@RequestMapping("/departmentHistory/*")
public class DepartmentHistoryController {
	@Resource
	private DepartmentHistoryService departmentHistoryService;
	@RequestMapping(value="/insert/{departmentHistory}",method=RequestMethod.POST)
	public void insert(@PathVariable String departmentHistory){
		if(departmentHistory!=null&&!departmentHistory.equals("")){
			try {
				List<DepartmentHistory> list = JSON.parseArray(departmentHistory, DepartmentHistory.class);
				departmentHistoryService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
