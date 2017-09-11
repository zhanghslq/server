package com.yb.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MyDataBase extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		String dataSourceKey = DynamicDataSourceHolder.getDataSourceKey();
		DynamicDataSourceHolder.remove();
		return dataSourceKey;//获取的结果，动态的切换数据源
	}
}