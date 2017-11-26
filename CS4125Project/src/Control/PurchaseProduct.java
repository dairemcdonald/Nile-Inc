/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Inventory.Inventory;
import Products.Product;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class PurchaseProduct {
    public PurchaseProduct()
    {
        
    }
    
    public Inventory buyProduct(Inventory inventory, String productID, double price, double balance)
    {
        if(balance >= price)
            inventory.addProduct(productID);
        return inventory;
    }
}
