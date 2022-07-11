package StockAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock {
	String stockName;
    int numShares;
    int sharePrice;

    ArrayList<Stock> list ;

    Scanner sc = new Scanner(System.in);


    public Stock(String stockName, int numShares, int sharePrice) {
        this.stockName = stockName;
        this.numShares = numShares;
        this.sharePrice = sharePrice;
    }


	public Stock() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
	}


	@Override
	public String toString() {
		return "StockName=" + stockName + " \nnumShares=" + numShares + " \nsharePrice=" + sharePrice ;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNumShares() {
		return numShares;
	}

	public void setNumShares(int numShares) {
		this.numShares = numShares;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	public void addStock() {

		System.out.println("Enter stock name");
        String stockName = sc.next();
        System.out.println("Enter number of share");
        int numShare = sc.nextInt();
        System.out.println("Enter share price");
        int sharePrice = sc.nextInt();

        Stock stock = new Stock(stockName,numShare,sharePrice);
        list.add(stock);


	}

	public void calStockValue() {
		System.out.println("Enter Stock Name: ");
        String stockName = sc.next();
        for (Stock stock : list) {
            if (stock.getStockName().equals(stockName)){
                int value = stock.getNumShares()*stock.getSharePrice();
                System.out.println(stock.getStockName()+" number of shares: "+stock.getNumShares()+"\n Share price: "+stock.getSharePrice()+" \nTotal value: "+value);
            }
            else {
                System.out.println(stock.getStockName()+" is not available in your list");
            }
        }

	}

	public void totalStockValue() {
		int numOfStock = list.size();
        for (Stock stock : list) {
            int sum =0;
            for (int i = stock.getNumShares(); i < numOfStock; i++) {
                sum += stock.getSharePrice();
                System.out.println(sum);
            }
        }


	}


}
