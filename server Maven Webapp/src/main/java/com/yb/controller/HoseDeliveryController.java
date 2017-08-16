package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.HoseDelivery;
import com.yb.service.HoseDeliveryService;

@Controller
@RequestMapping("/hoseDelivery/*")
public class HoseDeliveryController {
	@Resource
	private HoseDeliveryService hoseDeliveryService;
	
	@RequestMapping(value="/insert/{hoseDelivery}",method=RequestMethod.POST)
	public void insert(@PathVariable String hoseDelivery){
		if(!hoseDelivery.equals("")&&hoseDelivery!=null){
			try {
				List<HoseDelivery> list = JSON.parseArray(hoseDelivery, HoseDelivery.class);
				hoseDeliveryService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
