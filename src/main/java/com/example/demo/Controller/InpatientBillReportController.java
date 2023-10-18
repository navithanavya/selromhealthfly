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

import com.example.demo.Service.InpatientBillReportService;
import com.example.demo.projection.InpatientBillReportprojection;

@RestController
@RequestMapping(value="api/report")
public class InpatientBillReportController {
@Autowired
private InpatientBillReportService service;

@GetMapping("getall/{firstDate}/{lastDate}")
@PreAuthorize("hasRole('ADMIN')")

public List<InpatientBillReportprojection> getall(@PathVariable Date firstDate,@PathVariable Date lastDate) {
	return service.getall(firstDate,lastDate);
}
@GetMapping("getallbills/{firstDate}/{lastDate}")
public ResponseEntity<?>getallbills(@PathVariable Date firstDate,@PathVariable Date lastDate){
	return service.getallbills(firstDate,lastDate);
}

@GetMapping("greet")
@PreAuthorize("hasRole('ADMIN')")
public String billcontrol() {
	return "BILL REPORT";
	
}


}
