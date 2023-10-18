package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Data
@Setter
@Getter

public class opd_entry {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int opno; 
	    private Date dat;
	    private String tim;
	    private String category;
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
	    private String ptype;
	    private String purpose;
	    private String dname;
	    private String preby;
	    private String remarks;
	    private String status;
	    private String user;
	    private String mstatus;
	    private String email;
	    private String occu;
	    private String income;
	    private String dept;
	    private String rname;
		@Override
		public String toString() {
			return "opd_entry [opno=" + opno + ", dat=" + dat + ", tim=" + tim + ", category=" + category + ", cid="
					+ cid + ", cname=" + cname + ", gender=" + gender + ", age=" + age + ", add1=" + add1 + ", add2="
					+ add2 + ", add3=" + add3 + ", city=" + city + ", mobile=" + mobile + ", phone=" + phone
					+ ", ptype=" + ptype + ", purpose=" + purpose + ", dname=" + dname + ", preby=" + preby
					+ ", remarks=" + remarks + ", status=" + status + ", user=" + user + ", mstatus=" + mstatus
					+ ", email=" + email + ", occu=" + occu + ", income=" + income + ", dept=" + dept + ", rname="
					+ rname + "]";
		}
		public opd_entry() {
			super();
		}
		public opd_entry(int opno, Date dat, String tim, String category, String cid, String cname, String gender,
				String age, String add1, String add2, String add3, String city, String mobile, String phone,
				String ptype, String purpose, String dname, String preby, String remarks, String status, String user,
				String mstatus, String email, String occu, String income, String dept, String rname) {
			super();
			this.opno = opno;
			this.dat = dat;
			this.tim = tim;
			this.category = category;
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
			this.ptype = ptype;
			this.purpose = purpose;
			this.dname = dname;
			this.preby = preby;
			this.remarks = remarks;
			this.status = status;
			this.user = user;
			this.mstatus = mstatus;
			this.email = email;
			this.occu = occu;
			this.income = income;
			this.dept = dept;
			this.rname = rname;
		}
		public int getOpno() {
			return opno;
		}
		public void setOpno(int opno) {
			this.opno = opno;
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
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
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
		public String getPtype() {
			return ptype;
		}
		public void setPtype(String ptype) {
			this.ptype = ptype;
		}
		public String getPurpose() {
			return purpose;
		}
		public void setPurpose(String purpose) {
			this.purpose = purpose;
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
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public String getMstatus() {
			return mstatus;
		}
		public void setMstatus(String mstatus) {
			this.mstatus = mstatus;
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

	}


