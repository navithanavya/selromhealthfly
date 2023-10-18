package com.example.demo.projection;

import java.sql.Date;

import org.springframework.stereotype.Component;
@Component
public interface InpatientAdvanceReportprojection {
	public int getBillno() ;
	public Date getDat() ;
	public String getPby() ;
	public double getAmount() ;

}
