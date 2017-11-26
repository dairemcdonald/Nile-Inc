/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DatabaseSim.DBReader;
import DatabaseSim.DBWriter;
import Inventory.Inventory;
import Products.Film;
import Products.Game;
import Products.Product;
import Products.eBook;
import UserInterface.MainMenu;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author User
 */
public class mainControl implements Runnable{
    
    public String userID = "1";
    Thread thread;
    ArrayList<Film> films = new ArrayList<Film>();
    ArrayList<eBook> books = new ArrayList<eBook>();
    ArrayList<Game> games = new ArrayList<Game>();
    ArrayList<Product> products = new ArrayList<Product>();
    Inventory inventory = new Inventory();
    DBReader db = new DBReader();
    DBWriter dw = new DBWriter();
    public mainControl(){}
    
    public mainControl(ArrayList<Film> films,ArrayList<eBook> books,ArrayList<Game> games)
    {
        this.films = films;
        this.books = books;
        this.games = games;
    }
    
    public static void main(String args[])
    { 
        
        mainControl mc = new mainControl();
          
        mc.startApp();
    }
    public void startApp()
    {
        thread = new Thread(new mainControl(films,books,games));
        thread.start();
        fillGames();
        fillBooks();
        fillFilms();
        fillProducts();
        MainMenu show = new MainMenu();
        show.setDisplay(films,games,books,products);
        show.setVisible(true);
        System.out.println(films.size() + " " + games.size() + " " + books.size());
        inventory.fillInventory(products,userID);
        
    }
    
    public void fillGames()
    {
        String result = db.getGames();
        String split []= result.split(";");
        for(int i = 0; i < split.length; i++)
        {
            String temp[] = split[i].split(",");
            Game game = new Game(temp[0],Double.parseDouble(temp[1]),temp[2],temp[3],temp[4],Integer.parseInt(temp[5]),temp[6],temp[7]);
            games.add(game);
        }
    }
    public void fillFilms()
    {
        String result = db.getFilms();
        String split []= result.split(";");
        for(int i = 0; i < split.length; i++)
        {
            String temp[] = split[i].split(",");
            Film film = new Film(temp[0],Double.parseDouble(temp[1]),temp[2],temp[3],temp[4],temp[5],temp[6],temp[7],temp[8]);
            films.add(film);
        }
    }
    public void fillBooks()
    {
        String result = db.getBooks();
        String split []= result.split(";");
        for(int i = 0; i < split.length; i++)
        {
            String temp[] = split[i].split(",");
            eBook book = new eBook(temp[0],Double.parseDouble(temp[1]),temp[2],temp[3],temp[4],Integer.parseInt(temp[5]),temp[6],temp[7],temp[8]);
            books.add(book);
        }
    }
    public void fillProducts()
    {
        for(int i = 0 ; i < games.size(); i ++)
            products.add(games.get(i));
        for(int i = 0 ; i < books.size(); i ++)
            products.add(books.get(i));
        for(int i = 0 ; i < films.size(); i ++)
            products.add(films.get(i));
        
        
    }
    public ArrayList<Product> getProducts()
    {
        return products;
    }
    public Inventory getInventory()
    {
        return inventory;
    }
    
    public void run()
    {
        boolean finished = false;
        while(!finished)
        {
            try{
                TimeUnit.SECONDS.sleep(5);
                updateDatabase();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void updateDatabase() throws Exception
    {
        dw.writeEbooks(books);
        dw.writeGames(games);
        dw.writeMovies(films);
    }
   
    
    public void setGames(ArrayList<Game> games)
    {
        this.games = games;
    }
    public void setFilms(ArrayList<Film> films)
    {
        this.films = films;
    }
    public void setBooks(ArrayList<eBook> books)
    {
        this.books = books;
    }
    public void setProducts(ArrayList<Product> products)
    {
        this.products = products;
    }
}
