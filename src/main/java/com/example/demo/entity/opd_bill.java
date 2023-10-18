package com.example.demo.entity;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class opd_bill {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int sno; 
	    private int billno;
	    private Date dat;
	    private String tim;
	    private String opno;
	    private String cid;
	    private String cname;
	    private String dname;
	    private int items;
	    private double sub;
	    private double disp;
	    private double disamt;
	    private double net;
	    private String pby;
	    private String preby;
	    private String status;
	    private String bstatus;
	    private String user;
	    private String last;
	    private String reason;
	    private String settle;
	    private String purpose;
		@Override
		public String toString() {
			return "YourClassName [sno=" + sno + ", billno=" + billno + ", dat=" + dat + ", tim=" + tim + ", opno="
					+ opno + ", cid=" + cid + ", cname=" + cname + ", dname=" + dname + ", items=" + items + ", sub="
					+ sub + ", disp=" + disp + ", disamt=" + disamt + ", net=" + net + ", pby=" + pby + ", preby="
					+ preby + ", status=" + status + ", bstatus=" + bstatus + ", user=" + user + ", last=" + last
					+ ", reason=" + reason + ", settle=" + settle + ", purpose=" + purpose + "]";
		}
		public opd_bill() {
			super();
		}
		public opd_bill(int sno, int billno, Date dat, String tim, String opno, String cid, String cname,
				String dname, int items, double sub, double disp, double disamt, double net, String pby, String preby,
				String status, String bstatus, String user, String last, String reason, String settle, String purpose) {
			super();
			this.sno = sno;
			this.billno = billno;
			this.dat = dat;
			this.tim = tim;
			this.opno = opno;
			this.cid = cid;
			this.cname = cname;
			this.dname = dname;
			this.items = items;
			this.sub = sub;
			this.disp = disp;
			this.disamt = disamt;
			this.net = net;
			this.pby = pby;
			this.preby = preby;
			this.status = status;
			this.bstatus = bstatus;
			this.user = user;
			this.last = last;
			this.reason = reason;
			this.settle = settle;
			this.purpose = purpose;
		}
		public int getSno() {
			return sno;
		}
		public void setSno(int sno) {
			this.sno = sno;
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
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		public int getItems() {
			return items;
		}
		public void setItems(int items) {
			this.items = items;
		}
		public double getSub() {
			return sub;
		}
		public void setSub(double sub) {
			this.sub = sub;
		}
		public double getDisp() {
			return disp;
		}
		public void setDisp(double disp) {
			this.disp = disp;
		}
		public double getDisamt() {
			return disamt;
		}
		public void setDisamt(double disamt) {
			this.disamt = disamt;
		}
		public double getNet() {
			return net;
		}
		public void setNet(double net) {
			this.net = net;
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
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getBstatus() {
			return bstatus;
		}
		public void setBstatus(String bstatus) {
			this.bstatus = bstatus;
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
		public String getReason() {
			return reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}
		public String getSettle() {
			return settle;
		}
		public void setSettle(String settle) {
			this.settle = settle;
		}
		public String getPurpose() {
			return purpose;
		}
		public void setPurpose(String purpose) {
			this.purpose = purpose;
		}

	   
	}


