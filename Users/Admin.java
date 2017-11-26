/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

public class Admin extends User{
    public Admin(String forname, String surname, String username, String password, String subscriptionType, String dateOfBirth)
    {
        this.forname = forname;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.subscriptionType = subscriptionType;
        this.dateOfBirth = dateOfBirth;
        this.balance = 0;
        this.type = "Admin";
    }
    
    public String getDetails()
    {
        String result = "";
        result +=  forname + "," + surname + "," + username + "," +  password + "," + subscriptionType + "," + balance + "," + dateOfBirth + "," + type;
        return result;
    }
    
    public String getType()
    {
        return type;
    }
}
