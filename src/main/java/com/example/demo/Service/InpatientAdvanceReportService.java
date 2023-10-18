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

import com.example.demo.Repository.InpatientAdvanceReportRepository;
import com.example.demo.dto.InpatientBillReportDto;
import com.example.demo.entity.ip_advance;
import com.example.demo.projection.InpatientAdvanceReportprojection;
import com.example.demo.projection.InpatientBillReportprojection;

@Service
public class InpatientAdvanceReportService {
@Autowired
private InpatientAdvanceReportRepository repo;

public ip_advance saveDetails(ip_advance ia) {
	ip_advance advance=repo.save(ia);
	return advance;
}

public List<InpatientAdvanceReportprojection> getall(Date firstDate, Date lastDate) {
	List<InpatientAdvanceReportprojection> p=repo.getall(firstDate,lastDate);
	return p;
}

public ResponseEntity<?> getallbills(Date firstDate, Date lastDate) {
	
	List<InpatientAdvanceReportprojection> projection=repo.getallbill(firstDate,lastDate);
	List<InpatientBillReportDto> list=new ArrayList<>();
	InpatientBillReportDto data=new InpatientBillReportDto();
	Map<String, Object>map=new HashMap<>();
	
	data.setNoOfBills(repo.countNoOfBills(firstDate,lastDate));
	data.setCash(repo.countCash(firstDate,lastDate));
	data.setCard(repo.countCard(firstDate,lastDate));
	data.setUpi(repo.countUpi(firstDate,lastDate));
	data.setInsurance(repo.countInsurance(firstDate,lastDate));
	data.setOthers(repo.countOthers(firstDate,lastDate));
	data.setTotal(repo.getNet(firstDate,lastDate));
	map.put("data", data);
	map.put("list", projection);
	
	return new ResponseEntity<>(map,HttpStatus.FOUND);
}
}


