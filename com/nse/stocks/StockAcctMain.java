package com.nse.stocks;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAcctMain {

	ArrayList<Stock> stockData = new ArrayList<Stock>();
	double[] singleStockValue = new double[10];
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StockAcctMain main = new StockAcctMain();
		main.stockInfo();
		main.individualStockValue();
		main.printStockReport();
		main.totoalStockValue();
		
		
	}
	public void stockInfo() {								//getting stock info from user

		System.out.println("enter number of stocks ");
		int noOfStocks = sc.nextInt();
		for(int i = 0; i < noOfStocks; i++) {	
			System.out.println("enter stock name");
			String shareName = sc.next();
			System.out.println("enter number of share");
			int noOfShare = sc.nextInt();
			System.out.println("enter share price");
			double sharePrice = sc.nextInt();
			Stock newStock = new Stock( shareName, noOfShare, sharePrice );
			stockData.add(newStock);
		}
	}
	public void individualStockValue(){						//calculating stock value 
		for(int j = 0; j < stockData.size(); j++) {
			double eachStockValue = stockData.get(j).getNoOfShare() * stockData.get(j).getSharePrice();
			singleStockValue[j] = eachStockValue;		
		}
	}
	public void totoalStockValue() {						//calculating total portfolio value
		double totalPortfolioValue =0;
		for(int k =0; k < singleStockValue.length; k++) {
		totalPortfolioValue = totalPortfolioValue + singleStockValue[k];
		}
		System.out.println("Total Portfolio Value is " + totalPortfolioValue);
	}
	public void printStockReport() {							//printing stock report
		System.out.println("Stock Name	Total Value ");

		for(int j = 0; j < stockData.size(); j++) {
			System.out.println(stockData.get(j).getShareName() +"		" + singleStockValue[j]);
		}
	}
	
}
