package com.yb.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.Heart;
import com.yb.entity.Status;
import com.yb.service.HeartService;
import com.yb.util.DynamicDataSourceHolder;

@Controller
@Scope("prototype")
@RequestMapping("/heart")
public class HeartController {
	
	@Resource
	private HeartService heartService;
	
	@RequestMapping(method=RequestMethod.POST,value="/insert")
	@ResponseBody
	public Status insert(HttpServletRequest request,@RequestBody Heart heart) {
		// TODO Auto-generated method stub
		try {
			DynamicDataSourceHolder.putDataSourceKey("result");//改变数据源
			heartService.insert(heart);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
	}
}
