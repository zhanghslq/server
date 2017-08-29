package com.yb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class TblCustomer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal customerId;
	private BigDecimal version;
	private Date birthday;
	private String phone;
	private String uniqueidno;
	private BigDecimal degree;
	private BigDecimal buildfilestationId;
	private BigDecimal isyue;
	private BigDecimal age;
	private String name;
	private BigDecimal gender;
	private BigDecimal industry;
	private BigDecimal carPrice;
	private BigDecimal occupation;
	private BigDecimal province;
	private String zipcode;
	private BigDecimal customerTypes;
	private Date recordtime;
	private BigDecimal photoId;
	private BigDecimal IndoType;
	private BigDecimal blood;
	private String mobilephone;
	private String email;
	private String address;
	private BigDecimal iscz;
	private BigDecimal msgsource;
	private String notes;
	private String idno;
	private BigDecimal carNature;
	private String openid;
	public TblCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblCustomer(BigDecimal customerId, BigDecimal version,
			Date birthday, String phone, String uniqueidno, BigDecimal degree,
			BigDecimal buildfilestationId, BigDecimal isyue, BigDecimal age,
			String name, BigDecimal gender, BigDecimal industry,
			BigDecimal carPrice, BigDecimal occupation, BigDecimal province,
			String zipcode, BigDecimal customerTypes, Date recordtime,
			BigDecimal photoId, BigDecimal indoType, BigDecimal blood,
			String mobilephone, String email, String address, BigDecimal iscz,
			BigDecimal msgsource, String notes, String idno,
			BigDecimal carNature, String openid) {
		super();
		this.customerId = customerId;
		this.version = version;
		this.birthday = birthday;
		this.phone = phone;
		this.uniqueidno = uniqueidno;
		this.degree = degree;
		this.buildfilestationId = buildfilestationId;
		this.isyue = isyue;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.industry = industry;
		this.carPrice = carPrice;
		this.occupation = occupation;
		this.province = province;
		this.zipcode = zipcode;
		this.customerTypes = customerTypes;
		this.recordtime = recordtime;
		this.photoId = photoId;
		IndoType = indoType;
		this.blood = blood;
		this.mobilephone = mobilephone;
		this.email = email;
		this.address = address;
		this.iscz = iscz;
		this.msgsource = msgsource;
		this.notes = notes;
		this.idno = idno;
		this.carNature = carNature;
		this.openid = openid;
	}
	@Override
	public String toString() {
		return "TblCustomer [customerId=" + customerId + ", version=" + version
				+ ", birthday=" + birthday + ", phone=" + phone
				+ ", uniqueidno=" + uniqueidno + ", degree=" + degree
				+ ", buildfilestationId=" + buildfilestationId + ", isyue="
				+ isyue + ", age=" + age + ", name=" + name + ", gender="
				+ gender + ", industry=" + industry + ", carPrice=" + carPrice
				+ ", occupation=" + occupation + ", province=" + province
				+ ", zipcode=" + zipcode + ", customerTypes=" + customerTypes
				+ ", recordtime=" + recordtime + ", photoId=" + photoId
				+ ", IndoType=" + IndoType + ", blood=" + blood
				+ ", mobilephone=" + mobilephone + ", email=" + email
				+ ", address=" + address + ", iscz=" + iscz + ", msgsource="
				+ msgsource + ", notes=" + notes + ", idno=" + idno
				+ ", carNature=" + carNature + ", openid=" + openid + "]";
	}
	public BigDecimal getCustomerId() {
		return customerId;
	}
	public void setCustomerId(BigDecimal customerId) {
		this.customerId = customerId;
	}
	public BigDecimal getVersion() {
		return version;
	}
	public void setVersion(BigDecimal version) {
		this.version = version;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUniqueidno() {
		return uniqueidno;
	}
	public void setUniqueidno(String uniqueidno) {
		this.uniqueidno = uniqueidno;
	}
	public BigDecimal getDegree() {
		return degree;
	}
	public void setDegree(BigDecimal degree) {
		this.degree = degree;
	}
	public BigDecimal getBuildfilestationId() {
		return buildfilestationId;
	}
	public void setBuildfilestationId(BigDecimal buildfilestationId) {
		this.buildfilestationId = buildfilestationId;
	}
	public BigDecimal getIsyue() {
		return isyue;
	}
	public void setIsyue(BigDecimal isyue) {
		this.isyue = isyue;
	}
	public BigDecimal getAge() {
		return age;
	}
	public void setAge(BigDecimal age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getGender() {
		return gender;
	}
	public void setGender(BigDecimal gender) {
		this.gender = gender;
	}
	public BigDecimal getIndustry() {
		return industry;
	}
	public void setIndustry(BigDecimal industry) {
		this.industry = industry;
	}
	public BigDecimal getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(BigDecimal carPrice) {
		this.carPrice = carPrice;
	}
	public BigDecimal getOccupation() {
		return occupation;
	}
	public void setOccupation(BigDecimal occupation) {
		this.occupation = occupation;
	}
	public BigDecimal getProvince() {
		return province;
	}
	public void setProvince(BigDecimal province) {
		this.province = province;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public BigDecimal getCustomerTypes() {
		return customerTypes;
	}
	public void setCustomerTypes(BigDecimal customerTypes) {
		this.customerTypes = customerTypes;
	}
	public Date getRecordtime() {
		return recordtime;
	}
	public void setRecordtime(Date recordtime) {
		this.recordtime = recordtime;
	}
	public BigDecimal getPhotoId() {
		return photoId;
	}
	public void setPhotoId(BigDecimal photoId) {
		this.photoId = photoId;
	}
	public BigDecimal getIndoType() {
		return IndoType;
	}
	public void setIndoType(BigDecimal indoType) {
		IndoType = indoType;
	}
	public BigDecimal getBlood() {
		return blood;
	}
	public void setBlood(BigDecimal blood) {
		this.blood = blood;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public BigDecimal getIscz() {
		return iscz;
	}
	public void setIscz(BigDecimal iscz) {
		this.iscz = iscz;
	}
	public BigDecimal getMsgsource() {
		return msgsource;
	}
	public void setMsgsource(BigDecimal msgsource) {
		this.msgsource = msgsource;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}
	public BigDecimal getCarNature() {
		return carNature;
	}
	public void setCarNature(BigDecimal carNature) {
		this.carNature = carNature;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	
}
