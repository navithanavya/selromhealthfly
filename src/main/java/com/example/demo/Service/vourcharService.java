package com.example.demo.Service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.vourcherRepository;
import com.example.demo.projection.accountvoucherprojection;

@Service
public class vourcharService {
@Autowired
private vourcherRepository repo;

public List<accountvoucherprojection> getall(Date firstDate, Date lastDate) {
	List<accountvoucherprojection> ac=repo.getall(firstDate,lastDate);
	return ac;
}
}
