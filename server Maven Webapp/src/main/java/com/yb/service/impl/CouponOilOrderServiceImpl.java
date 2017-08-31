package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.CouponOilOrderDao;
import com.yb.entity.CouponOilOrder;
import com.yb.service.CouponOilOrderService;

@Service
@Transactional
public class CouponOilOrderServiceImpl implements CouponOilOrderService{

	@Autowired
	private CouponOilOrderDao couponOilOrderDao;
	@Override
	public void insert(List<CouponOilOrder> list) {
		// TODO Auto-generated method stub
		couponOilOrderDao.insert(list);
	}

}
