package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class pharma_stock {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int grn;
	    private Date dat;
	    private String cname;
	    private String billNo;
	    private Date bdate;
	    private String ino;
	    private String iname;
	    private String batch1;
	    private Date edate;
	    private double uquan;
	    private double pack;
	    private double piece;
	    private double prate;
	    private double rrate;
	    private double mrp;
	    private String free;
	    private double taxp;
	    private double disp;
	    private double disamt;
	    private double sdis;
	    private double samt;
	    private String mali;
	    private String cat;
	    private String itype;
	    private String manu;
	    private String hsn;
	    private double costRate;
	    private String ptype;
	    private double price;
	    private double stock;
		@Override
		public String toString() {
			return "pharma_stock [grn=" + grn + ", dat=" + dat + ", cname=" + cname + ", billNo=" + billNo + ", bdate="
					+ bdate + ", ino=" + ino + ", iname=" + iname + ", batch1=" + batch1 + ", edate=" + edate
					+ ", uquan=" + uquan + ", pack=" + pack + ", piece=" + piece + ", prate=" + prate + ", rrate="
					+ rrate + ", mrp=" + mrp + ", free=" + free + ", taxp=" + taxp + ", disp=" + disp + ", disamt="
					+ disamt + ", sdis=" + sdis + ", samt=" + samt + ", mali=" + mali + ", cat=" + cat + ", itype="
					+ itype + ", manu=" + manu + ", hsn=" + hsn + ", costRate=" + costRate + ", ptype=" + ptype
					+ ", price=" + price + ", stock=" + stock + "]";
		}
		public pharma_stock() {
			super();
		}
		public pharma_stock(int grn, Date dat, String cname, String billNo, Date bdate, String ino, String iname,
				String batch1, Date edate, double uquan, double pack, double piece, double prate, double rrate,
				double mrp, String free, double taxp, double disp, double disamt, double sdis, double samt, String mali,
				String cat, String itype, String manu, String hsn, double costRate, String ptype, double price,
				double stock) {
			super();
			this.grn = grn;
			this.dat = dat;
			this.cname = cname;
			this.billNo = billNo;
			this.bdate = bdate;
			this.ino = ino;
			this.iname = iname;
			this.batch1 = batch1;
			this.edate = edate;
			this.uquan = uquan;
			this.pack = pack;
			this.piece = piece;
			this.prate = prate;
			this.rrate = rrate;
			this.mrp = mrp;
			this.free = free;
			this.taxp = taxp;
			this.disp = disp;
			this.disamt = disamt;
			this.sdis = sdis;
			this.samt = samt;
			this.mali = mali;
			this.cat = cat;
			this.itype = itype;
			this.manu = manu;
			this.hsn = hsn;
			this.costRate = costRate;
			this.ptype = ptype;
			this.price = price;
			this.stock = stock;
		}
		public int getGrn() {
			return grn;
		}
		public void setGrn(int grn) {
			this.grn = grn;
		}
		public Date getDat() {
			return dat;
		}
		public void setDat(Date dat) {
			this.dat = dat;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public String getBillNo() {
			return billNo;
		}
		public void setBillNo(String billNo) {
			this.billNo = billNo;
		}
		public Date getBdate() {
			return bdate;
		}
		public void setBdate(Date bdate) {
			this.bdate = bdate;
		}
		public String getIno() {
			return ino;
		}
		public void setIno(String ino) {
			this.ino = ino;
		}
		public String getIname() {
			return iname;
		}
		public void setIname(String iname) {
			this.iname = iname;
		}
		public String getBatch1() {
			return batch1;
		}
		public void setBatch1(String batch1) {
			this.batch1 = batch1;
		}
		public Date getEdate() {
			return edate;
		}
		public void setEdate(Date edate) {
			this.edate = edate;
		}
		public double getUquan() {
			return uquan;
		}
		public void setUquan(double uquan) {
			this.uquan = uquan;
		}
		public double getPack() {
			return pack;
		}
		public void setPack(double pack) {
			this.pack = pack;
		}
		public double getPiece() {
			return piece;
		}
		public void setPiece(double piece) {
			this.piece = piece;
		}
		public double getPrate() {
			return prate;
		}
		public void setPrate(double prate) {
			this.prate = prate;
		}
		public double getRrate() {
			return rrate;
		}
		public void setRrate(double rrate) {
			this.rrate = rrate;
		}
		public double getMrp() {
			return mrp;
		}
		public void setMrp(double mrp) {
			this.mrp = mrp;
		}
		public String getFree() {
			return free;
		}
		public void setFree(String free) {
			this.free = free;
		}
		public double getTaxp() {
			return taxp;
		}
		public void setTaxp(double taxp) {
			this.taxp = taxp;
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
		public double getSdis() {
			return sdis;
		}
		public void setSdis(double sdis) {
			this.sdis = sdis;
		}
		public double getSamt() {
			return samt;
		}
		public void setSamt(double samt) {
			this.samt = samt;
		}
		public String getMali() {
			return mali;
		}
		public void setMali(String mali) {
			this.mali = mali;
		}
		public String getCat() {
			return cat;
		}
		public void setCat(String cat) {
			this.cat = cat;
		}
		public String getItype() {
			return itype;
		}
		public void setItype(String itype) {
			this.itype = itype;
		}
		public String getManu() {
			return manu;
		}
		public void setManu(String manu) {
			this.manu = manu;
		}
		public String getHsn() {
			return hsn;
		}
		public void setHsn(String hsn) {
			this.hsn = hsn;
		}
		public double getCostRate() {
			return costRate;
		}
		public void setCostRate(double costRate) {
			this.costRate = costRate;
		}
		public String getPtype() {
			return ptype;
		}
		public void setPtype(String ptype) {
			this.ptype = ptype;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public double getStock() {
			return stock;
		}
		public void setStock(double stock) {
			this.stock = stock;
		}

	    // Add constructors, getters, and setters as needed
	}


