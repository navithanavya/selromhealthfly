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

import com.example.demo.Repository.OutpatientsListRepository;
import com.example.demo.dto.OpdEntryDto;
import com.example.demo.projection.OutpatientsListpprojection;

@Service
public class OutpatientsListService {
@Autowired
private OutpatientsListRepository repository;

public List<OutpatientsListpprojection> getall(Date firstDate, Date lastDate) {
	List<OutpatientsListpprojection> olp=repository.getall(firstDate,lastDate);
	return olp;
}

public ResponseEntity<?> getallbills(Date firstDate, Date lastDate) {
	
	List<OutpatientsListpprojection> projection=repository.getallbills(firstDate,lastDate);
	List<OpdEntryDto>list=new ArrayList<>()	;
	OpdEntryDto OpdEntry=new OpdEntryDto();
	
	Map<String, Object> map=new HashMap<>();
	
	OpdEntry.setNewpatients(repository.countNewpatients(firstDate,lastDate));
	OpdEntry.setReviewpatients(repository.countReviewpatients(firstDate,lastDate));
    OpdEntry.setPatientsin(repository.countpatientsin(firstDate, lastDate));
    OpdEntry.setPatientsin(repository.countpatientsout(firstDate, lastDate));
    OpdEntry.setWaiting(repository.countWaiting(firstDate, lastDate));
//    OpdEntry.setTotal(repository.getNetValue(firstDate, lastDate));
    
   map.put("OpdEntry", OpdEntry);
   map.put("list", projection);

	
	return new ResponseEntity<>(map,HttpStatus.FOUND);
}
}
