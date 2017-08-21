package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.TransactionItemsCoupon;
import com.yb.service.TransactionItemsCouponService;

@Controller
@RequestMapping("/transactionItemsCoupon")
public class TransactionItemsCouponController {
	@Resource
	private TransactionItemsCouponService transactionItemsCouponService; 
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public String insert(@RequestBody List<TransactionItemsCoupon> list){
		
		try {
			transactionItemsCouponService.insert(list);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}	
	}
}
