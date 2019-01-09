package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TblTradeDao;
import com.yb.entity.TblTrade;
import com.yb.service.TblTradeService;

@Service
@Transactional
public class TblTradeServiceImpl implements TblTradeService{

	@Autowired
	private TblTradeDao tblTradeDao;

	public void insert(List<TblTrade> list) {
		// TODO Auto-generated method stub
		tblTradeDao.insert(list);
	}
	
}
