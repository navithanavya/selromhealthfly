package com.example.demo.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.pharma_patient_bal;
import com.example.demo.projection.DuesListPharmacyprojection;
@Repository
public interface DuesListPharmacyRepository  extends JpaRepository<pharma_patient_bal, Integer>{
	@Query(value = "SELECT * FROM pharma_patient_bal p where p.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)
	List<DuesListPharmacyprojection> getbetween(Date firstDate, Date lastDate);
	
	@Query(value ="select sum(p.tot+p.paid) from pharma_patient_bal p where p.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)
	double totalpaid(Date firstDate, Date lastDate);
	
}
