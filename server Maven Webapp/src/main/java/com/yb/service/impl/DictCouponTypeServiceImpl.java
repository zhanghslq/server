package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.DictCouponTypeDao;
import com.yb.entity.DictCouponType;
import com.yb.service.DictCouponTypeService;

@Service
@Transactional
public class DictCouponTypeServiceImpl implements DictCouponTypeService{

	@Autowired
	private DictCouponTypeDao dao;
	@Override
	public void insert(List<DictCouponType> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
