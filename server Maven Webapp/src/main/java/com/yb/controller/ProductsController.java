package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yb.entity.Products;
import com.yb.service.ProductsService;

@Controller
@RequestMapping("/products")
public class ProductsController {
	@Resource
	private ProductsService productsService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public void insert(@RequestBody List<Products> list){
		
				productsService.insert(list);
			
		
	}
}
