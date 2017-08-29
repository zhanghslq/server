package com.yb.entity;

public class PriceLevelTypes {
	private Integer Price_Level;
	private String Level_Name;
	private String Level_Description;
	public PriceLevelTypes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PriceLevelTypes(Integer price_Level, String level_Name,
			String level_Description) {
		super();
		Price_Level = price_Level;
		Level_Name = level_Name;
		Level_Description = level_Description;
	}
	@Override
	public String toString() {
		return "PriceLevelTypes [Price_Level=" + Price_Level + ", Level_Name="
				+ Level_Name + ", Level_Description=" + Level_Description + "]";
	}
	public Integer getPrice_Level() {
		return Price_Level;
	}
	public void setPrice_Level(Integer price_Level) {
		Price_Level = price_Level;
	}
	public String getLevel_Name() {
		return Level_Name;
	}
	public void setLevel_Name(String level_Name) {
		Level_Name = level_Name;
	}
	public String getLevel_Description() {
		return Level_Description;
	}
	public void setLevel_Description(String level_Description) {
		Level_Description = level_Description;
	}
	
}
