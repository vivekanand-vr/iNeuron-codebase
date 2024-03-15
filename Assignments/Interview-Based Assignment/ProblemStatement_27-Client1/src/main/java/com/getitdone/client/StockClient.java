package com.getitdone.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("StockPriceService")
public interface StockClient {

	 @GetMapping("api/price/stockprice/{companyName}")
		public ResponseEntity<Double> getStockPrice(@PathVariable("companyName" )String companyName);
}
