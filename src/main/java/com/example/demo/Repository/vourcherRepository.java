package com.example.demo.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.account_voucher;
import com.example.demo.projection.accountvoucherprojection;

@Repository
public interface vourcherRepository  extends JpaRepository<account_voucher, Integer>{
@Query(value="SELECT * FROM  account_voucher a where a.dat BETWEEN :firstDate AND :lastDate",nativeQuery = true)
	List<accountvoucherprojection> getall(Date firstDate, Date lastDate);

}
