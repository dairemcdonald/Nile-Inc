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
public class Customer {
    
public class Customer extends User {
      public Customer(String forname, String surname, String username, String password, String subscriptionType, String dateOfBirth)
    {
        this.forname = forname;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.currentSubscription = new Subscription(subscriptionType);
        this.dateOfBirth = dateOfBirth;
        this.balance = 0;
        this.type = "Customer";
    }
    
    public String getDetails()
    {
        String result = "";
        result +=  forname + "," + surname + "," + username + "," +  password + "," + currentSubscription.getType() + "," + balance + "," + dateOfBirth + "," + type;
        return result;
    }
    
    public String getType()
    {
        return type;
    }
}
