package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.DictDiffTypeDao;
import com.yb.entity.DictDiffType;
import com.yb.service.DictDiffTypeService;
@Service
@Transactional
public class DictDiffTypeServiceImpl  implements DictDiffTypeService {

	@Autowired
	private DictDiffTypeDao dao;
	@Override
	public void insert(List<DictDiffType> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
