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

import com.example.demo.Service.OutpatientsListService;
import com.example.demo.entity.opd_entry;
import com.example.demo.projection.OutpatientsListpprojection;

@RestController
@RequestMapping(value = "api/opdentry")
public class OutpatientsListController {
	@Autowired
	private OutpatientsListService service;
	
	
	@GetMapping("getall/{firstDate}/{lastDate}")
	@PreAuthorize("hasRole('ADMIN')")

	public List<OutpatientsListpprojection> getall(@PathVariable Date firstDate,@PathVariable Date lastDate) {
		return service.getall(firstDate,lastDate);
	}

	@GetMapping("getallbills/{firstDate}/{lastDate}")
	public ResponseEntity<?> getallbills(@PathVariable Date firstDate,@PathVariable Date lastDate) {
		return service.getallbills(firstDate,lastDate);
		
	}
	
	@GetMapping("greet")
	@PreAuthorize("hasRole('ADMIN')")
	public String admin() {
		return "AKHILA";
		
	}
	
}
