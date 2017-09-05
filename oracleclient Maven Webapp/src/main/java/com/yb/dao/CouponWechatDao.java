package com.yb.dao;

import java.util.List;

import com.yb.entity.CouponWechat;

public interface CouponWechatDao{
	List<CouponWechat> queryAll(Long id);
	Long queryMaxId();
}
