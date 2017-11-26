/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DatabaseSim.DBReader;
import Products.Film;
import Products.Game;
import Products.Product;
import Products.eBook;
import UserInterface.MainMenu;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class mainControl {
    ArrayList<Film> films = new ArrayList<Film>();
    ArrayList<eBook> books = new ArrayList<eBook>();
    ArrayList<Game> games = new ArrayList<Game>();
    ArrayList<Product> products = new ArrayList<Product>();
    DBReader db = new DBReader();
    public static void main(String args[])
    { 
        
        mainControl mc = new mainControl();
        mc.run();
    }
    public void run()
    {
        fillGames();
        fillBooks();
        fillFilms();
        fillProducts();
        MainMenu show = new MainMenu(films,books,games,products);
    }
    public void fillGames()
    {
        String result = db.getGames();
        String split []= result.split(";");
        for(int i = 0; i < split.length; i++)
        {
            String temp[] = split[i].split(",");
            Game game = new Game(Double.parseDouble(temp[0]),temp[1],temp[2],temp[3],Integer.parseInt(temp[4]),temp[5],temp[6]);
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
            Film film = new Film(Double.parseDouble(temp[0]),temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7]);
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
            eBook book = new eBook(Double.parseDouble(temp[0]),temp[1],temp[2],temp[3],Integer.parseInt(temp[4]),temp[5],temp[6],temp[7]);
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
}
