package com.yb.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MyDataBase extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		return DynamicDataSourceHolder.getDataSourceKey();//获取的结果，动态的切换数据源
	}
}