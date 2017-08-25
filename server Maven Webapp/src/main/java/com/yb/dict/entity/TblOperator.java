package com.yb.dict.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TblOperator {
	private BigDecimal id;
	private BigDecimal version;
	private Date birthday;
	private String phone;
	private String certificateno;
	private String password;
	private Date  registertime;
	private String uniqueid;
	private BigDecimal city_id;
	private BigDecimal organization_id;
	private BigDecimal ukey_id;
	private String  description;
	private String name;
	private BigDecimal province;
	private BigDecimal gender;
	private BigDecimal lockorg_id;
	private String loginname;
	private Date passwordbirthday;
	private Date invalidtime;
	private BigDecimal enable_status;
	private BigDecimal status;
	private BigDecimal photo_id;
	private BigDecimal nation;
	private BigDecimal country;
	private String email;
	private String address;
	private String fullname;
	public TblOperator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblOperator(BigDecimal id, BigDecimal version, Date birthday,
			String phone, String certificateno, String password,
			Date registertime, String uniqueid, BigDecimal city_id,
			BigDecimal organization_id, BigDecimal ukey_id, String description,
			String name, BigDecimal province, BigDecimal gender,
			BigDecimal lockorg_id, String loginname, Date passwordbirthday,
			Date invalidtime, BigDecimal enable_status, BigDecimal status,
			BigDecimal photo_id, BigDecimal nation, BigDecimal country,
			String email, String address, String fullname) {
		super();
		this.id = id;
		this.version = version;
		this.birthday = birthday;
		this.phone = phone;
		this.certificateno = certificateno;
		this.password = password;
		this.registertime = registertime;
		this.uniqueid = uniqueid;
		this.city_id = city_id;
		this.organization_id = organization_id;
		this.ukey_id = ukey_id;
		this.description = description;
		this.name = name;
		this.province = province;
		this.gender = gender;
		this.lockorg_id = lockorg_id;
		this.loginname = loginname;
		this.passwordbirthday = passwordbirthday;
		this.invalidtime = invalidtime;
		this.enable_status = enable_status;
		this.status = status;
		this.photo_id = photo_id;
		this.nation = nation;
		this.country = country;
		this.email = email;
		this.address = address;
		this.fullname = fullname;
	}
	@Override
	public String toString() {
		return "TblOperator [id=" + id + ", version=" + version + ", birthday="
				+ birthday + ", phone=" + phone + ", certificateno="
				+ certificateno + ", password=" + password + ", registertime="
				+ registertime + ", uniqueid=" + uniqueid + ", city_id="
				+ city_id + ", organization_id=" + organization_id
				+ ", ukey_id=" + ukey_id + ", description=" + description
				+ ", name=" + name + ", province=" + province + ", gender="
				+ gender + ", lockorg_id=" + lockorg_id + ", loginname="
				+ loginname + ", passwordbirthday=" + passwordbirthday
				+ ", invalidtime=" + invalidtime + ", enable_status="
				+ enable_status + ", status=" + status + ", photo_id="
				+ photo_id + ", nation=" + nation + ", country=" + country
				+ ", email=" + email + ", address=" + address + ", fullname="
				+ fullname + "]";
	}
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
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
	public String getCertificateno() {
		return certificateno;
	}
	public void setCertificateno(String certificateno) {
		this.certificateno = certificateno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegistertime() {
		return registertime;
	}
	public void setRegistertime(Date registertime) {
		this.registertime = registertime;
	}
	public String getUniqueid() {
		return uniqueid;
	}
	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}
	public BigDecimal getCity_id() {
		return city_id;
	}
	public void setCity_id(BigDecimal city_id) {
		this.city_id = city_id;
	}
	public BigDecimal getOrganization_id() {
		return organization_id;
	}
	public void setOrganization_id(BigDecimal organization_id) {
		this.organization_id = organization_id;
	}
	public BigDecimal getUkey_id() {
		return ukey_id;
	}
	public void setUkey_id(BigDecimal ukey_id) {
		this.ukey_id = ukey_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getProvince() {
		return province;
	}
	public void setProvince(BigDecimal province) {
		this.province = province;
	}
	public BigDecimal getGender() {
		return gender;
	}
	public void setGender(BigDecimal gender) {
		this.gender = gender;
	}
	public BigDecimal getLockorg_id() {
		return lockorg_id;
	}
	public void setLockorg_id(BigDecimal lockorg_id) {
		this.lockorg_id = lockorg_id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public Date getPasswordbirthday() {
		return passwordbirthday;
	}
	public void setPasswordbirthday(Date passwordbirthday) {
		this.passwordbirthday = passwordbirthday;
	}
	public Date getInvalidtime() {
		return invalidtime;
	}
	public void setInvalidtime(Date invalidtime) {
		this.invalidtime = invalidtime;
	}
	public BigDecimal getEnable_status() {
		return enable_status;
	}
	public void setEnable_status(BigDecimal enable_status) {
		this.enable_status = enable_status;
	}
	public BigDecimal getStatus() {
		return status;
	}
	public void setStatus(BigDecimal status) {
		this.status = status;
	}
	public BigDecimal getPhoto_id() {
		return photo_id;
	}
	public void setPhoto_id(BigDecimal photo_id) {
		this.photo_id = photo_id;
	}
	public BigDecimal getNation() {
		return nation;
	}
	public void setNation(BigDecimal nation) {
		this.nation = nation;
	}
	public BigDecimal getCountry() {
		return country;
	}
	public void setCountry(BigDecimal country) {
		this.country = country;
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
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
}

