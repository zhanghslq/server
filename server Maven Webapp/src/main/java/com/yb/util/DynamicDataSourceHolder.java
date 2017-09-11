package com.yb.util;

public class DynamicDataSourceHolder {
	private static ThreadLocal<String> holder = new ThreadLocal<String>();
	public static void putDataSourceKey(String key) {
		holder.set(key);
	}
	public static String getDataSourceKey() {
        return holder.get();
    }
	public static void remove(){
        holder.remove();
    }
}
