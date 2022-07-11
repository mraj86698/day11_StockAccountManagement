package StockAccount;

import java.util.Scanner;

public class StockPortfolio {

	public static void main(String[] args) {
		Stock stock = new Stock();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Welcome to Stock Account Management");
			System.out.println("Enter 1 to add stock ");
			System.out.println("Enter 2 to Calculate stock Value");
			System.out.println("Enter 3 to Display Total Stock Value");

			int input = sc.nextInt();
			if (input == 1) {
				stock.addStock();
				System.out.println("Added Stock Value");
			} else if (input == 2) {
				stock.calStockValue();
			} else if (input == 3) {
				System.out.println(stock.list);
				stock.totalStockValue();
			}

		}
	}

}
