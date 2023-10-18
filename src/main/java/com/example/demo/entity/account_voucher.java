package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class account_voucher {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int billno; 
         private Date dat;
	    private String whom;
	    private String what;
	    private double amount;
	    private String pby;
	    private String ano;
	    private String account;
	    private String entry;
	    private String remarks;
	    private String user;
	    private String last;
	    private String under;

	    // Constructors
	    public account_voucher() {
	        // Empty constructor (default constructor)
	    }

	    public account_voucher(int billNo, Date dat, String whom, String what, double amount, String pby, String ano, String account,
	                String entry, String remarks, String user, String last, String under) {
	        this.billno = billNo;
	        this.dat = dat;
	        this.whom = whom;
	        this.what = what;
	        this.amount = amount;
	        this.pby = pby;
	        this.ano = ano;
	        this.account = account;
	        this.entry = entry;
	        this.remarks = remarks;
	        this.user = user;
	        this.last = last;
	        this.under = under;
	    }

	    // Getters and Setters
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

	    public String getWhom() {
	        return whom;
	    }

	    public void setWhom(String whom) {
	        this.whom = whom;
	    }

	    public String getWhat() {
	        return what;
	    }

	    public void setWhat(String what) {
	        this.what = what;
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

	    public String getAno() {
	        return ano;
	    }

	    public void setAno(String ano) {
	        this.ano = ano;
	    }

	    public String getAccount() {
	        return account;
	    }

	    public void setAccount(String account) {
	        this.account = account;
	    }

	    public String getEntry() {
	        return entry;
	    }

	    public void setEntry(String entry) {
	        this.entry = entry;
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

	    public String getUnder() {
	        return under;
	    }

	    public void setUnder(String under) {
	        this.under = under;
	    }
	}


