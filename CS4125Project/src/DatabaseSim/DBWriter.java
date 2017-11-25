package DatabaseSim;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class DBWriter extends DBManipulator {
    
    public DBWriter()
    {
        
    }
    
    public void writeToFile(String fileName,String info) throws Exception
    {
        //linkFile(filename);
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(info + "\n");

        writer.close();
    }
    
}
