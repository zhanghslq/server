package com.test2;

import java.util.List;
import java.util.ArrayList;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class JsonTest {
		public static void main(String[] args) {
			List<User>list=new ArrayList<User>();
			list.add(new User("2", "zhang"));
			list.add(new User("1", "li"));
			String string = JSON.toJSONString(list);
			System.out.println(string);
			Object parse = JSON.parse("");
			//JSONObject parseObject = JSONObject.parseObject(JSON.toJSONString(new User("1", "li")));
			List<User> users = JSON.parseArray(string, User.class);
			System.out.println(users);
			Object parse2 = JSONObject.parse("", 1);
		}
}