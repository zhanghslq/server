package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TblOrderDao;
import com.yb.entity.TblOrder;
import com.yb.service.TblOrderService;

@Service
@Transactional
public class TblOrderServiceImpl implements TblOrderService{

	@Autowired
	private TblOrderDao tblOrderDao;
	@Override
	public void insert(List<TblOrder> list) {
		// TODO Auto-generated method stub
		tblOrderDao.insert(list);
	}
	
}
