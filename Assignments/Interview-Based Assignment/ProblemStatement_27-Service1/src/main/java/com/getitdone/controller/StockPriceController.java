package com.getitdone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getitdone.service.IStockService;

@RestController
@RequestMapping("api/price")
public class StockPriceController {
	
	@Autowired
	private IStockService service;
    @GetMapping("stockprice/{companyName}")
	public ResponseEntity<Double> getStockPrice(@PathVariable("companyName" )String companyName){
		
		Double stockPrice = service.getStockPrice(companyName);
		return new ResponseEntity<Double>(stockPrice,HttpStatus.OK);
		
	}
	
}
