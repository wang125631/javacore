package com.wpx.demo31;

public class SellStock implements IOrder{

	private Stock stock;

	public SellStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.sell();
	}
	
	
	
}
