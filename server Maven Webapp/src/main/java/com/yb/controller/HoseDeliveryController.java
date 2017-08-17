package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.HoseDelivery;
import com.yb.service.HoseDeliveryService;

@Controller
@RequestMapping("/hoseDelivery")
public class HoseDeliveryController {
	@Resource
	private HoseDeliveryService hoseDeliveryService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<HoseDelivery>list){
		
				hoseDeliveryService.insert(list);
			
	
	}
}
