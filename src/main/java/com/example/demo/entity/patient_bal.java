package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class patient_bal {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int billno;
	    private Date dat;
	    private String tim;
	    private String opNo;
	    private String cid;
	    private String cname;
	    private double tot;
	    private double paid;
	    private String etype;
	    private String rno;
		@Override
		public String toString() {
			return "patient_bal [billNo=" + billno + ", dat=" + dat + ", tim=" + tim + ", opNo=" + opNo + ", cid=" + cid
					+ ", cname=" + cname + ", tot=" + tot + ", paid=" + paid + ", etype=" + etype + ", rno=" + rno
					+ "]";
		}
		public patient_bal() {
			super();
		}
		public patient_bal(int billNo, Date dat, String tim, String opNo, String cid, String cname, double tot,
				double paid, String etype, String rno) {
			super();
			this.billno = billno;
			this.dat = dat;
			this.tim = tim;
			this.opNo = opNo;
			this.cid = cid;
			this.cname = cname;
			this.tot = tot;
			this.paid = paid;
			this.etype = etype;
			this.rno = rno;
		}
		public int getBillNo() {
			return billno;
		}
		public void setBillNo(int billNo) {
			this.billno = billNo;
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
		public String getOpNo() {
			return opNo;
		}
		public void setOpNo(String opNo) {
			this.opNo = opNo;
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
		public double getTot() {
			return tot;
		}
		public void setTot(double tot) {
			this.tot = tot;
		}
		public double getPaid() {
			return paid;
		}
		public void setPaid(double paid) {
			this.paid = paid;
		}
		public String getEtype() {
			return etype;
		}
		public void setEtype(String etype) {
			this.etype = etype;
		}
		public String getRno() {
			return rno;
		}
		public void setRno(String rno) {
			this.rno = rno;
		}

	    // Add constructors, getters, and setters as needed
	}


