package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TblShoppingcartDao;
import com.yb.entity.TblShoppingcart;
import com.yb.service.TblShoppingcartService;

@Service
@Transactional
public class TblShoppingcartServiceImpl implements TblShoppingcartService{

	@Autowired
	private TblShoppingcartDao tblShoppingcartDao;
	@Override
	public void insert(List<TblShoppingcart> list) {
		// TODO Auto-generated method stub
		tblShoppingcartDao.insert(list);
	}
	
}
