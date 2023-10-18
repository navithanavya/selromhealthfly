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

import com.example.demo.Repository.AttendanceRepository;
import com.example.demo.dto.AttendanceDto;
import com.example.demo.projection.Attendanceprojection;

@Service
public class AttendanceService {
@Autowired
private AttendanceRepository repository;

public List<Attendanceprojection> getstaff(Date firstDate, Date lastDate) {
	List<Attendanceprojection> ap=repository.getstaff(firstDate,lastDate);
	
	return ap;
}

public ResponseEntity<?> getstaffattend(Date firstDate, Date lastDate) {
	
	
	List<Attendanceprojection>a=repository.getstaffattend(firstDate,lastDate);
	List<AttendanceDto> list=new ArrayList<>();
	AttendanceDto data=new AttendanceDto();
	Map<String, Object> map=new HashMap<>();
	
	data.setTotalstaff(repository.getnet(firstDate,lastDate));
	data.setPresent(repository.countPresent(firstDate,lastDate));
	data.setAbsent(repository.countAbsent(firstDate,lastDate));
	data.setPercentage(repository.countPercentage(firstDate,lastDate));

	map.put("data",data);
	map.put("list", a);

	return new ResponseEntity<>(map,HttpStatus.FOUND);
}





}
