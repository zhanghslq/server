package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.FutureGradePrice;
import com.yb.service.FutureGradePriceService;

@Controller
@RequestMapping("/futureGradePrice")
public class FutureGradePriceController {
	@Resource
	private FutureGradePriceService futureGradePriceService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<FutureGradePrice> list){
		
		futureGradePriceService.insert(list);
			
	}
}