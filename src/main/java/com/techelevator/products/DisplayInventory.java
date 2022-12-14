package com.techelevator.products;

import java.util.List;

public class DisplayInventory {

    private List<Inventory> displayItems;

    public void displayInventory(){
        UpdateInventory update = new UpdateInventory();
        displayItems = update.getForSale();
        System.out.printf("-----------------------------------------------\n");
        System.out.printf("|           %20s              |\n","Vendo-Matic 800");
        System.out.printf("|%10s|\n", "Welcome! Thank you for shopping with us today");
        System.out.printf("-----------------------------------------------\n");



        for (int i = 0; i < displayItems.size(); i++){

            System.out.printf("| %15s | %10s | %10s |\n",
                    displayItems.get(i).getProductName(),
                    displayItems.get(i).getPrice(),
                    displayItems.get(i).getType());
        }

    }

}
