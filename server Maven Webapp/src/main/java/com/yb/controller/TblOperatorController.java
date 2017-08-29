package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.Status;
import com.yb.entity.TblOperator;
import com.yb.service.TblOperatorService;
@Controller
@RequestMapping("/tblOperator")
public class TblOperatorController{

	@Resource
	private TblOperatorService tblOperatorService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(@RequestBody List<TblOperator> list) {
		// TODO Auto-generated method stub
		try {
			tblOperatorService.insert(list);
			return new Status("successs");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error",e.getMessage());
		}
	}

}
