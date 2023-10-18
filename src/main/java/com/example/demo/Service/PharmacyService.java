package com.example.demo.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PharmacyReository;
import com.example.demo.Repository.PharmacyStockRepository;
import com.example.demo.dto.PharmasalesDto;
import com.example.demo.projection.Pharmacyprojection;

@Service
public class PharmacyService {
@Autowired
private PharmacyReository repository;

@Autowired
private PharmacyStockRepository repo;

public List<Pharmacyprojection> getall(Date firstDate, Date lastDate) {
	List<Pharmacyprojection> p=repository.getall(firstDate,lastDate);
	return p;
}

public ResponseEntity<?> getallsales(Date firstDate, Date lastDate) {
	List<Pharmacyprojection> projection=repository.getallbill(firstDate,lastDate);
	List<Pharmacyprojection> list=new ArrayList<>();
	PharmasalesDto data=new PharmasalesDto();
	Map<String, Object>map=new HashMap<>();
	
	
	LocalDate todayDate= LocalDate.now();
	 
	
	System.out.println(repo.ExpiryDate(todayDate));
	
	
	System.out.println(repo.ShortExpiryDate(todayDate));
	
	
//	
	data.setNoOfBills(repository.countNoOfBills(firstDate,lastDate));
	data.setCash(repository.countCash(firstDate,lastDate));
	data.setCard(repository.countCard(firstDate,lastDate));
	data.setUpi(repository.countUpi(firstDate,lastDate));
	data.setInsurance(repository.countInsurance(firstDate,lastDate));
	data.setOthers(repository.countOthers(firstDate,lastDate));
	data.setTotal(repository.getNet(firstDate,lastDate));
	data.setExpiry(repo.ExpiryDate(todayDate));
	data.setShortexpiry(repo.ShortExpiryDate(todayDate));
//	
//	
	map.put("data", data);
	map.put("list", projection);
	
	return new ResponseEntity<>(map,HttpStatus.FOUND);
}
}
	
	

