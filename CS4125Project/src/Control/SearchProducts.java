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
public class SearchProducts {
    public SearchProducts()
    {
        
    }
    
    public String searchForProduct(String name, ArrayList<Product> products)
    {
        String result = "";
        boolean found = false;
        for(int i = 0; i < products.size(); i++)
        {
            if(products.get(i).getTitle().equalsIgnoreCase(name))
            {
                found = true;
                result += products.get(i).toString() + "\n";
            }
        }
        if(found == false)
            result = "No matches were found for that title";
        return result;
    }
}
