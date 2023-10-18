package com.example.demo.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.pharma_sales;
import com.example.demo.projection.Pharmacyprojection;
@Repository
public interface PharmacyReository extends JpaRepository<pharma_sales, Integer> {
@Query(value="SELECT * FROM pharma_sales  p where p.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)
	List<Pharmacyprojection> getall(Date firstDate, Date lastDate);

@Query(value="SELECT * FROM pharma_sales  p where p.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)
List<Pharmacyprojection> getallbill(Date firstDate, Date lastDate);

//@Query("SELECT COUNT(p.billno)FROM pharma_sales p where p.dat BETWEEN :firstDate AND :lastDate")
//int countNoOfBills(Date firstDate, Date lastDate);

@Query("SELECT COUNT(p.pby)FROM pharma_sales p where p.dat BETWEEN :firstDate AND :lastDate")
int countCash(Date firstDate, Date lastDate);

@Query("SELECT COUNT(p.pby)FROM pharma_sales p where p.dat BETWEEN :firstDate AND :lastDate")
int countCard(Date firstDate, Date lastDate);

@Query("SELECT COUNT(p.pby)FROM pharma_sales p where p.dat BETWEEN :firstDate AND :lastDate")
int countUpi(Date firstDate, Date lastDate);

@Query("SELECT SUM(p.sub)FROM pharma_sales p where p.dat BETWEEN :firstDate AND :lastDate")
int countInsurance(Date firstDate, Date lastDate);

@Query("SELECT COUNT(p.pby)FROM pharma_sales p where p.dat BETWEEN :firstDate AND :lastDate")
int countOthers(Date firstDate, Date lastDate);

@Query("SELECT COUNT(p.pby)FROM pharma_sales p where p.dat BETWEEN :firstDate AND :lastDate")
int getNet(Date firstDate, Date lastDate);
@Query("SELECT COUNT(p.billno)FROM pharma_sales p where p.dat BETWEEN :firstDate AND :lastDate")

int countNoOfBills(Date firstDate, Date lastDate);

}
