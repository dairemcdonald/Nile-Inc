/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 *
 * @author Trevor
 */
public abstract class User {
    
        String forname;
        String surname;
        String username;
        String password;
        String subscriptionType;
        Subscription currentSubscription;
        String dateOfBirth;
        double balance;
        String type;
        
        abstract String getDetails(); //abstract method
        abstract String getType();
}
