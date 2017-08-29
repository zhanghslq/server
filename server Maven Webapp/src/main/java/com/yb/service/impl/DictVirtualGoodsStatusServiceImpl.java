package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.DictVirtualGoodsStatusDao;
import com.yb.entity.DictVirtualGoodsStatus;
import com.yb.service.DictVirtualGoodsStatusService;
@Service
@Transactional
public class DictVirtualGoodsStatusServiceImpl implements DictVirtualGoodsStatusService{

	@Autowired
	private DictVirtualGoodsStatusDao dao;
	@Override
	public void insert(List<DictVirtualGoodsStatus> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
