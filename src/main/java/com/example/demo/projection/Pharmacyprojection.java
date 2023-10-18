package com.example.demo.projection;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public interface Pharmacyprojection {
 
	public int getBillNo() ;
	public Date getDat() ;
	public String getCname() ;
	public double getDisamt() ;
	public String getPby() ;




}
