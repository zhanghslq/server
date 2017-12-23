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
import com.yb.entity.TblAccount;
import com.yb.service.TblAccountService;
import com.yb.util.DynamicDataSourceHolder;

@Controller
@RequestMapping("/tblAccount")
@Scope("prototype")
public class TblAccountController{
	@Resource
	private TblAccountService tblAccountService;
	
	@ResponseBody
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public Status insert(HttpServletRequest request,@RequestBody List<TblAccount> list){
		
		try {
			DynamicDataSourceHolder.putDataSourceKey("oracle");
			tblAccountService.insert(list);
			
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
		
	}
	
}
