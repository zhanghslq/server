package com.yb.entity;

import java.util.Date;

public class CouponWechat {
	private Integer coupon_wechat_id;
	private Integer enterprise_id;
	private String nickname;
	private String nickname64;
	private String potrait;
	private String open_id;
	private String phone;
	private Date birthday;
	private String auth_level;
	private Integer created;
	private Integer updated;
	public CouponWechat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CouponWechat(Integer coupon_wechat_id, Integer enterprise_id,
			String nickname, String nickname64, String potrait, String open_id,
			String phone, Date birthday, String auth_level, Integer created,
			Integer updated) {
		super();
		this.coupon_wechat_id = coupon_wechat_id;
		this.enterprise_id = enterprise_id;
		this.nickname = nickname;
		this.nickname64 = nickname64;
		this.potrait = potrait;
		this.open_id = open_id;
		this.phone = phone;
		this.birthday = birthday;
		this.auth_level = auth_level;
		this.created = created;
		this.updated = updated;
	}
	@Override
	public String toString() {
		return "CouponWechat [coupon_wechat_id=" + coupon_wechat_id
				+ ", enterprise_id=" + enterprise_id + ", nickname=" + nickname
				+ ", nickname64=" + nickname64 + ", potrait=" + potrait
				+ ", open_id=" + open_id + ", phone=" + phone + ", birthday="
				+ birthday + ", auth_level=" + auth_level + ", created="
				+ created + ", updated=" + updated + "]";
	}
	public Integer getCoupon_wechat_id() {
		return coupon_wechat_id;
	}
	public void setCoupon_wechat_id(Integer coupon_wechat_id) {
		this.coupon_wechat_id = coupon_wechat_id;
	}
	public Integer getEnterprise_id() {
		return enterprise_id;
	}
	public void setEnterprise_id(Integer enterprise_id) {
		this.enterprise_id = enterprise_id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getNickname64() {
		return nickname64;
	}
	public void setNickname64(String nickname64) {
		this.nickname64 = nickname64;
	}
	public String getPotrait() {
		return potrait;
	}
	public void setPotrait(String potrait) {
		this.potrait = potrait;
	}
	public String getOpen_id() {
		return open_id;
	}
	public void setOpen_id(String open_id) {
		this.open_id = open_id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAuth_level() {
		return auth_level;
	}
	public void setAuth_level(String auth_level) {
		this.auth_level = auth_level;
	}
	public Integer getCreated() {
		return created;
	}
	public void setCreated(Integer created) {
		this.created = created;
	}
	public Integer getUpdated() {
		return updated;
	}
	public void setUpdated(Integer updated) {
		this.updated = updated;
	}
	
}
