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

import com.yb.entity.PosTerminal;
import com.yb.entity.Status;
import com.yb.service.PosTerminalService;
import com.yb.util.DynamicDataSourceHolder;
@Controller
@RequestMapping("/posTerminal")
@Scope("prototype")
public class PosTerminalController{

	@Resource
	private PosTerminalService posTerminalService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(HttpServletRequest request,@RequestBody List<PosTerminal> list) {
		// TODO Auto-generated method stub
		try {
			DynamicDataSourceHolder.putDataSourceKey("sqlserver");
			posTerminalService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
	}

}
