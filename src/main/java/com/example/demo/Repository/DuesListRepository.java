package com.example.demo.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.patient_bal;
import com.example.demo.projection.DuesListprojection;
@Repository
public interface DuesListRepository extends JpaRepository<patient_bal, Integer> {

	
	@Query(value = "SELECT * FROM patient_bal b where b.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)
	List<DuesListprojection> getbetween(Date firstDate, Date lastDate);
	
	@Query(value ="select sum(b.tot+b.paid) from patient_bal b where b.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)
	double totalpaid(Date firstDate, Date lastDate);
	


}
