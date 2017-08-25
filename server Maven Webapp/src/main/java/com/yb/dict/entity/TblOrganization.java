package com.yb.dict.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TblOrganization {
	private BigDecimal id;
	private BigDecimal version;
	private BigDecimal p400;
	private BigDecimal orgtype;
	private String phone;
	private String olduniqueid;
	private BigDecimal posy;
	private BigDecimal posx;
	private BigDecimal p1;
	private BigDecimal org_status;
	private BigDecimal isdeposit;
	private BigDecimal p500;
	private Date registertime;
	private String uniqueid;
	private BigDecimal city_id;
	private BigDecimal isagent;
	private BigDecimal p700;
	private String description;
	private BigDecimal isstation;
	private String name;
	private String orgsequence;
	private BigDecimal province;
	private BigDecimal p600;
	private BigDecimal issettle;
	private BigDecimal p300;
	private Date invalidtime;
	private BigDecimal org_enable;
	private BigDecimal status;
	private BigDecimal isgiftlocation;
	private BigDecimal star;
	private String logourl;
	private BigDecimal p200;
	private String abbreviation;
	private BigDecimal photo_id;
	private BigDecimal regiontype;
	private BigDecimal country;
	private BigDecimal ismerchant;
	private String email;
	private String address;
	private String cardunique;
	private String fullname;
	private BigDecimal isacquirer;
	private BigDecimal isshare;
	private BigDecimal isissuer;
	private BigDecimal org_level;
	public TblOrganization() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TblOrganization(BigDecimal id, BigDecimal version, BigDecimal p400,
			BigDecimal orgtype, String phone, String olduniqueid,
			BigDecimal posy, BigDecimal posx, BigDecimal p1,
			BigDecimal org_status, BigDecimal isdeposit, BigDecimal p500,
			Date registertime, String uniqueid, BigDecimal city_id,
			BigDecimal isagent, BigDecimal p700, String description,
			BigDecimal isstation, String name, String orgsequence,
			BigDecimal province, BigDecimal p600, BigDecimal issettle,
			BigDecimal p300, Date invalidtime, BigDecimal org_enable,
			BigDecimal status, BigDecimal isgiftlocation, BigDecimal star,
			String logourl, BigDecimal p200, String abbreviation,
			BigDecimal photo_id, BigDecimal regiontype, BigDecimal country,
			BigDecimal ismerchant, String email, String address,
			String cardunique, String fullname, BigDecimal isacquirer,
			BigDecimal isshare, BigDecimal isissuer, BigDecimal org_level) {
		super();
		this.id = id;
		this.version = version;
		this.p400 = p400;
		this.orgtype = orgtype;
		this.phone = phone;
		this.olduniqueid = olduniqueid;
		this.posy = posy;
		this.posx = posx;
		this.p1 = p1;
		this.org_status = org_status;
		this.isdeposit = isdeposit;
		this.p500 = p500;
		this.registertime = registertime;
		this.uniqueid = uniqueid;
		this.city_id = city_id;
		this.isagent = isagent;
		this.p700 = p700;
		this.description = description;
		this.isstation = isstation;
		this.name = name;
		this.orgsequence = orgsequence;
		this.province = province;
		this.p600 = p600;
		this.issettle = issettle;
		this.p300 = p300;
		this.invalidtime = invalidtime;
		this.org_enable = org_enable;
		this.status = status;
		this.isgiftlocation = isgiftlocation;
		this.star = star;
		this.logourl = logourl;
		this.p200 = p200;
		this.abbreviation = abbreviation;
		this.photo_id = photo_id;
		this.regiontype = regiontype;
		this.country = country;
		this.ismerchant = ismerchant;
		this.email = email;
		this.address = address;
		this.cardunique = cardunique;
		this.fullname = fullname;
		this.isacquirer = isacquirer;
		this.isshare = isshare;
		this.isissuer = isissuer;
		this.org_level = org_level;
	}
	@Override
	public String toString() {
		return "TblOrganization [id=" + id + ", version=" + version + ", p400="
				+ p400 + ", orgtype=" + orgtype + ", phone=" + phone
				+ ", olduniqueid=" + olduniqueid + ", posy=" + posy + ", posx="
				+ posx + ", p1=" + p1 + ", org_status=" + org_status
				+ ", isdeposit=" + isdeposit + ", p500=" + p500
				+ ", registertime=" + registertime + ", uniqueid=" + uniqueid
				+ ", city_id=" + city_id + ", isagent=" + isagent + ", p700="
				+ p700 + ", description=" + description + ", isstation="
				+ isstation + ", name=" + name + ", orgsequence=" + orgsequence
				+ ", province=" + province + ", p600=" + p600 + ", issettle="
				+ issettle + ", p300=" + p300 + ", invalidtime=" + invalidtime
				+ ", org_enable=" + org_enable + ", status=" + status
				+ ", isgiftlocation=" + isgiftlocation + ", star=" + star
				+ ", logourl=" + logourl + ", p200=" + p200 + ", abbreviation="
				+ abbreviation + ", photo_id=" + photo_id + ", regiontype="
				+ regiontype + ", country=" + country + ", ismerchant="
				+ ismerchant + ", email=" + email + ", address=" + address
				+ ", cardunique=" + cardunique + ", fullname=" + fullname
				+ ", isacquirer=" + isacquirer + ", isshare=" + isshare
				+ ", isissuer=" + isissuer + ", org_level=" + org_level + "]";
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
	public BigDecimal getP400() {
		return p400;
	}
	public void setP400(BigDecimal p400) {
		this.p400 = p400;
	}
	public BigDecimal getOrgtype() {
		return orgtype;
	}
	public void setOrgtype(BigDecimal orgtype) {
		this.orgtype = orgtype;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getOlduniqueid() {
		return olduniqueid;
	}
	public void setOlduniqueid(String olduniqueid) {
		this.olduniqueid = olduniqueid;
	}
	public BigDecimal getPosy() {
		return posy;
	}
	public void setPosy(BigDecimal posy) {
		this.posy = posy;
	}
	public BigDecimal getPosx() {
		return posx;
	}
	public void setPosx(BigDecimal posx) {
		this.posx = posx;
	}
	public BigDecimal getP1() {
		return p1;
	}
	public void setP1(BigDecimal p1) {
		this.p1 = p1;
	}
	public BigDecimal getOrg_status() {
		return org_status;
	}
	public void setOrg_status(BigDecimal org_status) {
		this.org_status = org_status;
	}
	public BigDecimal getIsdeposit() {
		return isdeposit;
	}
	public void setIsdeposit(BigDecimal isdeposit) {
		this.isdeposit = isdeposit;
	}
	public BigDecimal getP500() {
		return p500;
	}
	public void setP500(BigDecimal p500) {
		this.p500 = p500;
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
	public BigDecimal getIsagent() {
		return isagent;
	}
	public void setIsagent(BigDecimal isagent) {
		this.isagent = isagent;
	}
	public BigDecimal getP700() {
		return p700;
	}
	public void setP700(BigDecimal p700) {
		this.p700 = p700;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getIsstation() {
		return isstation;
	}
	public void setIsstation(BigDecimal isstation) {
		this.isstation = isstation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrgsequence() {
		return orgsequence;
	}
	public void setOrgsequence(String orgsequence) {
		this.orgsequence = orgsequence;
	}
	public BigDecimal getProvince() {
		return province;
	}
	public void setProvince(BigDecimal province) {
		this.province = province;
	}
	public BigDecimal getP600() {
		return p600;
	}
	public void setP600(BigDecimal p600) {
		this.p600 = p600;
	}
	public BigDecimal getIssettle() {
		return issettle;
	}
	public void setIssettle(BigDecimal issettle) {
		this.issettle = issettle;
	}
	public BigDecimal getP300() {
		return p300;
	}
	public void setP300(BigDecimal p300) {
		this.p300 = p300;
	}
	public Date getInvalidtime() {
		return invalidtime;
	}
	public void setInvalidtime(Date invalidtime) {
		this.invalidtime = invalidtime;
	}
	public BigDecimal getOrg_enable() {
		return org_enable;
	}
	public void setOrg_enable(BigDecimal org_enable) {
		this.org_enable = org_enable;
	}
	public BigDecimal getStatus() {
		return status;
	}
	public void setStatus(BigDecimal status) {
		this.status = status;
	}
	public BigDecimal getIsgiftlocation() {
		return isgiftlocation;
	}
	public void setIsgiftlocation(BigDecimal isgiftlocation) {
		this.isgiftlocation = isgiftlocation;
	}
	public BigDecimal getStar() {
		return star;
	}
	public void setStar(BigDecimal star) {
		this.star = star;
	}
	public String getLogourl() {
		return logourl;
	}
	public void setLogourl(String logourl) {
		this.logourl = logourl;
	}
	public BigDecimal getP200() {
		return p200;
	}
	public void setP200(BigDecimal p200) {
		this.p200 = p200;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public BigDecimal getPhoto_id() {
		return photo_id;
	}
	public void setPhoto_id(BigDecimal photo_id) {
		this.photo_id = photo_id;
	}
	public BigDecimal getRegiontype() {
		return regiontype;
	}
	public void setRegiontype(BigDecimal regiontype) {
		this.regiontype = regiontype;
	}
	public BigDecimal getCountry() {
		return country;
	}
	public void setCountry(BigDecimal country) {
		this.country = country;
	}
	public BigDecimal getIsmerchant() {
		return ismerchant;
	}
	public void setIsmerchant(BigDecimal ismerchant) {
		this.ismerchant = ismerchant;
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
	public String getCardunique() {
		return cardunique;
	}
	public void setCardunique(String cardunique) {
		this.cardunique = cardunique;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public BigDecimal getIsacquirer() {
		return isacquirer;
	}
	public void setIsacquirer(BigDecimal isacquirer) {
		this.isacquirer = isacquirer;
	}
	public BigDecimal getIsshare() {
		return isshare;
	}
	public void setIsshare(BigDecimal isshare) {
		this.isshare = isshare;
	}
	public BigDecimal getIsissuer() {
		return isissuer;
	}
	public void setIsissuer(BigDecimal isissuer) {
		this.isissuer = isissuer;
	}
	public BigDecimal getOrg_level() {
		return org_level;
	}
	public void setOrg_level(BigDecimal org_level) {
		this.org_level = org_level;
	}
	
}
