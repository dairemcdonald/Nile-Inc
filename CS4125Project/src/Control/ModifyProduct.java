/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Products.Product;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ModifyProduct {
    public ModifyProduct()
    {
        
    }
    public ArrayList<Product> changePrice(ArrayList<Product> products, String productID, Double newPrice)
    {
        for(int i = 0; i < products.size(); i++)
        {
            if(products.get(i).getID().equalsIgnoreCase(productID))
                products.get(i).setPrice(newPrice);
        }
        return products;
    }
     public ArrayList<Product> changeDescription(ArrayList<Product> products, String productID, String newDescription)
    {
        for(int i = 0; i < products.size(); i++)
        {
            if(products.get(i).getID().equalsIgnoreCase(productID))
                products.get(i).setDescription(newDescription);
        }
        return products;
    }
}
