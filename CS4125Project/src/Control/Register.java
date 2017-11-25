/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DatabaseSim.DBWriter;
import Users.Admin;
import Users.Customer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author User
 */
public class Register {
    public Register(String forname, String surname, String username, String password, String subscriptionType, String dateOfBirth, String accountType) throws Exception
    {
        DBWriter db = new DBWriter();
        String hash = Sha256(password);
        if(accountType.equalsIgnoreCase("Admin"))
        {
            Admin newAdmin = new Admin(forname, surname,username, hash,subscriptionType, dateOfBirth);
            db.writeToFile("UserDB", newAdmin.getDetails());
        }
        else
        {
            Customer newCustomer = new Customer(forname, surname,username, hash,subscriptionType,  dateOfBirth);
            db.writeToFile("UserDB", newCustomer.getDetails());
        }
    }
    public  String Sha256(String pass) throws NoSuchAlgorithmException
    {

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(pass.getBytes());

        byte byteData[] = md.digest();

        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

        //System.out.println("Hex format : " + sb.toString());

        //convert the byte to hex format method 2
        StringBuffer hexString = new StringBuffer();
    	for (int i=0;i<byteData.length;i++) {
    		String hex=Integer.toHexString(0xff & byteData[i]);
   	     	if(hex.length()==1) hexString.append('0');
   	     	hexString.append(hex);
    	}
    	//System.out.println("Hex format : " + hexString.toString());
    	return hexString.toString();
    }
}
