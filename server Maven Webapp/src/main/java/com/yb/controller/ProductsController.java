package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.Products;
import com.yb.service.ProductsService;

@Controller
@RequestMapping("/products/*")
public class ProductsController {
	@Resource
	private ProductsService productsService;
	
	@RequestMapping(value="/insert/{products}",method=RequestMethod.POST)
	public void insert(@PathVariable String products){
		if(!products.equals("")&&products!=null){
			try {
				List<Products> list = JSON.parseArray(products, Products.class);
				productsService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
