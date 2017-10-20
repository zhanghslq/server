package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.ProductsDao;
import com.yb.entity.Products;
import com.yb.service.ProductsService;

@Service
@Transactional
public class ProductsServiceImpl implements ProductsService{

	@Autowired
	private ProductsDao productsDao;
	@Override
	public void insert(List<Products> list) {
		// TODO Auto-generated method stub
		productsDao.insert(list);
	}
	
}
