package com.example.demo.Controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.OpdbillService;
import com.example.demo.entity.opd_bill;
import com.example.demo.projection.OpdbillProjection;

@RestController
@RequestMapping(value="auth/opdbill")
public class OpdbillController {
@Autowired
private OpdbillService service;

@GetMapping("getAll")
public List<opd_bill> getAll() {
	return service.getAll();
}
@GetMapping("get/{firstDate}/{lastDate}")
//@PreAuthorize("hasAnyRole('ADMIN','USER')")
public List<OpdbillProjection> get(@PathVariable Date firstDate,@PathVariable Date lastDate) {
	return service.get(firstDate,lastDate);
	
}
@GetMapping("getallbills/{firstDate}/{lastDate}")
public ResponseEntity<?>getallbills(@PathVariable Date firstDate,@PathVariable Date lastDate){
	return service.getallbills(firstDate,lastDate);
	
}
}


