package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class pharma_sales {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int billno; 
	    private Date dat;
	    private String tim;
	    private String dname;
	    private String cid;
	    private String cname;
	    private int items;
	    private double quans;
	    private double sub;
	    private double disp;
	    private double disamt;
	    private double gross;
	    private double taxamt;
	    private double gt;
	    private double round;
	    private double net;
	    private String pby;
	    private String aby;
	    private String preby;
	    private String user;
	    private String last;
	    private String ttype;
	    private String diag;
	    private int nuhidNo;
		public pharma_sales() {
			super();
		}
		public pharma_sales(int billno, Date dat, String tim, String dname, String cid, String cname, int items,
				double quans, double sub, double disp, double disamt, double gross, double taxamt, double gt,
				double round, double net, String pby, String aby, String preby, String user, String last, String ttype,
				String diag, int nuhidNo) {
			super();
			this.billno = billno;
			this.dat = dat;
			this.tim = tim;
			this.dname = dname;
			this.cid = cid;
			this.cname = cname;
			this.items = items;
			this.quans = quans;
			this.sub = sub;
			this.disp = disp;
			this.disamt = disamt;
			this.gross = gross;
			this.taxamt = taxamt;
			this.gt = gt;
			this.round = round;
			this.net = net;
			this.pby = pby;
			this.aby = aby;
			this.preby = preby;
			this.user = user;
			this.last = last;
			this.ttype = ttype;
			this.diag = diag;
			this.nuhidNo = nuhidNo;
		}
		@Override
		public String toString() {
			return "pharma_sales [billNo=" + billno + ", dat=" + dat + ", tim=" + tim + ", dname=" + dname + ", cid="
					+ cid + ", cname=" + cname + ", items=" + items + ", quans=" + quans + ", sub=" + sub + ", disp="
					+ disp + ", disamt=" + disamt + ", gross=" + gross + ", taxamt=" + taxamt + ", gt=" + gt
					+ ", round=" + round + ", net=" + net + ", pby=" + pby + ", aby=" + aby + ", preby=" + preby
					+ ", user=" + user + ", last=" + last + ", ttype=" + ttype + ", diag=" + diag + ", nuhidNo="
					+ nuhidNo + "]";
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
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
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
		public int getItems() {
			return items;
		}
		public void setItems(int items) {
			this.items = items;
		}
		public double getQuans() {
			return quans;
		}
		public void setQuans(double quans) {
			this.quans = quans;
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
		public double getGross() {
			return gross;
		}
		public void setGross(double gross) {
			this.gross = gross;
		}
		public double getTaxamt() {
			return taxamt;
		}
		public void setTaxamt(double taxamt) {
			this.taxamt = taxamt;
		}
		public double getGt() {
			return gt;
		}
		public void setGt(double gt) {
			this.gt = gt;
		}
		public double getRound() {
			return round;
		}
		public void setRound(double round) {
			this.round = round;
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
		public String getAby() {
			return aby;
		}
		public void setAby(String aby) {
			this.aby = aby;
		}
		public String getPreby() {
			return preby;
		}
		public void setPreby(String preby) {
			this.preby = preby;
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
		public String getTtype() {
			return ttype;
		}
		public void setTtype(String ttype) {
			this.ttype = ttype;
		}
		public String getDiag() {
			return diag;
		}
		public void setDiag(String diag) {
			this.diag = diag;
		}
		public int getNuhidNo() {
			return nuhidNo;
		}
		public void setNuhidNo(int nuhidNo) {
			this.nuhidNo = nuhidNo;
		}

	    // Add constructors, getters, and setters as needed
	}


