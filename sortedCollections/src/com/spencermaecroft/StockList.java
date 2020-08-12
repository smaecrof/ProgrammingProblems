package com.spencermaecroft;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by SMC on 08/12/2020
 */
public class StockList {
    private final Map<String, StockItem> list;

    public StockList(){
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item){
        if(item != null){
            // Check if we already have quantities of this item
            StockItem inStock = list.getOrDefault(item.getName(), item);

            // If there are already stocks on this item, adjust the quantity
            if(inStock != item){
                item.adjustStock(inStock.getQuantityStock());
            }

            list.put(item.getName(), item);
            return item.getQuantityStock();
        }
        return 0;
    }

    public int sellStock(String itemName, int quantity){
        StockItem inStock = list.getOrDefault(itemName, null);

        if((inStock != null) && (inStock.getQuantityStock() >= quantity) && (quantity > 0)){
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem get(String key){
        return list.get(key);
    }

    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStockList\n";
        double totalCost = 0.0;

        for(Map.Entry<String, StockItem> item : list.entrySet()){
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.getQuantityStock();
            s = s + stockItem + ". There are " + stockItem.getQuantityStock() + " in stock. Value of items: $";
            s = s + String.format("%.2f",itemValue) + "\n";
            totalCost += itemValue;
        }

        return s + "Total stock value :$" + String.format("%.2f",totalCost);
    }
}
