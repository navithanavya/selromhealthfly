package com.example.demo.projection;

import java.sql.Date;

import org.springframework.stereotype.Component;
@Component
public interface DuesListprojection {
	public int getBillNo() ;
	public Date getDat() ;
	public String getCid() ;
	public String getCname() ;
	public double getTot() ;

}
