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
public class Film extends Product{
    
    public String runTime;
    public String language;
    public String director;
    public String actors = "";
    
    
    public Film(double price, String description, String title, String genre , String runTime, String language, String director, String actors)
    {
        super(price, description, title, genre);
        this.runTime = runTime;
        this.language = language;
        this.director = director;
        this.actors = actors;
    }
    
    //getters
    public String getRunTime()
    {
        return runTime;
    }
    
    public String getLanguage()
    {
        return language;
    }
    
    public String getDirector()
    {
        return director;
    }
    
    public String getActor()
    {
        return actors;
    }
    
    //setters
    public void setRunTime(String newRunTime)
    {
        runTime = newRunTime;
    }
    
    public void setLanguage(String newLanguage)
    {
        language = newLanguage;
    }
    
    public void setDirector(String newDirector)
    {
        director = newDirector;
    }
    
    public void setActor(String newActors)
    {
        actors = newActors;
    }
    
    //toString
    public String toString()
    {
         return "Title: " + this.title +  "\nGenre: " + this.genre + "\nDescription: " + this.description + "\nPrice: " + this.price
                 + "\nRuntime: " + this.runTime + "\nLanguage: " + this.language + "\nDirector: " + this.director + "\nActors: " + this.actors + "\n";
    } 
}