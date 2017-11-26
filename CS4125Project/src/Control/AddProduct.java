/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Products.Film;
import Products.Game;
import Products.Product;
import Products.eBook;
import java.util.ArrayList;

public class AddProduct
{
    public AddProduct(){
    }

    public void add(ArrayList<Product> products, String type,String product)
    {
        String [] temp = product.split(",");
        if(type.equalsIgnoreCase("film"))
        {
            Film film = new Film(Double.parseDouble(temp[0]),temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7]);
            products.add(film);
        }
        if(type.equalsIgnoreCase("game"))
        {
            Game game = new Game(Double.parseDouble(temp[0]),temp[1],temp[2],temp[3],Integer.parseInt(temp[4]),temp[5],temp[6]);
            products.add(game);
        }
        if(type.equalsIgnoreCase("ebook"))
        {
            eBook book = new eBook(Double.parseDouble(temp[0]),temp[1],temp[2],temp[3],Integer.parseInt(temp[4]),temp[5],temp[6],temp[7]);
            products.add(book);
        }
    }
}
