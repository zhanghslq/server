package com.yb.dao;

import java.util.List;

import com.yb.entity.CouponOilOrder;

public interface CouponOilOrderDao{
	List<CouponOilOrder> queryAll(Long id);
	Long queryMaxId();
}
