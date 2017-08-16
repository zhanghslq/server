package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.FutureGradePrice;
import com.yb.service.FutureGradePriceService;

@Controller
@RequestMapping("/futureGradePrice/*")
public class FutureGradePriceController {
	@Resource
	private FutureGradePriceService futureGradePriceService;
	
	@RequestMapping(value="/insert/{futureGradePrice}",method=RequestMethod.POST)
	public void insert(@PathVariable String futureGradePrice){
		if(!futureGradePrice.equals("")&&futureGradePrice!=null){
			try {
				List<FutureGradePrice> list = JSON.parseArray(futureGradePrice, FutureGradePrice.class);
				futureGradePriceService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
