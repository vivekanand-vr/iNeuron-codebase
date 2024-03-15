package com.getitdone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getitdone.entity.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice, Integer> {
 
	public StockPrice findByCompany(String companay);
	
}
