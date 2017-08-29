package com.yb.entity;

import java.math.BigDecimal;

public class Finalisations {
	private Integer mop_id;
	private String mop_name;
	private Integer price_level;
	private Integer mop_cash_draw;
	private BigDecimal mop_safedrop_level;
	private BigDecimal mop_safedrop_alarm;
	private Integer mop_tender;
	private Integer mop_partial_tender;
	private Integer mop_change;
	private Integer mop_keynumber;
	private String mop_keylabel;
	private String mop_final_msg_l1;
	private String mop_final_msg_l2;
	private String mop_final_msg_l3;
	private Integer mop_type;
	private Integer mop_drystock_disc;
	private Integer mop_wetstock_disc;
	private Integer eod_Summary;
	private Integer refunds_allowed;
	private Integer mop_receipt_type;
	private Integer awarding_allowed;
	private String mop_fiscal_group_name;
	private Integer mop_fiscal_group_number;
	private Integer allow_wetstock_sales;
	private Integer allow_drystock_sales;
	private Integer max_fuel_deliveries_allowed;
	private Integer eft_terminal_type;
	public Finalisations() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Finalisations(Integer mop_id, String mop_name, Integer price_level,
			Integer mop_cash_draw, BigDecimal mop_safedrop_level,
			BigDecimal mop_safedrop_alarm, Integer mop_tender,
			Integer mop_partial_tender, Integer mop_change,
			Integer mop_keynumber, String mop_keylabel,
			String mop_final_msg_l1, String mop_final_msg_l2,
			String mop_final_msg_l3, Integer mop_type,
			Integer mop_drystock_disc, Integer mop_wetstock_disc,
			Integer eod_Summary, Integer refunds_allowed,
			Integer mop_receipt_type, Integer awarding_allowed,
			String mop_fiscal_group_name, Integer mop_fiscal_group_number,
			Integer allow_wetstock_sales, Integer allow_drystock_sales,
			Integer max_fuel_deliveries_allowed, Integer eft_terminal_type) {
		super();
		this.mop_id = mop_id;
		this.mop_name = mop_name;
		this.price_level = price_level;
		this.mop_cash_draw = mop_cash_draw;
		this.mop_safedrop_level = mop_safedrop_level;
		this.mop_safedrop_alarm = mop_safedrop_alarm;
		this.mop_tender = mop_tender;
		this.mop_partial_tender = mop_partial_tender;
		this.mop_change = mop_change;
		this.mop_keynumber = mop_keynumber;
		this.mop_keylabel = mop_keylabel;
		this.mop_final_msg_l1 = mop_final_msg_l1;
		this.mop_final_msg_l2 = mop_final_msg_l2;
		this.mop_final_msg_l3 = mop_final_msg_l3;
		this.mop_type = mop_type;
		this.mop_drystock_disc = mop_drystock_disc;
		this.mop_wetstock_disc = mop_wetstock_disc;
		this.eod_Summary = eod_Summary;
		this.refunds_allowed = refunds_allowed;
		this.mop_receipt_type = mop_receipt_type;
		this.awarding_allowed = awarding_allowed;
		this.mop_fiscal_group_name = mop_fiscal_group_name;
		this.mop_fiscal_group_number = mop_fiscal_group_number;
		this.allow_wetstock_sales = allow_wetstock_sales;
		this.allow_drystock_sales = allow_drystock_sales;
		this.max_fuel_deliveries_allowed = max_fuel_deliveries_allowed;
		this.eft_terminal_type = eft_terminal_type;
	}
	@Override
	public String toString() {
		return "Finalisations [mop_id=" + mop_id + ", mop_name=" + mop_name
				+ ", price_level=" + price_level + ", mop_cash_draw="
				+ mop_cash_draw + ", mop_safedrop_level=" + mop_safedrop_level
				+ ", mop_safedrop_alarm=" + mop_safedrop_alarm
				+ ", mop_tender=" + mop_tender + ", mop_partial_tender="
				+ mop_partial_tender + ", mop_change=" + mop_change
				+ ", mop_keynumber=" + mop_keynumber + ", mop_keylabel="
				+ mop_keylabel + ", mop_final_msg_l1=" + mop_final_msg_l1
				+ ", mop_final_msg_l2=" + mop_final_msg_l2
				+ ", mop_final_msg_l3=" + mop_final_msg_l3 + ", mop_type="
				+ mop_type + ", mop_drystock_disc=" + mop_drystock_disc
				+ ", mop_wetstock_disc=" + mop_wetstock_disc + ", eod_Summary="
				+ eod_Summary + ", refunds_allowed=" + refunds_allowed
				+ ", mop_receipt_type=" + mop_receipt_type
				+ ", awarding_allowed=" + awarding_allowed
				+ ", mop_fiscal_group_name=" + mop_fiscal_group_name
				+ ", mop_fiscal_group_number=" + mop_fiscal_group_number
				+ ", allow_wetstock_sales=" + allow_wetstock_sales
				+ ", allow_drystock_sales=" + allow_drystock_sales
				+ ", max_fuel_deliveries_allowed="
				+ max_fuel_deliveries_allowed + ", eft_terminal_type="
				+ eft_terminal_type + "]";
	}
	public Integer getMop_id() {
		return mop_id;
	}
	public void setMop_id(Integer mop_id) {
		this.mop_id = mop_id;
	}
	public String getMop_name() {
		return mop_name;
	}
	public void setMop_name(String mop_name) {
		this.mop_name = mop_name;
	}
	public Integer getPrice_level() {
		return price_level;
	}
	public void setPrice_level(Integer price_level) {
		this.price_level = price_level;
	}
	public Integer getMop_cash_draw() {
		return mop_cash_draw;
	}
	public void setMop_cash_draw(Integer mop_cash_draw) {
		this.mop_cash_draw = mop_cash_draw;
	}
	public BigDecimal getMop_safedrop_level() {
		return mop_safedrop_level;
	}
	public void setMop_safedrop_level(BigDecimal mop_safedrop_level) {
		this.mop_safedrop_level = mop_safedrop_level;
	}
	public BigDecimal getMop_safedrop_alarm() {
		return mop_safedrop_alarm;
	}
	public void setMop_safedrop_alarm(BigDecimal mop_safedrop_alarm) {
		this.mop_safedrop_alarm = mop_safedrop_alarm;
	}
	public Integer getMop_tender() {
		return mop_tender;
	}
	public void setMop_tender(Integer mop_tender) {
		this.mop_tender = mop_tender;
	}
	public Integer getMop_partial_tender() {
		return mop_partial_tender;
	}
	public void setMop_partial_tender(Integer mop_partial_tender) {
		this.mop_partial_tender = mop_partial_tender;
	}
	public Integer getMop_change() {
		return mop_change;
	}
	public void setMop_change(Integer mop_change) {
		this.mop_change = mop_change;
	}
	public Integer getMop_keynumber() {
		return mop_keynumber;
	}
	public void setMop_keynumber(Integer mop_keynumber) {
		this.mop_keynumber = mop_keynumber;
	}
	public String getMop_keylabel() {
		return mop_keylabel;
	}
	public void setMop_keylabel(String mop_keylabel) {
		this.mop_keylabel = mop_keylabel;
	}
	public String getMop_final_msg_l1() {
		return mop_final_msg_l1;
	}
	public void setMop_final_msg_l1(String mop_final_msg_l1) {
		this.mop_final_msg_l1 = mop_final_msg_l1;
	}
	public String getMop_final_msg_l2() {
		return mop_final_msg_l2;
	}
	public void setMop_final_msg_l2(String mop_final_msg_l2) {
		this.mop_final_msg_l2 = mop_final_msg_l2;
	}
	public String getMop_final_msg_l3() {
		return mop_final_msg_l3;
	}
	public void setMop_final_msg_l3(String mop_final_msg_l3) {
		this.mop_final_msg_l3 = mop_final_msg_l3;
	}
	public Integer getMop_type() {
		return mop_type;
	}
	public void setMop_type(Integer mop_type) {
		this.mop_type = mop_type;
	}
	public Integer getMop_drystock_disc() {
		return mop_drystock_disc;
	}
	public void setMop_drystock_disc(Integer mop_drystock_disc) {
		this.mop_drystock_disc = mop_drystock_disc;
	}
	public Integer getMop_wetstock_disc() {
		return mop_wetstock_disc;
	}
	public void setMop_wetstock_disc(Integer mop_wetstock_disc) {
		this.mop_wetstock_disc = mop_wetstock_disc;
	}
	public Integer getEod_Summary() {
		return eod_Summary;
	}
	public void setEod_Summary(Integer eod_Summary) {
		this.eod_Summary = eod_Summary;
	}
	public Integer getRefunds_allowed() {
		return refunds_allowed;
	}
	public void setRefunds_allowed(Integer refunds_allowed) {
		this.refunds_allowed = refunds_allowed;
	}
	public Integer getMop_receipt_type() {
		return mop_receipt_type;
	}
	public void setMop_receipt_type(Integer mop_receipt_type) {
		this.mop_receipt_type = mop_receipt_type;
	}
	public Integer getAwarding_allowed() {
		return awarding_allowed;
	}
	public void setAwarding_allowed(Integer awarding_allowed) {
		this.awarding_allowed = awarding_allowed;
	}
	public String getMop_fiscal_group_name() {
		return mop_fiscal_group_name;
	}
	public void setMop_fiscal_group_name(String mop_fiscal_group_name) {
		this.mop_fiscal_group_name = mop_fiscal_group_name;
	}
	public Integer getMop_fiscal_group_number() {
		return mop_fiscal_group_number;
	}
	public void setMop_fiscal_group_number(Integer mop_fiscal_group_number) {
		this.mop_fiscal_group_number = mop_fiscal_group_number;
	}
	public Integer getAllow_wetstock_sales() {
		return allow_wetstock_sales;
	}
	public void setAllow_wetstock_sales(Integer allow_wetstock_sales) {
		this.allow_wetstock_sales = allow_wetstock_sales;
	}
	public Integer getAllow_drystock_sales() {
		return allow_drystock_sales;
	}
	public void setAllow_drystock_sales(Integer allow_drystock_sales) {
		this.allow_drystock_sales = allow_drystock_sales;
	}
	public Integer getMax_fuel_deliveries_allowed() {
		return max_fuel_deliveries_allowed;
	}
	public void setMax_fuel_deliveries_allowed(Integer max_fuel_deliveries_allowed) {
		this.max_fuel_deliveries_allowed = max_fuel_deliveries_allowed;
	}
	public Integer getEft_terminal_type() {
		return eft_terminal_type;
	}
	public void setEft_terminal_type(Integer eft_terminal_type) {
		this.eft_terminal_type = eft_terminal_type;
	}

	
}
