package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.Eftcard;
import com.yb.service.EftcardService;

@Controller
@RequestMapping("/eftcard/*")
public class EftcardController {

	@Resource
	private EftcardService eftcardService;
	@RequestMapping(value="/insert/{eftcard}",method=RequestMethod.POST)
	public void insert(@PathVariable String eftcard){
		if(eftcard!=null&&!eftcard.equals("")){
			try {
				List<Eftcard> list = JSON.parseArray(eftcard, Eftcard.class);
				eftcardService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
