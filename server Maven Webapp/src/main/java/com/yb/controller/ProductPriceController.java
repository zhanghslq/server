package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.ProductPrice;
import com.yb.entity.Status;
import com.yb.service.ProductPriceService;
import com.yb.util.DynamicDataSourceHolder;

@Controller
@RequestMapping("/productPrice")
@Scope("prototype")
public class ProductPriceController {
	@Resource
	private ProductPriceService productPriceService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(HttpServletRequest request,@RequestBody List<ProductPrice> list){
		
		try {
			DynamicDataSourceHolder.putDataSourceKey("sqlserver");
			productPriceService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}

	}
}