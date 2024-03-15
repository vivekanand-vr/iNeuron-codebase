package com.getitdone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getitdone.entity.StockPrice;
import com.getitdone.exception.StockNotFoundException;
import com.getitdone.repository.StockPriceRepository;
@Service
public class StockServiceImpl implements IStockService {
    @Autowired
	private StockPriceRepository repo;
	@Override
	public double getStockPrice(String companyName) {
		
		 StockPrice stockPrice = repo.findByCompany(companyName);
		 if(stockPrice==null) {
			 throw new StockNotFoundException("Company not available");
		 }
		 return stockPrice.getStockPrice();
	}

}
