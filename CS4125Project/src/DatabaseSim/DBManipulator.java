package DatabaseSim;

import java.util.*;
import java.io.*;

public abstract class DBManipulator {
    
    Scanner in;
    File file;
    
    DBManipulator()
    {
        
    }
    
    void linkFile(String filename)
    {
        try{
            file = new File(filename);
            in = new Scanner(file);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File " + filename + " not found");
        }
    }
    
}
