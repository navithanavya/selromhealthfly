package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ip_entry {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int ipno; 
	    private Date dat;
	    private String tim;
	    private String opno;
	    private String cid;
	    private String cname;
	    private String gender;
	    private String age;
	    private String add1;
	    private String add2;
	    private String add3;
	    private String city;
	    private String mobile;
	    private String phone;
	    private String ad_type;
	    private String purpose;
	    private String ward;
	    private String room;
	    private String dname;
	    private String preby;
	    private String remarks;
	    private String pay_type;
	    private String scheme_id;
	    private String scheme;
	    private String status;
	    private Date ddate;
	    private String dtime;
	    private String user;
	    private String last;
	    private String mstatus;
	    private String fname;
	    private String email;
	    private String occu;
	    private String income;
	    private String religion;
	    private String dept;
	    private String rname;
		@Override
		public String toString() {
			return "ip_entry [ipno=" + ipno + ", dat=" + dat + ", tim=" + tim + ", opno=" + opno + ", cid=" + cid
					+ ", cname=" + cname + ", gender=" + gender + ", age=" + age + ", add1=" + add1 + ", add2=" + add2
					+ ", add3=" + add3 + ", city=" + city + ", mobile=" + mobile + ", phone=" + phone + ", ad_type="
					+ ad_type + ", purpose=" + purpose + ", ward=" + ward + ", room=" + room + ", dname=" + dname
					+ ", preby=" + preby + ", remarks=" + remarks + ", pay_type=" + pay_type + ", scheme_id="
					+ scheme_id + ", scheme=" + scheme + ", status=" + status + ", ddate=" + ddate + ", dtime=" + dtime
					+ ", user=" + user + ", last=" + last + ", mstatus=" + mstatus + ", fname=" + fname + ", email="
					+ email + ", occu=" + occu + ", income=" + income + ", religion=" + religion + ", dept=" + dept
					+ ", rname=" + rname + "]";
		}
		public ip_entry() {
			super();
		}
		public int getIpno() {
			return ipno;
		}
		public void setIpno(int ipno) {
			this.ipno = ipno;
		}
		public Date getDat() {
			return dat;
		}
		public void setDat(Date dat) {
			this.dat = dat;
		}
		public String getTim() {
			return tim;
		}
		public void setTim(String tim) {
			this.tim = tim;
		}
		public String getOpno() {
			return opno;
		}
		public void setOpno(String opno) {
			this.opno = opno;
		}
		public String getCid() {
			return cid;
		}
		public void setCid(String cid) {
			this.cid = cid;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getAdd1() {
			return add1;
		}
		public void setAdd1(String add1) {
			this.add1 = add1;
		}
		public String getAdd2() {
			return add2;
		}
		public void setAdd2(String add2) {
			this.add2 = add2;
		}
		public String getAdd3() {
			return add3;
		}
		public void setAdd3(String add3) {
			this.add3 = add3;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAd_type() {
			return ad_type;
		}
		public void setAd_type(String ad_type) {
			this.ad_type = ad_type;
		}
		public String getPurpose() {
			return purpose;
		}
		public void setPurpose(String purpose) {
			this.purpose = purpose;
		}
		public String getWard() {
			return ward;
		}
		public void setWard(String ward) {
			this.ward = ward;
		}
		public String getRoom() {
			return room;
		}
		public void setRoom(String room) {
			this.room = room;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		public String getPreby() {
			return preby;
		}
		public void setPreby(String preby) {
			this.preby = preby;
		}
		public String getRemarks() {
			return remarks;
		}
		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
		public String getPay_type() {
			return pay_type;
		}
		public void setPay_type(String pay_type) {
			this.pay_type = pay_type;
		}
		public String getScheme_id() {
			return scheme_id;
		}
		public void setScheme_id(String scheme_id) {
			this.scheme_id = scheme_id;
		}
		public String getScheme() {
			return scheme;
		}
		public void setScheme(String scheme) {
			this.scheme = scheme;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Date getDdate() {
			return ddate;
		}
		public void setDdate(Date ddate) {
			this.ddate = ddate;
		}
		public String getDtime() {
			return dtime;
		}
		public void setDtime(String dtime) {
			this.dtime = dtime;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public String getLast() {
			return last;
		}
		public void setLast(String last) {
			this.last = last;
		}
		public String getMstatus() {
			return mstatus;
		}
		public void setMstatus(String mstatus) {
			this.mstatus = mstatus;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getOccu() {
			return occu;
		}
		public void setOccu(String occu) {
			this.occu = occu;
		}
		public String getIncome() {
			return income;
		}
		public void setIncome(String income) {
			this.income = income;
		}
		public String getReligion() {
			return religion;
		}
		public void setReligion(String religion) {
			this.religion = religion;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public String getRname() {
			return rname;
		}
		public void setRname(String rname) {
			this.rname = rname;
		}
		public ip_entry(int ipno, Date dat, String tim, String opno, String cid, String cname, String gender,
				String age, String add1, String add2, String add3, String city, String mobile, String phone,
				String ad_type, String purpose, String ward, String room, String dname, String preby, String remarks,
				String pay_type, String scheme_id, String scheme, String status, Date ddate, String dtime, String user,
				String last, String mstatus, String fname, String email, String occu, String income, String religion,
				String dept, String rname) {
			super();
			this.ipno = ipno;
			this.dat = dat;
			this.tim = tim;
			this.opno = opno;
			this.cid = cid;
			this.cname = cname;
			this.gender = gender;
			this.age = age;
			this.add1 = add1;
			this.add2 = add2;
			this.add3 = add3;
			this.city = city;
			this.mobile = mobile;
			this.phone = phone;
			this.ad_type = ad_type;
			this.purpose = purpose;
			this.ward = ward;
			this.room = room;
			this.dname = dname;
			this.preby = preby;
			this.remarks = remarks;
			this.pay_type = pay_type;
			this.scheme_id = scheme_id;
			this.scheme = scheme;
			this.status = status;
			this.ddate = ddate;
			this.dtime = dtime;
			this.user = user;
			this.last = last;
			this.mstatus = mstatus;
			this.fname = fname;
			this.email = email;
			this.occu = occu;
			this.income = income;
			this.religion = religion;
			this.dept = dept;
			this.rname = rname;
		}
	    
	    // Constructors, getters, and setters go here...

	    // You can add constructors, getters, and setters as needed to access and modify the class properties.
	}


