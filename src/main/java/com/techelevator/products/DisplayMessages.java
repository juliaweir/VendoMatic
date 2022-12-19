package com.techelevator.products;

import java.util.List;

public class DisplayMessages   {


    public static void welcomeMessage() {
        System.out.print("------------------------------------------------------------------\n");
        System.out.printf("|                           %s                      |\n", "Vendo-Matic 800");
        System.out.printf("|                 %s      |\n", "Please select a vend position at checkout");
        System.out.print("------------------------------------------------------------------\n");
        System.out.printf("| %4s  | %15s       | %5s |  %5s        |\n", "Vend Position", "Product", "Price", "Stock");
        System.out.print("------------------------------------------------------------------\n");
    }

    public static void displayProducts() {
        UpdateInventory products = new UpdateInventory();
        List<Inventory> forSale = products.updateInventory();



        for (Inventory inventory : forSale) {
            System.out.printf("| %4s  | %-25s      | $%5s | Quantity : %s |\n",
                    inventory.getVendPosition(),
                    inventory.getProductName(),
                    inventory.getPrice(),
                    inventory.getStockOf());
        }
        System.out.print("------------------------------------------------------------------\n");
    }


}
