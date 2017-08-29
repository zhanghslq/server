package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.PosTerminal;
import com.yb.entity.Status;
import com.yb.service.PosTerminalService;
@Controller
@RequestMapping("/posTerminal")
public class PosTerminalController{

	@Resource
	private PosTerminalService posTerminalService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(@RequestBody List<PosTerminal> list) {
		// TODO Auto-generated method stub
		try {
			posTerminalService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
	}

}
