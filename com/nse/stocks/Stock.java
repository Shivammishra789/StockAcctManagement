package com.nse.stocks;

import java.util.ArrayList;

public class Stock {
	
	private String shareName;
	private int noOfStocks, noOfShare; 
	private  double sharePrice;
	private  double eachStockValue; 
	

	public double getEachStockValue() {
		return eachStockValue;
	}

	public void setEachStockValue(double eachStockValue) {
		this.eachStockValue = eachStockValue;
	}

	public Stock(String shareName, int noOfShare, double sharePrice) {
		super();
		this.shareName = shareName;
		this.noOfShare = noOfShare;
		this.sharePrice = sharePrice;
	}

	public int getNoOfShare() {
		return noOfShare;
	}

	public void setNoOfShare(int noOfShare) {
		this.noOfShare = noOfShare;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

	@Override
	public String toString() {
		return "Stock [shareName=" + shareName + ", noOfShare=" + noOfShare
				+ ", sharePrice=" + sharePrice + ", eachStockValue=" + "]";
	}

	

	
	
}
