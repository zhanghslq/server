package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.entity.CouponWechat;
import com.yb.service.CouponWechatService;

@Service
@Transactional
public class CouponWechatServiceImpl implements CouponWechatService{

	@Autowired
	private CouponWechatService couponWechatService;
	@Override
	public void insert(List<CouponWechat> list) {
		// TODO Auto-generated method stub
		couponWechatService.insert(list);
	}

}
