package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.Status;
import com.yb.entity.TblDifferencestrade;
import com.yb.service.TblDifferencestradeService;
import com.yb.util.DynamicDataSourceHolder;

@Controller
@RequestMapping("/tblDifferencestrade")
@Scope("prototype")
public class TblDifferencestradeController{
	@Resource
	private TblDifferencestradeService tblDifferencestradeService;
	
	@ResponseBody
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public Status insert(@RequestBody List<TblDifferencestrade> list){
		
		try {
			DynamicDataSourceHolder.putDataSourceKey("oracle");
			tblDifferencestradeService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
	}
}
