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
public class RemoveProduct {
    
    public RemoveProduct()
    {
       
        
    }
    public ArrayList<Product> removeItem(ArrayList<Product> products, String productID)
    {
        for(int i = 0; i < products.size(); i++)
        {
            if(products.get(i).getID().equalsIgnoreCase(productID))
            {
                products.remove(products.get(i));
            }
        }
        return products;
    }
}
