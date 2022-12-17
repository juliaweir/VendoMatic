package com.techelevator.products;

import junit.framework.TestCase;

public class DisplayInventoryTest extends TestCase {
    //test for an inventory list inherited from inventory

    public void testDisplayInventory() {
        /*
            if user selecting "(1) Display Vending Machine Items"
            then list of displayItems prints out
            a list of all items in the vending machine with its quantity remaining:
         */
        //test that is reading inventory from an input file (**rubric**)  when machine starts

        //    - Each vending machine product has a slot identifier and a purchase price.
                //test for a map of int slot id and (int ?) purchase price

        //    - Each slot in the vending machine has enough room for 5 of that product.
                //inventory can add up to five
                //test edge cases ,can it stock 5? -1?

        //    - Every product is initially stocked to the maximum amount.
            // five is max number from readme? test for no magic numbers?


        //    - A product that has run out must indicate that it's SOLD OUT.
            //if item inventory is <= 0 returns sold out

    }
}