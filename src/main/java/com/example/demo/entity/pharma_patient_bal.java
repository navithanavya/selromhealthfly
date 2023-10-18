package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class pharma_patient_bal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billno;
	    private Date dat;
	    private String tim;
	    private String cid;
	    private String cname;
	    private double tot;
	    private double paid;

	    // Constructors
	    public pharma_patient_bal() {
	        // Empty constructor (default constructor)
	    }

	    public pharma_patient_bal(int billNo, Date dat, String tim, String cid, String cname, double tot, double paid) {
	        this.billno = billNo;
	        this.dat = dat;
	        this.tim = tim;
	        this.cid = cid;
	        this.cname = cname;
	        this.tot = tot;
	        this.paid = paid;
	    }

	    // Getters and Setters
	    public int getBillno() {
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
	}


