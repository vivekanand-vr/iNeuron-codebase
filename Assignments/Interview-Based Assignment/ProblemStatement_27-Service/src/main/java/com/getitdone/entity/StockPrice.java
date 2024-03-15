package com.getitdone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="STOCK_PRICE")
public class StockPrice {
	@Id
	@Column(name="STOCK_ID")
	private Integer stockId;
	@Column(name="COMPANY_NAME")
	private String company;
	@Column(name="STOCK_PRICE")
	private double stockPrice;

}
