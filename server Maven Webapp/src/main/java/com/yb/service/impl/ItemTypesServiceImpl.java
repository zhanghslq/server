package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.ItemTypesDao;
import com.yb.entity.ItemTypes;
import com.yb.service.ItemTypesService;
@Service
@Transactional
public class ItemTypesServiceImpl implements ItemTypesService{

	@Autowired
	private ItemTypesDao dao;
	@Override
	public void insert(List<ItemTypes> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
