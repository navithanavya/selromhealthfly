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

import com.example.demo.Service.DuesListPharmacyService;
import com.example.demo.projection.DuesListPharmacyprojection;

@RestController
@RequestMapping(value="api/dues")
public class DuesListPharmacyController {
	@Autowired
	private DuesListPharmacyService service;
	
	@GetMapping("get/{firstDate}/{lastDate}")
	@PreAuthorize("hasRole('ADMIN')")
	public List<DuesListPharmacyprojection> get(@PathVariable Date firstDate ,@PathVariable Date lastDate) {
		return service.get(firstDate,lastDate);
		
	}
	
	@GetMapping("getall/{firstDate}/{lastDate}")
	public ResponseEntity<?> getallList(@PathVariable Date firstDate ,@PathVariable Date lastDate){
		return service.getallList(firstDate,lastDate);
		
	}
	
	
	@GetMapping("greet")
//	@PreAuthorize("hasRole('ADMIN')")
	@PreAuthorize ("hasAuthority ('ROLE_USER')  && hasRole ('ROLE_ADMIN')")

	public String admincontrolString() {
		return "HELLO";
		
	}
	@GetMapping("user")
	public String user() {
		return "user";
	}

}
