package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class ip_advance {
@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int billno; 
	    private Date dat;
	    private String tim;
	    private String ipno;
	    private double amount;
	    private String pby;
	    private String preby;
	    private String remarks;
	    private String user;
	    private String last;
	    private String cid;
	    private String cname;
		@Override
		public String toString() {
			return "ip_advance [billno=" + billno + ", dat=" + dat + ", tim=" + tim + ", ipno=" + ipno + ", amount="
					+ amount + ", pby=" + pby + ", preby=" + preby + ", remarks=" + remarks + ", user=" + user
					+ ", last=" + last + ", cid=" + cid + ", cname=" + cname + "]";
		}
		public ip_advance() {
			super();
		}
		public ip_advance(int billno, Date dat, String tim, String ipno, double amount, String pby, String preby,
				String remarks, String user, String last, String cid, String cname) {
			super();
			this.billno = billno;
			this.dat = dat;
			this.tim = tim;
			this.ipno = ipno;
			this.amount = amount;
			this.pby = pby;
			this.preby = preby;
			this.remarks = remarks;
			this.user = user;
			this.last = last;
			this.cid = cid;
			this.cname = cname;
		}
		public int getBillno() {
			return billno;
		}
		public void setBillno(int billno) {
			this.billno = billno;
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
		public String getIpno() {
			return ipno;
		}
		public void setIpno(String ipno) {
			this.ipno = ipno;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public String getPby() {
			return pby;
		}
		public void setPby(String pby) {
			this.pby = pby;
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

	    // Add constructors, getters, setters, and other methods as needed.
	}


