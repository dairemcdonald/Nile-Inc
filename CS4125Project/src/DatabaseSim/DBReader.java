package DatabaseSim;

import Products.Film;
import Products.Game;
import Products.Product;
import Products.eBook;
import java.util.*;

public class DBReader extends DBManipulator {
    
    public DBReader()
    {
        
    }
    
    public String getFilms()
    {
        linkFile("files/FilmDB.txt");
        String line;
        String result = "";
        while (in.hasNextLine()) {
                line = in.nextLine();
                result += line + ";";
            }
        
        return result;
    }
    
     public String getBooks()
    {
        linkFile("files/eBookDB.txt");
        String line;
        String result = "";
        while (in.hasNextLine()) {
                line = in.nextLine();
                result += line + ";";
            }
        
        return result;
    }
    public String getGames()
    {
        linkFile("files/GameDB.txt");
        String line;
        String result = "";
        while (in.hasNextLine()) {
                line = in.nextLine();
                result += line + ";";
                
            }
        
        return result;
    }
    
    public String getPassword(String username)
    {
        linkFile("files/UserDB.txt");
        String line;
        while (in.hasNextLine()) {
               line = in.nextLine();
               String split[] = line.split(",");
               if(split[2].equalsIgnoreCase(username))
               {
                   return split[3];
               }
           }
        return "Error: Username or password is incorrect";
    }
    public String getInventory()
    {
         linkFile("files/InventoryDB.txt");
        String line;
        String result = "";
        while (in.hasNextLine()) {
                line = in.nextLine();
                result += line + ";";
                
            }
        return result;
    }
}
