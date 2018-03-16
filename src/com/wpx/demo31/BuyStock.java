package com.wpx.demo31;

public class BuyStock implements IOrder{

	private Stock stock;

	public BuyStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.buy();
	}

}
