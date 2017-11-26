/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Products;

/**
 *
 * @author Trevor
 */
public class Product {
    
    public String id;
    public double price;
    public String description;
    public String title;
    public String genre;
   
    Product(String id, double price, String description, String title, String genre)
    {
        this.id = id;
        this.price = price;
        this.description = description;
        this.title = title;
        this.genre = genre;
    }
    
   
    
    //getters
    public String getID()
    {
        return id;
    }
    public double getPrice()
    {
        return price;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public String getTitle()
    {
        return title;
    }
    
     public String getGenre()
    {
        return genre;
    }
     
     //setters 
     public void setPrice(double price)
     {
         this.price = price;
     }
     
     public void setDescription(String newDescription)
     {
         this.description = newDescription;
     }
     
     public void setTitle(String newTitle)
     {
         this.title = newTitle;
     }
     
      public void setGenre(String newGenre)
     {
         this.genre = newGenre;
     }
}