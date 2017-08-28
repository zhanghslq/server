package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.DictCouponTypeDao;
import com.yb.dict.entity.DictCouponType;
import com.yb.dict.service.DictCouponTypeService;

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
