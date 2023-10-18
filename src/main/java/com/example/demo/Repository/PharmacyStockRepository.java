package com.example.demo.Repository;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.pharma_stock;
@Repository
public interface PharmacyStockRepository  extends JpaRepository<pharma_stock, Integer>{

//	
	@Query(value="select distinct count(p.ino) from pharma_stock p where p.dat<= :todayDate and piece>0 ",nativeQuery = true)
	int ExpiryDate(LocalDate todayDate);

	
	
	
	//query="select distinct count(ino) from pharma_stock where datediff(edate,'"+today+"') <=60 and piece>0 ";
	@Query(value="select count(distinct p.ino) from pharma_stock p where DATEDIFF(p.dat,:todayDate) <=60 and piece> 0",nativeQuery = true)
	int ShortExpiryDate(LocalDate todayDate);

}
