package com.example.demo.Service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.InpatientListRepository;
import com.example.demo.projection.InpatientListprojection;

@Service
public class InpatientListService {
@Autowired
private InpatientListRepository repository;

public List<InpatientListprojection> getall(Date firstDate, Date lastDate) {
	List<InpatientListprojection> ip=repository.getall(firstDate,lastDate);
	return ip;
}
}
