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
public class eBook extends Product{
    
    private int pages;
    private String author;
    private String language;
    private String publisher;
    
    public eBook(String id,double price, String description, String title, String genre , int pages, String author, String language, String publisher)
    {
        super(id,price, description, title, genre);
        this.pages = pages;
        this.author = author;
        this.language = language;
        this.publisher = publisher;
    }
    
    //getters
    public int getPages()
    {
        return pages;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getLanguage()
    {
        return language;
    }
    
    public String getPublisher()
    {
        return publisher;
    }
    
    //setters
    public void setPages(int newPages)
    {
        pages = newPages;
    }
    
    public void setAuthor(String newAuthor)
    {
        author = newAuthor;
    }
    
    public void setLanguage(String newLanguage)
    {
        language = newLanguage;
    }
    
    public void setPublisher(String newPublisher)
    {
        publisher = newPublisher;
    }
    
    public String toString()
    {
        return "Title: " + this.title +  "\nGenre: " + this.genre + "\nDescription: " + this.description + "\nPrice: " + this.price
                + "\nPages: " + this.pages + "\nAuthor: " + this.author + "\nLanguage: " + this.language + "\nPublisher: " + this.publisher + "\n";
    }
}