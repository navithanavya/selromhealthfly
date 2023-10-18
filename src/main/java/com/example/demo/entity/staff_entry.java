package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class staff_entry {
	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int sno;
	    private Date dat;
	    private String tim;
	    private String account;
	    private String desig;
	    private String sid; // PK (Primary Key)
	    private Date jdate;
	    private String sname;
	    private String fname;
	    private String gender;
	    private String bg;
	    private Date dob;
	    private String religion;
	    private String nation;
	    private String add1;
	    private String add2;
	    private String add3;
	    private String area;
	    private String pincode;
	    private String mobile;
	    private String phone;
	    private String email;
	    private String mstatus;
	    private String family;
	    private String edu;
	    private String exp;
	    private String job;
	    private String langu;
	    private String adhaar;
	    private String acno;
	    private String remarks;
	    private String status;
	    private Date edate;

	    public int getSno() {
			return sno;
		}

		public void setSno(int sno) {
			this.sno = sno;
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

		public String getAccount() {
			return account;
		}

		public void setAccount(String account) {
			this.account = account;
		}

		public String getDesig() {
			return desig;
		}

		public void setDesig(String desig) {
			this.desig = desig;
		}

		public String getSid() {
			return sid;
		}

		public void setSid(String sid) {
			this.sid = sid;
		}

		public Date getJdate() {
			return jdate;
		}

		public void setJdate(Date jdate) {
			this.jdate = jdate;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getBg() {
			return bg;
		}

		public void setBg(String bg) {
			this.bg = bg;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		public String getReligion() {
			return religion;
		}

		public void setReligion(String religion) {
			this.religion = religion;
		}

		public String getNation() {
			return nation;
		}

		public void setNation(String nation) {
			this.nation = nation;
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

		public String getArea() {
			return area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getPincode() {
			return pincode;
		}

		public void setPincode(String pincode) {
			this.pincode = pincode;
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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMstatus() {
			return mstatus;
		}

		public void setMstatus(String mstatus) {
			this.mstatus = mstatus;
		}

		public String getFamily() {
			return family;
		}

		public void setFamily(String family) {
			this.family = family;
		}

		public String getEdu() {
			return edu;
		}

		public void setEdu(String edu) {
			this.edu = edu;
		}

		public String getExp() {
			return exp;
		}

		public void setExp(String exp) {
			this.exp = exp;
		}

		public String getJob() {
			return job;
		}

		public void setJob(String job) {
			this.job = job;
		}

		public String getLangu() {
			return langu;
		}

		public void setLangu(String langu) {
			this.langu = langu;
		}

		public String getAdhaar() {
			return adhaar;
		}

		public void setAdhaar(String adhaar) {
			this.adhaar = adhaar;
		}

		public String getAcno() {
			return acno;
		}

		public void setAcno(String acno) {
			this.acno = acno;
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

		public Date getEdate() {
			return edate;
		}

		public void setEdate(Date edate) {
			this.edate = edate;
		}

		// Constructors
	    public staff_entry() {
	        // Empty constructor (default constructor)
	    }

	    public staff_entry(int sno, Date dat, String tim, String account, String desig, String sid, Date jdate, String sname,
	                    String fname, String gender, String bg, Date dob, String religion, String nation, String add1,
	                    String add2, String add3, String area, String pincode, String mobile, String phone, String email,
	                    String mstatus, String family, String edu, String exp, String job, String langu, String adhaar,
	                    String acno, String remarks, String status, Date edate) {
	        this.sno = sno;
	        this.dat = dat;
	        this.tim = tim;
	        this.account = account;
	        this.desig = desig;
	        this.sid = sid;
	        this.jdate = jdate;
	        this.sname = sname;
	        this.fname = fname;
	        this.gender = gender;
	        this.bg = bg;
	        this.dob = dob;
	        this.religion = religion;
	        this.nation = nation;
	        this.add1 = add1;
	        this.add2 = add2;
	        this.add3 = add3;
	        this.area = area;
	        this.pincode = pincode;
	        this.mobile = mobile;
	        this.phone = phone;
	        this.email = email;
	        this.mstatus = mstatus;
	        this.family = family;
	        this.edu = edu;
	        this.exp = exp;
	        this.job = job;
	        this.langu = langu;
	        this.adhaar = adhaar;
	        this.acno = acno;
	        this.remarks = remarks;
	        this.status = status;
	        this.edate = edate;
	    }

	    // Getters and Setters (omitting for brevity)
	}


