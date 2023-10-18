package com.example.demo.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.opd_bill;
import com.example.demo.projection.OpdbillProjection;

@Repository
public interface OpdbillRepository  extends JpaRepository<opd_bill, Integer>{
	 @Query(value="SELECT * from opd_bill b where b.dat BETWEEN :firstDate AND :lastDate",nativeQuery=true)
	 List<OpdbillProjection> getBetween(@Param("firstDate")Date firstDate, @Param("lastDate") Date lastDate);
	 
	 @Query(value="SELECT * from opd_bill b where b.dat BETWEEN :firstDate AND :lastDate",nativeQuery=true)
	 List<OpdbillProjection> getBillingBetweenDates(Date firstDate, Date lastDate);
	 
	 @Query(value="SELECT * from opd_bill b where b.dat BETWEEN :firstDate AND :lastDate",nativeQuery=true)
	 List<OpdbillProjection> getopdByCash(Date firstDate, Date lastDate);
	 
	 @Query(value="SELECT * from opd_bill b where b.dat BETWEEN :firstDate AND :lastDate",nativeQuery=true)
	 List<OpdbillProjection> getopdByCard(Date firstDate, Date lastDate);
	 
	 @Query(value="SELECT * from opd_bill b where b.dat BETWEEN :firstDate AND :lastDate",nativeQuery=true)
	 List<OpdbillProjection> getopdByUpi(Date firstDate, Date lastDate);
	 
	 @Query(value="SELECT * from opd_bill b where b.dat BETWEEN :firstDate AND :lastDate",nativeQuery=true)
	 List<OpdbillProjection> getopdByOthers(Date firstDate, Date lastDate);
	 
	 @Query(value="SELECT * from opd_bill b where b.dat BETWEEN :firstDate AND :lastDate",nativeQuery=true)
	 List<OpdbillProjection> getopdByInsurance(Date firstDate, Date lastDate);
	
//	 @Query("SELECT COUNT(b.billno)FROM opd_bill b where b.dat BETWEEN :firstDate AND :lastDate")
//	 int getAllBillNumbers(Date firstDate, Date lastDate);
//	 
	 
	 
	 
	 

}
