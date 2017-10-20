package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.FutureGradePriceDao;
import com.yb.entity.FutureGradePrice;
import com.yb.service.FutureGradePriceService;

@Service
@Transactional
public class FutureGradePriceServiceImpl implements FutureGradePriceService {

	@Autowired
	private FutureGradePriceDao futureGradePriceDao;
	@Override
	public void insert(List<FutureGradePrice> list) {
		// TODO Auto-generated method stub
		futureGradePriceDao.insert(list);
	}
	
}
