package com.yb.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yb.dao.IpVisitDao;
import com.yb.service.UpdateService;
import com.yb.util.AddrUtil;
import com.yb.util.DynamicDataSourceHolder;
@Controller
@RequestMapping("/update")
@Scope("prototype")
public class UpdateController {
	@Resource
	private UpdateService updateService;
	@Resource
	private IpVisitDao ipVisitDao;
	@RequestMapping(value="/query",method=RequestMethod.GET)
	@ResponseBody
	public Object query(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String ipAddr1="";
		try {
			 ipAddr1= AddrUtil.getIpAddr1(request);
			DynamicDataSourceHolder.putDataSourceKey("result");
			String query = updateService.query(ipAddr1);
			if(query==null){
				DynamicDataSourceHolder.putDataSourceKey("result");
				ipVisitDao.insertUpdate(ipAddr1, 0);
				return 0;
			}else {
				DynamicDataSourceHolder.putDataSourceKey("result");
				ipVisitDao.insertUpdate(ipAddr1, Integer.valueOf(query));
				return Integer.valueOf(query);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			DynamicDataSourceHolder.putDataSourceKey("result");
			ipVisitDao.insertUpdate(ipAddr1, 0);
			return 0;
		}
	}
}
