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

import com.yb.entity.CdrawdeptHistory;
import com.yb.entity.Status;
import com.yb.service.CdrawdeptHistoryService;
import com.yb.util.DynamicDataSourceHolder;

@Controller
@RequestMapping("/cdrawdeptHistory")
@Scope("prototype")
public class CdrawdeptHistoryController {
	@Resource
	private CdrawdeptHistoryService cdrawdeptHistoryService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(HttpServletRequest request,@RequestBody List<CdrawdeptHistory> list){
		
		try {
			DynamicDataSourceHolder.putDataSourceKey("sqlserver");
			cdrawdeptHistoryService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error",e.getMessage());
		}
			
	}
}
