/*Stock Account Management
a. Desc -> Write a program to read in Stock Names, Number of Share, Share Price.
Print a Stock Report with the total value of each Stock and the total value of Stock.
b. I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of Share, and Share Price
c. Logic -> Calculate the value of each stock and the total value
d. O/P -> Print the Stock Report.*/

package com.bridgelabz.Stockmanagement;
import java.util.*;

public class StockPortfolio {
    ArrayList<Stock> stockAccountsList = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    private void setStocks() {
        System.out.println("Enter the Number of Stock Account You Want : ");
        int no = sc.nextInt();
        for(int i = 0; i < no; i++) {
            Stock stockAccount = new Stock();
            setStockInfo(stockAccount,i);
        }
    }

    private void setStockInfo(Stock stockAccount, int i) {
        System.out.println("Enter the Stock "+(i+1)+" Information :");
        System.out.println("Enter the Stock Name :");
        stockAccount.setStockName(sc.next());
        System.out.println("Enter the Number of Shares :");
        stockAccount.setNoOfShares(sc.nextInt());
        System.out.println("Enter the Price of Shares :");
        stockAccount.setSharePrice(sc.nextDouble());
        stockAccount.setShareTotalValue(stockAccount.getNoOfShares(),stockAccount.getSharePrice());
        stockAccountsList.add(stockAccount);
    }

    private void getStockInfo() {
        int i = 1;
        for(Stock stockAccount : stockAccountsList) {
            System.out.println("The Stock "+i+" Information is :");
            System.out.println("Stock Name : "+stockAccount.getStockName());
            System.out.println("Number of Shares : "+stockAccount.getNoOfShares());
            System.out.println("Price of Shares : "+stockAccount.getSharePrice());
            System.out.println("Total Value of Shares : "+stockAccount.getShareTotalValue());
            i++;
        }
    }

    public static void main(String[] args) {
        StockPortfolio stockPortfolio = new StockPortfolio();
        stockPortfolio.setStocks();
        stockPortfolio.getStockInfo();
    }
}
