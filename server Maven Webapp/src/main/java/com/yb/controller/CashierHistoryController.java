package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.CashierHistory;
import com.yb.service.CashierHistoryService;

@Controller
@RequestMapping("/cashierHistory/*")
public class CashierHistoryController {
	@Resource
	private CashierHistoryService cashierHistoryService;
	@RequestMapping(value="/insert/{cashierHistory}",method=RequestMethod.POST)
	public void insert(@PathVariable String cashierHistory){
		if(cashierHistory!=null&&!cashierHistory.equals("")){
			try {
				List<CashierHistory> list = JSON.parseArray(cashierHistory, CashierHistory.class);
				cashierHistoryService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
