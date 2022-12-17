package com.techelevator.products;

import java.util.List;

public class DisplayMessages   {


    public static void welcomeMessage() {
        System.out.print("-----------------------------------------------\n");
        System.out.printf("|           %20s              |\n", "Vendo-Matic 800");
        System.out.printf("|%s|\n", "Welcome! Thank you for shopping with us today");
        System.out.print("-----------------------------------------------\n");
    }

    public static void displayProducts() {
        UpdateInventory products = new UpdateInventory();
        List<Inventory> forSale = products.getForSale();


        for (Inventory inventory : forSale) {
            System.out.printf("| %18s  | %10s | %5s |  %5s \n",
                    inventory.getVendPosition(),
                    inventory.getProductName(),
                    inventory.getPrice(),
                    inventory.getStockOf());
        }
    }


}
