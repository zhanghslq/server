package com.test2;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class TestJson {
	public static void main(String[] args) {
		List<User> array= new ArrayList<User>();
		array.add(new User("1", "уехЩ"));
		array.add(new User("2", "lisi"));
		
		String jsonString = JSONObject.toJSONString(array);
		System.out.println(jsonString);
	}
}
