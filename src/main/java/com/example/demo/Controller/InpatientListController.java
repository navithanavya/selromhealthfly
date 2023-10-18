package com.example.demo.Controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.InpatientListService;
import com.example.demo.projection.InpatientListprojection;

@RestController
@RequestMapping(value = "auth/ipentry")
public class InpatientListController {
	@Autowired
	private InpatientListService service;

	@GetMapping("getall/{firstDate}/{lastDate}")
	
	public List<InpatientListprojection> getall(@PathVariable Date firstDate ,@PathVariable Date lastDate) {
		return service.getall(firstDate,lastDate);
		
	}
}
