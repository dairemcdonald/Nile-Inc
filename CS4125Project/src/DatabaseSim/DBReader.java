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
    
}
