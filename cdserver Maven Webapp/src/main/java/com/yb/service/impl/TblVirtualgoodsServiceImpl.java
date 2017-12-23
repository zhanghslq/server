package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TblVirtualgoodsDao;
import com.yb.entity.TblVirtualgoods;
import com.yb.service.TblVirtualgoodsService;

@Service
@Transactional
public class TblVirtualgoodsServiceImpl implements TblVirtualgoodsService{

	@Autowired
	private TblVirtualgoodsDao tblVirtualgoodsDao;
	@Override
	public void insert(List<TblVirtualgoods> list) {
		// TODO Auto-generated method stub
		tblVirtualgoodsDao.insert(list);
	}
	
}
