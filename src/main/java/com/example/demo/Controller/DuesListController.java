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

import com.example.demo.Service.DuesListService;
import com.example.demo.projection.DuesListprojection;

@RestController
@RequestMapping(value="api/list")
public class DuesListController {

	@Autowired
	private DuesListService service;
	
	
	
	@GetMapping("get/{firstDate}/{lastDate}")
	@PreAuthorize("hasRole('USER')")

	public List<DuesListprojection> get(@PathVariable Date firstDate ,@PathVariable Date lastDate) {
		return service.get(firstDate,lastDate);
		
	}
	
	@GetMapping("getallList/{firstDate}/{lastDate}")
	public ResponseEntity<?> getallList(@PathVariable Date firstDate ,@PathVariable Date lastDate){
		return service.getallList(firstDate,lastDate);
		
	}
	
	@GetMapping("lists")
//	@PreAuthorize("hasRole('USER')")
	@PreAuthorize ("hasAuthority ('ROLE_USER')  && hasRole ('ROLE_ADMIN')")

	public String userlist() {
		return "DUESLIST";
		
	}
   @GetMapping("list")
   public String userlists() {
	return "list";
	   
	   
   }
}
