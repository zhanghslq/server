package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.ProductPrice;
import com.yb.service.ProductPriceService;

@Controller
@RequestMapping("/productPrice/*")
public class ProductPriceController {
	@Resource
	private ProductPriceService productPriceService;
	
	@RequestMapping(value="/insert/{productPrice}",method=RequestMethod.POST)
	public void insert(@PathVariable String productPrice){
		if(!productPrice.equals("")&&productPrice!=null){
			try {
				List<ProductPrice> list = JSON.parseArray(productPrice, ProductPrice.class);
				productPriceService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
