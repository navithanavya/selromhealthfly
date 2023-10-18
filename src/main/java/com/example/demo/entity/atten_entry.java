package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class atten_entry {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Date dat;
	    private String sid;
	    private String sname;
	    private String desig;
	    private String status;
	    private String value;
	    private String remarks;

	    // Constructors
	    public atten_entry() {
	        // Empty constructor (default constructor)
	    }

	    public atten_entry(Date dat, String sid, String sname, String desig, String status, String value, String remarks) {
	        this.dat = dat;
	        this.sid = sid;
	        this.sname = sname;
	        this.desig = desig;
	        this.status = status;
	        this.value = value;
	        this.remarks = remarks;
	    }

	    // Getters and Setters
	    public Date getDat() {
	        return dat;
	    }

	    public void setDat(Date dat) {
	        this.dat = dat;
	    }

	    public String getSid() {
	        return sid;
	    }

	    public void setSid(String sid) {
	        this.sid = sid;
	    }

	    public String getSname() {
	        return sname;
	    }

	    public void setSname(String sname) {
	        this.sname = sname;
	    }

	    public String getDesig() {
	        return desig;
	    }

	    public void setDesig(String desig) {
	        this.desig = desig;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	    public String getValue() {
	        return value;
	    }

	    public void setValue(String value) {
	        this.value = value;
	    }

	    public String getRemarks() {
	        return remarks;
	    }

	    public void setRemarks(String remarks) {
	        this.remarks = remarks;
	    }
	}


