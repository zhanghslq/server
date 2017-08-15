package com.yb.controller;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.test2.User;

@Controller
@RequestMapping("/user/*")
public class UserController {
	//地址栏直接访问的话是get请求，不支持别的
	@RequestMapping(value="/insert/{user}",method=RequestMethod.GET)
	
	public void insert(@PathVariable String user,HttpServletRequest request){
		/*List<User> list = JSON.parseArray(user, User.class);*/
		Object parse = JSON.parse("");
		System.out.println(user);
		
	}
}
