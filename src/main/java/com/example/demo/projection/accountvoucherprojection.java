package com.example.demo.projection;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public interface accountvoucherprojection {
    public int getBillNo() ;
    public Date getDat() ;
    public String getWhom() ;
    public String getPby() ;
    public double getAmount() ;


}
