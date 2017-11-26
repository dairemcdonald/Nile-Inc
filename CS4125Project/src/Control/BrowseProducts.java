
package Control;

import DatabaseSim.DBReader;
import Products.Film;
import Products.eBook;
import Products.Game;
import Products.Product;
import java.util.ArrayList;


public class BrowseProducts {
    DBReader db;
    ArrayList<Film> films;
    ArrayList<eBook> books;
    ArrayList<Game> games ;
    ArrayList<Product> products;
    public BrowseProducts(ArrayList<Film> films, ArrayList<eBook> books, ArrayList<Game> games, ArrayList<Product> products)
    {
        this.films = films;
        this.books = books;
        this.games = games;
        this.products = products;
    }
    public String getFilmsList()
    {
        String result = "";
        for(int i = 0; i < films.size(); i++)
        {
            result += films.get(i).toString() + "\n";
        }
        return result;
    } 
    public String getBooksList()
    {
       
        String result = "";
        for(int i = 0; i < books.size(); i++)
        {
            result += books.get(i).toString() + "\n";
        }
        return result;
    }
    public String getGamesList()
    {
        String result = "";
        for(int i = 0; i < games.size(); i++)
        {
            result += games.get(i).toString() + "\n";
        }
        return result;
    }
}