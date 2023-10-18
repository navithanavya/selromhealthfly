package com.example.demo.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.DuesListPharmacyRepository;
import com.example.demo.projection.DuesListPharmacyprojection;

@Service
public class DuesListPharmacyService {
@Autowired
private DuesListPharmacyRepository repository;



public List<DuesListPharmacyprojection> get(Date firstDate, Date lastDate) {
	List<DuesListPharmacyprojection> p1=repository.getbetween(firstDate,lastDate);

	return p1;
}

public ResponseEntity<?> getallList(Date firstDate, Date lastDate) {
	List<DuesListPharmacyprojection> p1=repository.getbetween(firstDate,lastDate);
	List<DuesListPharmacyprojection> list=new ArrayList<>();
	Map<String , Object>map=new HashMap<>();
	


	double total=repository.totalpaid(firstDate,lastDate);
	
	map.put("total", total);
	map.put("list", p1);
	return new ResponseEntity<>(map,HttpStatus.FOUND);
}}


