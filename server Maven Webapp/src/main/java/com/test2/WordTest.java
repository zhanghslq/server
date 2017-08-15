package com.test2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class WordTest {
	public static void main(String[] args) {
		
      /*  // 转换方法2
        List<User> list2 = JSONArray.toList("", new User(), new JsonConfig());//参数1为要转换的JSONArray数据，参�?为要转换的目标数据，即List盛装的数�?
        User user= (User) list2.get(0);
        System.out.println(user.getName());*/
		ArrayList<User> list = new ArrayList<User>();
		list.add(new User("1", "zhang") );
		list.add(new User("2", "li") );
		String jsonString = JSONObject.toJSONString(list);
		List<User> users = (List<User>) JSONObject.parse(jsonString);
		System.out.println(users);
		Object parse = JSONObject.parse(JSONObject.toJSONString(new User("3", "wang")));
		System.out.println(parse);
		
		System.out.println("---------------------------");
		System.out.println(JSONObject.toJSONString(new User("3", "wang")));
		
		
		JSONObject parseObject = JSONObject.parseObject(JSONObject.toJSONString(new User("3", "wang")));
		
		
		System.out.println(parseObject);
		
		
	}
}