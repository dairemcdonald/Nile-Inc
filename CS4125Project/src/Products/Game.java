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
public class Game extends Product{
    
    public int ageRestriction;
    public String developer;
    public String platform;
    
    public Game(double price, String description, String title, String genre , int ageRestriction, String developer, String platform)
    {
        super(price, description, title, genre);
        this.ageRestriction = ageRestriction;
        this.developer = developer;
        this.platform = platform;
    }
    
    //getters
    public int getAgeRestriction()
    {
        return ageRestriction;
    }
    
    public String getDeveloper()
    {
        return developer;
    }
    
    public String platform()
    {
        return platform;
    }
    
    //setters
    public void setAgeRestriction(int newAgeRestriction)
    {
        this.ageRestriction = newAgeRestriction;
    }
    
    public void setDeveloper(String newDeveloper)
    {
        this.developer = newDeveloper;
    }
    
    public void setPlatform(String newPlatform)
    {
        this.platform = newPlatform;
    }
    
    
    public String toString()
    {
        return "Title: " + this.title +  "\nGenre: " + this.genre + "\nDescription: " + this.description + "\nPrice: " + this.price
                + "\nAge Restriction: " + this.ageRestriction + "\nDeveloper: " + this.developer + "\nPlatform: " + this.platform + "\n";
    }
}