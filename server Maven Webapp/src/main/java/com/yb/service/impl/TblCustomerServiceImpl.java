package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TblCustomerDao;
import com.yb.entity.TblCustomer;
import com.yb.service.TblCustomerService;
@Service
@Transactional
public class TblCustomerServiceImpl implements TblCustomerService{

	@Autowired
	private TblCustomerDao tblCustomerDao;
	@Override
	public void insert(List<TblCustomer> list) {
		// TODO Auto-generated method stub
		tblCustomerDao.insert(list);
	}
	
}
