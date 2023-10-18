package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class ip_bill {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int billno; 
	    private Date dat;
	    private String tim;
	    private String ipno;
	    private Date adate;
	    private String atime;
	    private Date ddate;
	    private String dtime;
	    private String cid;
	    private String cname;
	    private String dname;
	    private int items;
	    private double sub;
	    private double advance;
	    private double gross;
	    private double disp;
	    private double disamt;
	    private double net;
	    private String pby;
	    private String preby;
	    private String bstatus;
	    private String user;
	    private String last;
	    private String reason;
	    private String btype;
		@Override
		public String toString() {
			return "ip_bill [billno=" + billno + ", dat=" + dat + ", tim=" + tim + ", ipno=" + ipno + ", adate=" + adate
					+ ", atime=" + atime + ", ddate=" + ddate + ", dtime=" + dtime + ", cid=" + cid + ", cname=" + cname
					+ ", dname=" + dname + ", items=" + items + ", sub=" + sub + ", advance=" + advance + ", gross="
					+ gross + ", disp=" + disp + ", disamt=" + disamt + ", net=" + net + ", pby=" + pby + ", preby="
					+ preby + ", bstatus=" + bstatus + ", user=" + user + ", last=" + last + ", reason=" + reason
					+ ", btype=" + btype + "]";
		}
		public ip_bill() {
			super();
		}
		public ip_bill(int billno, Date dat, String tim, String ipno, Date adate, String atime, Date ddate,
				String dtime, String cid, String cname, String dname, int items, double sub, double advance,
				double gross, double disp, double disamt, double net, String pby, String preby, String bstatus,
				String user, String last, String reason, String btype) {
			super();
			this.billno = billno;
			this.dat = dat;
			this.tim = tim;
			this.ipno = ipno;
			this.adate = adate;
			this.atime = atime;
			this.ddate = ddate;
			this.dtime = dtime;
			this.cid = cid;
			this.cname = cname;
			this.dname = dname;
			this.items = items;
			this.sub = sub;
			this.advance = advance;
			this.gross = gross;
			this.disp = disp;
			this.disamt = disamt;
			this.net = net;
			this.pby = pby;
			this.preby = preby;
			this.bstatus = bstatus;
			this.user = user;
			this.last = last;
			this.reason = reason;
			this.btype = btype;
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
		public Date getAdate() {
			return adate;
		}
		public void setAdate(Date adate) {
			this.adate = adate;
		}
		public String getAtime() {
			return atime;
		}
		public void setAtime(String atime) {
			this.atime = atime;
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
		public double getAdvance() {
			return advance;
		}
		public void setAdvance(double advance) {
			this.advance = advance;
		}
		public double getGross() {
			return gross;
		}
		public void setGross(double gross) {
			this.gross = gross;
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
		public String getBtype() {
			return btype;
		}
		public void setBtype(String btype) {
			this.btype = btype;
		}

	}


