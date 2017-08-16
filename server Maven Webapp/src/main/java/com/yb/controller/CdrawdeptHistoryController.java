package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.yb.entity.CdrawdeptHistory;
import com.yb.service.CdrawdeptHistoryService;

@Controller
@RequestMapping("/cdrawdeptHistory/*")
public class CdrawdeptHistoryController {
	@Resource
	private CdrawdeptHistoryService cdrawdeptHistoryService;
	@RequestMapping(value="/insert/{cdrawdeptHistory}",method=RequestMethod.POST)
	public void insert(@PathVariable String cdrawdeptHistory){
		if(cdrawdeptHistory!=null&&!cdrawdeptHistory.equals("")){
			try {
				List<CdrawdeptHistory> list = JSON.parseArray(cdrawdeptHistory, CdrawdeptHistory.class);
				cdrawdeptHistoryService.insert(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
