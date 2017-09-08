package com.yb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.entity.Status;
import com.yb.entity.TransactionItemsOil;
import com.yb.service.TransactionItemsOilService;
import com.yb.util.DynamicDataSourceHolder;

@Controller
@RequestMapping("/transactionItemsOil")
@Scope("prototype")
public class TransactionItemsOilController {
	@Resource
	private TransactionItemsOilService transactionItemsOilService;
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Status insert(@RequestBody List<TransactionItemsOil> list){
		try {
			if(list!=null&&list.size()!=0){
				String stationId = list.get(0).getStationId();
				DynamicDataSourceHolder.putDataSourceKey(stationId);
			}
			transactionItemsOilService.insert(list);
			return new Status("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Status("error", e.getMessage());
		}	
	}
}
