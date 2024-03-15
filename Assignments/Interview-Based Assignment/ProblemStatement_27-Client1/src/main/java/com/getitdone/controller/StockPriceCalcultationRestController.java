package com.getitdone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getitdone.client.StockClient;

@RestController
@RequestMapping("api/calc")
public class StockPriceCalcultationRestController {
	@Autowired
	private StockClient client;
	
	@GetMapping("calculate/{companyName}/{quantity}")
	public ResponseEntity<?> calcPrice(@PathVariable String companyName,@PathVariable Integer quantity){
		System.out.println("Client class name"+client.getClass().getName());
		ResponseEntity<?> responseEntity=null;
        Double totalAmount=null;
		try {
			ResponseEntity<Double> price = client.getStockPrice(companyName);
			int statusCodeValue = price.getStatusCode().value();
			if(statusCodeValue==200) {
			  Double body = price.getBody();
			  totalAmount=quantity*body;
			  String response="Total amount is :"+totalAmount;
			  
			  responseEntity= new ResponseEntity<String>(response,HttpStatus.OK);
				
			}
			
		}catch(Exception e) {
			responseEntity=new ResponseEntity<String>("Company not found",HttpStatus.BAD_REQUEST);
		}
		return responseEntity;
	}
	

}
