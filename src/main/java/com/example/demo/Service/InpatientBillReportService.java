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

import com.example.demo.Repository.InpatientBillReportRepository;
import com.example.demo.dto.InpatientBillReportDto;
import com.example.demo.projection.InpatientBillReportprojection;

@Service
public class InpatientBillReportService {
@Autowired
private InpatientBillReportRepository repository;

public List<InpatientBillReportprojection> getall(Date firstDate, Date lastDate) {
	List<InpatientBillReportprojection> p=repository.getall(firstDate,lastDate);
	return p;
}

public ResponseEntity<?> getallbills(Date firstDate, Date lastDate) {
	
	List<InpatientBillReportprojection> projection=repository.getallbill(firstDate,lastDate);
	List<InpatientBillReportDto> list=new ArrayList<>();
	InpatientBillReportDto data=new InpatientBillReportDto();
	Map<String, Object>map=new HashMap<>();
	
	data.setNoOfBills(repository.countNoOfBills(firstDate,lastDate));
	data.setCash(repository.countCash(firstDate,lastDate));
	data.setCard(repository.countCard(firstDate,lastDate));
	data.setUpi(repository.countUpi(firstDate,lastDate));
	data.setInsurance(repository.countInsurance(firstDate,lastDate));
	data.setOthers(repository.countOthers(firstDate,lastDate));
	data.setTotal(repository.getNet(firstDate,lastDate));
	map.put("data", data);
	map.put("list", projection);
	
	return new ResponseEntity<>(map,HttpStatus.FOUND);
}
}
