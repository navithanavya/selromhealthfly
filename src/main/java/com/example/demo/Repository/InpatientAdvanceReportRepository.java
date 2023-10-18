package com.example.demo.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ip_advance;
import com.example.demo.projection.InpatientAdvanceReportprojection;
@Repository
public interface InpatientAdvanceReportRepository extends JpaRepository<ip_advance, Integer> {
	@Query(value="SELECT * FROM ip_advance i where i.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)
	List<InpatientAdvanceReportprojection> getall(Date firstDate, Date lastDate);

	@Query(value="SELECT * FROM ip_advance i where i.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)
	List<InpatientAdvanceReportprojection> getallbill(Date firstDate, Date lastDate);

	@Query("SELECT COUNT(i.billno)FROM ip_advance i where i.dat BETWEEN :firstDate AND :lastDate")
	int countNoOfBills(Date firstDate, Date lastDate);

	@Query("SELECT COUNT(i.pby)FROM ip_advance i where i.dat BETWEEN :firstDate AND :lastDate")
	int countCash(Date firstDate, Date lastDate);

	@Query("SELECT COUNT(i.pby)FROM ip_advance i where i.dat BETWEEN :firstDate AND :lastDate")
	int countCard(Date firstDate, Date lastDate);

	@Query("SELECT COUNT(i.pby)FROM ip_advance i where i.dat BETWEEN :firstDate AND :lastDate")
	int countUpi(Date firstDate, Date lastDate);

	@Query("SELECT COUNT(i.pby)FROM ip_advance i where i.dat BETWEEN :firstDate AND :lastDate")
	int countInsurance(Date firstDate, Date lastDate);

	@Query("SELECT COUNT(i.pby)FROM ip_advance i where i.dat BETWEEN :firstDate AND :lastDate")
	int countOthers(Date firstDate, Date lastDate);

	@Query("SELECT COUNT(i.pby)FROM ip_advance i where i.dat BETWEEN :firstDate AND :lastDate")
	int countTotal(Date firstDate, Date lastDate);

	@Query("SELECT SUM(i.amount)FROM ip_advance i where i.dat BETWEEN :firstDate AND :lastDate")

	int getNet(Date firstDate, Date lastDate);



}
