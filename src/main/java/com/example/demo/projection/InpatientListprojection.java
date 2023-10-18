package com.example.demo.projection;

import java.sql.Date;

import org.springframework.stereotype.Component;
@Component
public interface InpatientListprojection {
	public int getIpno() ;
	public String getCid() ;
	public String getCname() ;
	public String getWard() ;
	public String getRoom() ;
	public Date getDdate() ;
	public String getPurpose() ;


}
