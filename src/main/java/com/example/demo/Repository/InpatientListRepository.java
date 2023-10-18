package com.example.demo.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ip_entry;
import com.example.demo.projection.InpatientListprojection;

@Repository
public interface InpatientListRepository extends JpaRepository<ip_entry, Integer> {
@Query(value="SELECT * FROM ip_entry i where i.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)
	List<InpatientListprojection> getall(Date firstDate, Date lastDate);

}
