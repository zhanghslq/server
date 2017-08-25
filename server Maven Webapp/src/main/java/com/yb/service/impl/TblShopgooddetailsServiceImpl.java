package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.TblShopgoodsdetailsDao;
import com.yb.entity.TblShopgoodsdetails;
import com.yb.service.TblShopgooddetailsService;
@Service
@Transactional
public class TblShopgooddetailsServiceImpl implements TblShopgooddetailsService{

	@Autowired
	private TblShopgoodsdetailsDao tblShopgoodsdetailsDao;
	@Override
	public void insert(List<TblShopgoodsdetails> list) {
		// TODO Auto-generated method stub
		tblShopgoodsdetailsDao.insert(list);
	}
	
}
