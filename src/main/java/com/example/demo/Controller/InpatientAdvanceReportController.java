package com.example.demo.Controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.InpatientAdvanceReportService;
import com.example.demo.entity.ip_advance;
import com.example.demo.projection.InpatientAdvanceReportprojection;

@RestController
@RequestMapping(value="api/advance")
public class InpatientAdvanceReportController {
@Autowired
private InpatientAdvanceReportService service;


@PostMapping("save")
public ip_advance saveDetails(@RequestBody  ip_advance ia) {
	return service.saveDetails(ia);
	
}
@GetMapping("getall/{firstDate}/{lastDate}")
@PreAuthorize("hasRole('ADMIN')")

public List<InpatientAdvanceReportprojection> getall(@PathVariable Date firstDate,@PathVariable Date lastDate) {
	return service.getall(firstDate,lastDate);
}
@GetMapping("getallbills/{firstDate}/{lastDate}")
public ResponseEntity<?>getallbills(@PathVariable Date firstDate,@PathVariable Date lastDate){
	return service.getallbills(firstDate,lastDate);

}

@GetMapping("greet")
//@PreAuthorize("hasRole('ADMIN')")
@PreAuthorize ("hasAuthority ('ROLE_USER')  && hasRole ('ROLE_ADMIN')")

public String controladmin() {
	return "SELROM";
	
}
@GetMapping("greeting")
public String usercontrol() {
	return "hello";
}

}
