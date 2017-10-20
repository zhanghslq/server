package com.yb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yb.dao.DictGoodsRuleTypeDao;
import com.yb.entity.DictGoodsRuleType;
import com.yb.service.DictGoodsRuleTypeService;
@Service
@Transactional
public class DictGoodsRuleTypeServiceImpl implements DictGoodsRuleTypeService{

	@Autowired
	private DictGoodsRuleTypeDao dao;
	@Override
	public void insert(List<DictGoodsRuleType> list) {
		// TODO Auto-generated method stub
		dao.insert(list);
	}

}
