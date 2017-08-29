package com.yb.entity;


public class CouponOilOrder {
	private Integer coupon_oil_order_id;
	private Integer enterprise_id;
	private String out_shop_id;
	private String out_trade_no;
	private String pay_type;
	private Float order_amoun;
	private String oil_type;
	private Float oil_volume;
	private Float oil_price;
	private String pos_num;
	private String request_id;
	private String open_id;
	private String auth_level;
	private Integer good_num;
	private String coupon_id;
	private Integer created;
	private Integer updated;
	public CouponOilOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CouponOilOrder(Integer coupon_oil_order_id, Integer enterprise_id,
			String out_shop_id, String out_trade_no, String pay_type,
			Float order_amoun, String oil_type, Float oil_volume,
			Float oil_price, String pos_num, String request_id, String open_id,
			String auth_level, Integer good_num, String coupon_id,
			Integer created, Integer updated) {
		super();
		this.coupon_oil_order_id = coupon_oil_order_id;
		this.enterprise_id = enterprise_id;
		this.out_shop_id = out_shop_id;
		this.out_trade_no = out_trade_no;
		this.pay_type = pay_type;
		this.order_amoun = order_amoun;
		this.oil_type = oil_type;
		this.oil_volume = oil_volume;
		this.oil_price = oil_price;
		this.pos_num = pos_num;
		this.request_id = request_id;
		this.open_id = open_id;
		this.auth_level = auth_level;
		this.good_num = good_num;
		this.coupon_id = coupon_id;
		this.created = created;
		this.updated = updated;
	}
	@Override
	public String toString() {
		return "CouponOilOrder [coupon_oil_order_id=" + coupon_oil_order_id
				+ ", enterprise_id=" + enterprise_id + ", out_shop_id="
				+ out_shop_id + ", out_trade_no=" + out_trade_no
				+ ", pay_type=" + pay_type + ", order_amoun=" + order_amoun
				+ ", oil_type=" + oil_type + ", oil_volume=" + oil_volume
				+ ", oil_price=" + oil_price + ", pos_num=" + pos_num
				+ ", request_id=" + request_id + ", open_id=" + open_id
				+ ", auth_level=" + auth_level + ", good_num=" + good_num
				+ ", coupon_id=" + coupon_id + ", created=" + created
				+ ", updated=" + updated + "]";
	}
	public Integer getCoupon_oil_order_id() {
		return coupon_oil_order_id;
	}
	public void setCoupon_oil_order_id(Integer coupon_oil_order_id) {
		this.coupon_oil_order_id = coupon_oil_order_id;
	}
	public Integer getEnterprise_id() {
		return enterprise_id;
	}
	public void setEnterprise_id(Integer enterprise_id) {
		this.enterprise_id = enterprise_id;
	}
	public String getOut_shop_id() {
		return out_shop_id;
	}
	public void setOut_shop_id(String out_shop_id) {
		this.out_shop_id = out_shop_id;
	}
	public String getOut_trade_no() {
		return out_trade_no;
	}
	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}
	public String getPay_type() {
		return pay_type;
	}
	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}
	public Float getOrder_amoun() {
		return order_amoun;
	}
	public void setOrder_amoun(Float order_amoun) {
		this.order_amoun = order_amoun;
	}
	public String getOil_type() {
		return oil_type;
	}
	public void setOil_type(String oil_type) {
		this.oil_type = oil_type;
	}
	public Float getOil_volume() {
		return oil_volume;
	}
	public void setOil_volume(Float oil_volume) {
		this.oil_volume = oil_volume;
	}
	public Float getOil_price() {
		return oil_price;
	}
	public void setOil_price(Float oil_price) {
		this.oil_price = oil_price;
	}
	public String getPos_num() {
		return pos_num;
	}
	public void setPos_num(String pos_num) {
		this.pos_num = pos_num;
	}
	public String getRequest_id() {
		return request_id;
	}
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
	public String getOpen_id() {
		return open_id;
	}
	public void setOpen_id(String open_id) {
		this.open_id = open_id;
	}
	public String getAuth_level() {
		return auth_level;
	}
	public void setAuth_level(String auth_level) {
		this.auth_level = auth_level;
	}
	public Integer getGood_num() {
		return good_num;
	}
	public void setGood_num(Integer good_num) {
		this.good_num = good_num;
	}
	public String getCoupon_id() {
		return coupon_id;
	}
	public void setCoupon_id(String coupon_id) {
		this.coupon_id = coupon_id;
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
