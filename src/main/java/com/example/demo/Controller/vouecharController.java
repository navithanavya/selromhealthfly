package com.example.demo.Controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.vourcharService;
import com.example.demo.projection.accountvoucherprojection;

@RestController
@RequestMapping(value="api/account")
public class vouecharController {
@Autowired
private vourcharService service;

@GetMapping("getall/{firstDate}/{lastDate}")
@PreAuthorize("hasRole('USER')")
public List<accountvoucherprojection> getall(@PathVariable Date firstDate ,@PathVariable Date lastDate) {
	return service.getall(firstDate,lastDate);
	
}

}
