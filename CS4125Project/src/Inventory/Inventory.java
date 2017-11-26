/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;

import DatabaseSim.DBReader;
import Products.Product;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Inventory {
    public ArrayList<Product> myInventory = new ArrayList();
    public ArrayList<Product> products;
    public String userID;
    public Inventory()
    {
        
    }
    public void fillInventory(ArrayList<Product> products,String userID)
    {
        this.userID = userID;
        this.products = products;
        DBReader db = new DBReader();
        String userInventory = "";
        String inventoryList = db.getInventory();
        String [] inventoryArray = inventoryList.split(";");
        for(int i = 0; i < inventoryArray.length; i ++) //find the users inventory given by their id
        {
            String temp [] = inventoryArray[i].split(",");
            if(temp[i].equalsIgnoreCase(userID))
            {
                userInventory = inventoryArray[i]; 
            }
        }
        
        //fill their inventory with products they have purchased already
        String split [] = userInventory.split(",");
        for(int i = 1; i < split.length; i++)
        {
            for(int j = 0; j < products.size();j++)
            {
                if(split[i].equalsIgnoreCase(products.get(j).getID()))
                {
                    myInventory.add(products.get(j));
                }
            }
        }
    }
    
    public void addProduct(String productID)
    {
        for(int i = 0; i < products.size(); i++)
        {
            if(products.get(i).getID().equalsIgnoreCase(productID))
                myInventory.add(products.get(i));
        }
    }
    
    public ArrayList<Product> getInventory()
    {
        return myInventory;
    }
    
   
}
