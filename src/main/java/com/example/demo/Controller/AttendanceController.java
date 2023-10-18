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

import com.example.demo.Service.AttendanceService;
import com.example.demo.projection.Attendanceprojection;

@RestController
@RequestMapping(value = "api/attend")
public class AttendanceController {
	@Autowired
	private AttendanceService service;
	
	
	
	
	@GetMapping("getstaff/{firstDate}/{lastDate}")
//	@PreAuthorize("hasRole('ADMIN')")
	@PreAuthorize ("hasAuthority ('ROLE_ADMIN')  && hasRole ('ROLE_USER')")

	
	public List<Attendanceprojection> getstaff(@PathVariable Date firstDate ,@PathVariable Date lastDate) {
		return service.getstaff(firstDate,lastDate);
	}

	
	@GetMapping("getstaffattend/{firstDate}/{lastDate}")
	public ResponseEntity<?> getstaffattend(@PathVariable Date firstDate ,@PathVariable Date lastDate){
		return service.getstaffattend(firstDate,lastDate);
	}
	
	
		
		
		
	@GetMapping("greet")
	//@PreAuthorize("hasAuthority('ROLE_ADMIN', 'ROLE_SELROM')")
	@PreAuthorize ("hasAuthority ('ROLE_ADMIN')  && hasRole ('ROLE_USER')")
	public String adminControlString() {
		return "HELLO ADMIN";
	}
	
	@GetMapping("greeting")
	@PreAuthorize("hasRole('USER')")
	public String userControlString() {
		return "HELLO USER";
	}

	}



