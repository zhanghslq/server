package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.Eftcard;
import com.yb.entity.Status;
import com.yb.service.EftcardService;
import com.yb.util.DynamicDataSourceHolder;

@Controller
@RequestMapping("/eftcard")
@Scope("prototype")
public class EftcardController {

	@Resource
	private EftcardService eftcardService;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(@RequestBody List<Eftcard>list){
		
		try {
			DynamicDataSourceHolder.putDataSourceKey("sqlserver");
			eftcardService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}
			
		
	}
	
}
