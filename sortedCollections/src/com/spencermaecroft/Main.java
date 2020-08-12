package com.spencermaecroft;

/**
 * Created by SMC on 08/12/2020
 */
public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.50, 8);
        stockList.addStock(temp);

        temp = new StockItem("Hotdogs", 6.50, 15);
        stockList.addStock(temp);

        temp = new StockItem("Buns", 2.50, 65);
        stockList.addStock(temp);

        temp = new StockItem("Tomato", 1.50, 10);
        stockList.addStock(temp);

        temp = new StockItem("Cheese", 4.50, 25);
        stockList.addStock(temp);

        temp = new StockItem("Chips", .99, 18);
        stockList.addStock(temp);

        temp = new StockItem("Brownies", 1.50, 80);
        stockList.addStock(temp);

        temp = new StockItem("Coffee Beans", 9.50, 75);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet()){
            System.out.println(s);
        }
    }
}
