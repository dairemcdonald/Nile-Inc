
package Control;

import DatabaseSim.DBReader;
import Products.Film;
import Products.eBook;
import Products.Game;
import Products.Product;
import java.util.ArrayList;

public class BrowseProducts {
    private ArrayList<Film> films;
    private ArrayList<eBook> books;
    private ArrayList<Game> games ;
    private ArrayList<Product> products;
    private String search = "";
    private String type = "";
    private String sort = "";
    
    public BrowseProducts(){}
    
    public void updateArrays(ArrayList<Film> films, ArrayList<Game> games, ArrayList<eBook> books)
    {
        this.films = films;
        this.books = books;
        this.games = games;
    }
    
    public ArrayList<Product> updateList(String type, String sort, String search)
    {
        products = new ArrayList<Product>();
        films = new ArrayList<Film>();
        games = new ArrayList<Game>();
        books = new ArrayList<eBook>();
        this.search = search;
        this.type = type;
        this.sort = sort;
        searchForProduct();
        sortList();
        return products;
    }
    
    public void searchForProduct()
    {
        //products.clear();
        if(type.equalsIgnoreCase("Game") || type.equalsIgnoreCase("All"))
            searchList(games);
        if(type.equalsIgnoreCase("Movie") || type.equalsIgnoreCase("All"))
            searchList(films);
        if(type.equalsIgnoreCase("eBook") || type.equalsIgnoreCase("All"))
            searchList(books); 
    }
    
    public void searchList(ArrayList<? extends Product> tempList)
    {
        if(search.equalsIgnoreCase(""))
            System.out.println("yayaya");
        System.out.println("tl " + tempList.size());
        for (int i = 0; i < tempList.size(); i++)
        {
            String tempTitle = tempList.get(i).getTitle();
            if (tempTitle.equalsIgnoreCase(search) || search.equalsIgnoreCase(""))
            {
                products.add(tempList.get(i));
                System.out.println("Product added");
            }
                
            
        }
    }
    public void sortList()
    {
        //sort code
    }
}