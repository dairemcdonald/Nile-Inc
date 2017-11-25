/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Control.AddProduct;
import Control.BrowseProducts;
import Control.SearchProducts;
import Products.Film;
import Products.Game;
import Products.Product;
import Products.eBook;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Trevor
 */
public class MainMenu {
    public MainMenu(ArrayList<Film> films, ArrayList<eBook> books, ArrayList<Game> games, ArrayList<Product> products)
    {
        BrowseProducts bp = new BrowseProducts(films,books,games,products);
        System.out.println("Please choose an option: \n(1)Browse Products\n(2)Search Products\nPress 'Q' to quit");
        Scanner in = new Scanner(System.in);
        String result = in.nextLine();
        String list = "";
        if(result.equalsIgnoreCase("1"))
        {
            System.out.println("Choose one of the following: \n(1)Movies\n(2)eBooks\n(3)Games");
            String choice = in.nextLine();
            if(choice.equalsIgnoreCase("1"))
            {
                list = bp.getFilmsList();
                System.out.println(list);
            }
            else if(choice.equalsIgnoreCase("2"))
            {
                list = bp.getBooksList();
                System.out.println(list);
            }
            else if(choice.equalsIgnoreCase("3"))
            {
                list = bp.getGamesList();
                System.out.println(list);
            }
        }
        if(result.equalsIgnoreCase("2"))
        {
            SearchProducts sp = new SearchProducts();
            System.out.println("Search for a product by its title: ");
            String choice = in.nextLine();
            String results = sp.searchForProduct(choice, products);
            System.out.println(results);
        }
        if(result.equalsIgnoreCase("3"))
        {
            String productType = "";
            System.out.println("Please enter the product type:\n(1)Film\n(2)Game\n(3)eBook\n ");
            String type = in.nextLine();
            if(type.equalsIgnoreCase("1"))
            {
                productType = "film";
                System.out.println("Please enter the price: ");
                String price = in.nextLine();
                System.out.println("Please enter the description: ");
                String description = in.nextLine();
                System.out.println("Please enter the title: ");
                String title = in.nextLine();
                System.out.println("Please enter the genre: ");
                String genre = in.nextLine();
                System.out.println("Please enter the runTime: ");
                String runTime = in.nextLine();
                System.out.println("Please enter the language: ");
                String language = in.nextLine();
                System.out.println("Please enter the director: ");
                String director = in.nextLine();
                System.out.println("Please enter an actor: ");
                String actor = in.nextLine();
                
                String concatenate = price + "," + description + "," + title + "," + genre + "," + runTime + "," + language + "," + director + "," + actor;
                AddProduct ap = new AddProduct();
                ap.add(products, productType, concatenate);
            }
        }
    }
}
