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

import com.example.demo.Service.PharmacyService;
import com.example.demo.projection.Pharmacyprojection;

@RestController
@RequestMapping(value="api/sales")
public class PharmacyController {
	@Autowired
	private PharmacyService service;
	
	 
//	@GetMapping("sale")
	@PreAuthorize("hasRole('USER')")

	@GetMapping("getall/{firstDate}/{lastDate}")
	public List<Pharmacyprojection> getall(@PathVariable Date firstDate,@PathVariable Date lastDate) {
		return service.getall(firstDate,lastDate);
	}
	@GetMapping("getallsales/{firstDate}/{lastDate}")
	public ResponseEntity<?>getallsales(@PathVariable Date firstDate,@PathVariable Date lastDate){
		return service.getallsales(firstDate,lastDate);

	}
	
//	@GetMapping("sale")
//	@PreAuthorize("hasRole('USER')")
//	public String pharmacycontroller() {
//		return "PHARMACY LIST";
//		
//	}
}
