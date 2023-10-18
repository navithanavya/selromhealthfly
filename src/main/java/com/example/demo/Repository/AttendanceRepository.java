package com.example.demo.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.atten_entry;
import com.example.demo.projection.Attendanceprojection;

@Repository
public interface AttendanceRepository extends JpaRepository<atten_entry, Integer> 

{

	@Query(value="SELECT * FROM  atten_entry a where a.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)
	List<Attendanceprojection> getstaff(Date firstDate, Date lastDate);
	
	@Query(value="SELECT * FROM  atten_entry a where a.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)
	List<Attendanceprojection> getstaffattend(Date firstDate, Date lastDate);
	
	@Query("SELECT SUM(a.status)FROM atten_entry a where a.dat BETWEEN :firstDate AND :lastDate")
	int getnet(Date firstDate, Date lastDate);
	
	@Query("SELECT COUNT(a.status)FROM atten_entry a where a.dat BETWEEN :firstDate AND :lastDate")
	String countPresent(Date firstDate, Date lastDate);
	
	@Query("SELECT COUNT(a.status)FROM atten_entry a where a.dat BETWEEN :firstDate AND :lastDate")
	String countAbsent(Date firstDate, Date lastDate);
	
	@Query("SELECT SUM(a.status)FROM atten_entry a where a.dat BETWEEN :firstDate AND :lastDate")
	double countPercentage(Date firstDate, Date lastDate);




}