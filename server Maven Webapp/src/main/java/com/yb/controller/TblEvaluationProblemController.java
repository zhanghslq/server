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

import com.yb.entity.Status;
import com.yb.entity.TblEvaluationProblem;
import com.yb.service.TblEvaluationService;
import com.yb.util.DynamicDataSourceHolder;


@Controller
@RequestMapping("/tblEvaluationProblem")
@Scope("prototype")
public class TblEvaluationProblemController{
	@Resource
	private TblEvaluationService tblEvaluationService;
	
	@ResponseBody
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public Status insert(HttpServletRequest request,@RequestBody List<TblEvaluationProblem> list){
		try {
			DynamicDataSourceHolder.putDataSourceKey("oracle");
			tblEvaluationService.insertProblem(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
	}
}
