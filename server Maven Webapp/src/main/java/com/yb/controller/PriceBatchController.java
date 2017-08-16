package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.PriceBatch;
import com.yb.service.PriceBatchService;

@Controller
@RequestMapping("/priceBatch/*")
public class PriceBatchController {
	@Resource
	private PriceBatchService priceBatchService;
	
	@RequestMapping(value="/insert/{priceBatch}",method=RequestMethod.POST)
	public void insert(@PathVariable String priceBatch){
		if(!priceBatch.equals("")&&priceBatch!=null){
			try {
				List<PriceBatch> list = JSON.parseArray(priceBatch, PriceBatch.class);
				priceBatchService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
