package com.example.demo.Service;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.OpdbillRepository;
import com.example.demo.entity.opd_bill;
import com.example.demo.projection.OpdbillProjection;

@Service
public class OpdbillService {
 @Autowired
 private OpdbillRepository repository;

public List<opd_bill> getAll() {
	List<opd_bill> ob=repository.findAll();
	return ob;
}

public List<OpdbillProjection> get(Date firstDate, Date lastDate) {
	
	List<OpdbillProjection> OP=repository.getBetween(firstDate,lastDate);
	
	return OP;
}

public ResponseEntity<?> getallbills(Date firstDate, Date lastDate) {
    List<OpdbillProjection> bill=repository.getBillingBetweenDates(firstDate, lastDate);

	Map<String, Object>opdMap=new HashMap<>();
	Map<String, Object>Map=new HashMap<>();
	Map<String, Object>opdbill=new HashMap<>();
	int totalbills=0;
	int totalbillbyCash=0;
	int totalbillbyCard=0;
    int totalbillbyUpi=0;
	int totalbillbyOthers=0;
	int totalbillbyInsurance=0;
	int total=0;
	
	
//	totalbills=repository.getAllBillNumbers(firstDate,lastDate);

	
//opd billcash
	List<OpdbillProjection>Cash=repository.getopdByCash(firstDate,lastDate);
    for(OpdbillProjection op:Cash) {
	totalbillbyCash+=op.getNet();
     totalbills++;
     
    }
  //opd billcard
  	List<OpdbillProjection>Card=repository.getopdByCard(firstDate,lastDate);
     for(OpdbillProjection op:Card) {
  	totalbillbyCard+=op.getNet();
       totalbills++;
     }
     //opd billupi
     	List<OpdbillProjection>Upi=repository.getopdByUpi(firstDate,lastDate);
        for(OpdbillProjection op:Upi) {
     	totalbillbyUpi+=op.getNet();
          totalbills++;
    
        }
        
      //opd billothers
     	List<OpdbillProjection>Others=repository.getopdByOthers(firstDate,lastDate);
        for(OpdbillProjection op:Others) {
     	totalbillbyOthers+=op.getNet();
          totalbills++;
    
        }
        
      //opd billInsurance
     	List<OpdbillProjection>Insurance=repository.getopdByInsurance(firstDate,lastDate);
        for(OpdbillProjection op:Insurance) {
     	totalbillbyInsurance+=op.getNet();
          totalbills++;
        }
        
        opdbill.put("totalbills", totalbills);
        opdbill.put("totalbillbyCash", totalbillbyCash);
        opdbill.put("totalbillbyCard", totalbillbyCard);
        opdbill.put("totalbillbyUpi", totalbillbyUpi);
        opdbill.put("totalbillbyOthers", totalbillbyOthers);
        opdbill.put("totalbillbyInsurance", totalbillbyInsurance);
        
        Map.put("Report", opdbill);
        Map.put("list", bill);
        opdMap.put("bill", Map);
        		
        		

     
	return  new ResponseEntity<>(opdMap,HttpStatus.FOUND);


    }

 
}

