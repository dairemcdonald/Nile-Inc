
package Control;

import DatabaseSim.DBReader;
import Products.Film;
import Products.eBook;
import Products.Game;
import Products.Product;
import java.util.ArrayList;

public class BrowseProducts {
    private DBReader db;
    private ArrayList<Film> films;
    private ArrayList<eBook> books;
    private ArrayList<Game> games ;
    private ArrayList<Product> products;
    private String search = "";
    private String type = "";
    private String sort = "";
    
    public BrowseProducts(){}
    
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
        for (int i = 0; i < tempList.size(); i++)
        {
            String tempTitle = tempList.get(i).getTitle();
            if (tempTitle.equalsIgnoreCase(search) || search.equalsIgnoreCase(""))
                products.add(tempList.get(i));
        }
    }
    public void sortList()
    {
        //sort code
    }
}