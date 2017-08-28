package com.yb.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dict.dao.ItemTypesDao;
import com.yb.dict.entity.ItemTypes;
import com.yb.dict.service.ItemTypesService;
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
