package com.example.demo.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.opd_entry;
import com.example.demo.projection.OutpatientsListpprojection;

@Repository
public interface OutpatientsListRepository extends JpaRepository<opd_entry, Integer> {

	@Query(value="SELECT * from opd_entry e where e.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)

	List<OutpatientsListpprojection> getall(Date firstDate, Date lastDate);

	@Query(value="SELECT * from opd_entry e where e.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)
	List<OutpatientsListpprojection> getallbills(Date firstDate, Date lastDate);



	@Query(value="SELECT COUNT(e.category) from opd_entry e where e.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)
	String countNewpatients(Date firstDate, Date lastDate);

	@Query(value="SELECT COUNT(e.category) from opd_entry e where e.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)
	String countReviewpatients(Date firstDate, Date lastDate);

	@Query(value="SELECT COUNT(e.status) from opd_entry e where e.dat BETWEEN :firstDate AND :lastDate AND e.status ='In'",nativeQuery = true)
	String countpatientsin(Date firstDate, Date lastDate);
	
	@Query(value="SELECT COUNT(e.status) from opd_entry e where e.dat BETWEEN :firstDate AND :lastDate AND e.status ='Out'",nativeQuery = true)
	String countpatientsout(Date firstDate, Date lastDate);

	@Query(value="SELECT COUNT(e.status) from opd_entry e where e.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)
	String countWaiting(Date firstDate, Date lastDate);

//	@Query(value="SELECT SUM(e.income) from opd_entry e where e.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)
//	int getNetValue(Date firstDate, Date lastDate);

	
	}
	


