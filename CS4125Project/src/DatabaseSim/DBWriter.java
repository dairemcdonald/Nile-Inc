package DatabaseSim;

import Inventory.Inventory;
import Products.Film;
import Products.Game;
import Products.eBook;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class DBWriter extends DBManipulator {
    
    DBWriter()
    {
        
    }
    
    void writeToFile(String filename)
    {
        linkFile(filename);
        
    }
    
    public void writeInventory(Inventory inventory)
    {
        
    }
    
    public void writeEbooks(ArrayList<eBook> books)throws Exception
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/eBookDB.txt"));
        
        for(int i = 0; i < books.size(); i++)
        {
            eBook current = books.get(i);
            String info = current.getID() + "," + current.getPrice() + ","+ current.getDescription()+"," + current.getTitle()+"," + current.getGenre()+"," + current.getPages()+"," + current.getAuthor() + "," +current.getLanguage() + "," + current.getPublisher();
            writer.write(info);
            writer.newLine();
        }

        writer.close();
    }
    public void writeGames(ArrayList<Game> games)throws Exception
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/GameDB.txt"));
        
        for(int i = 0; i < games.size(); i++)
        {
            Game current = games.get(i);
            String info = current.getID() + "," + current.getPrice() + ","+ current.getDescription()+"," + current.getTitle()+"," + current.getGenre()+"," +current.getAgeRestriction() + "," + current.getDeveloper() + "," + current.platform();
            writer.write(info);
            writer.newLine();
        }

        writer.close();
    }
    public void writeMovies(ArrayList<Film> films)throws Exception
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/FilmDB.txt"));
        
        for(int i = 0; i < films.size(); i++)
        {
            //f1,5.00,Romantic film based on book,The Notebook,Drama,2hr03m,English,Nick Cassavetes,Ryan Gosling
            Film current = films.get(i);
            String info = current.getID() + "," + current.getPrice() + ","+ current.getDescription()+"," + current.getTitle()+"," + current.getGenre()+"," +current.getRunTime() + "," + current.getLanguage() + "," + current.getDirector() + "," + current.getActor();
            writer.write(info);
            writer.newLine();
        }

        writer.close();
    }
}
