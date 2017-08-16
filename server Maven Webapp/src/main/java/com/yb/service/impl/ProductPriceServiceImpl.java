package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.ProductPriceDao;
import com.yb.entity.ProductPrice;
import com.yb.service.ProductPriceService;

@Service
@Transactional
public class ProductPriceServiceImpl implements ProductPriceService{

	@Autowired
	private ProductPriceDao productPriceDao;
	@Override
	public void insert(List<ProductPrice> list) {
		// TODO Auto-generated method stub
		productPriceDao.insert(list);
	}
	
}
