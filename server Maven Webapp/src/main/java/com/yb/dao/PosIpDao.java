package com.yb.dao;

import com.yb.entity.PosIp;

public interface PosIpDao {
	PosIp queryByPosIp(String ip);
}
