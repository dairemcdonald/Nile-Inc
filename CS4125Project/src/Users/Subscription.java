/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 *
 * @author user1
 */
import java.util.GregorianCalendar;

/**
 *
 * @author user1
 */
public class Subscription {
    
    private GregorianCalendar start;
    private GregorianCalendar end;
    private String type;
    
    Subscription(String type) {
    this.type = type;
    this.start = new GregorianCalendar();
    this.end = this.start;
    this.end.add(GregorianCalendar.DAY_OF_MONTH, 30);
    }
    
    
               String getType(){ return type;}
    GregorianCalendar getStart(){return start;}
    GregorianCalendar getEnd(){return end;}
    
    
    void setType(String type){this.type = type;}
    
}
