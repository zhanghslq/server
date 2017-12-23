package com.yb.entity;

import java.math.BigDecimal;

public class DictCouponType {
	private BigDecimal id;
	private String text;
	private String english;
	private String iconurl;
	public DictCouponType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DictCouponType(BigDecimal id, String text, String english,
			String iconurl) {
		super();
		this.id = id;
		this.text = text;
		this.english = english;
		this.iconurl = iconurl;
	}
	@Override
	public String toString() {
		return "DictCardStatus [id=" + id + ", text=" + text + ", english="
				+ english + ", iconurl=" + iconurl + "]";
	}
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getIconurl() {
		return iconurl;
	}
	public void setIconurl(String iconurl) {
		this.iconurl = iconurl;
	}
	
}
