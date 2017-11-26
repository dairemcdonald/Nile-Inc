/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transactions;

/**
 *
 * @author Trevor
 */
public class Transaction {
    
    public boolean makePayment(String cardNumber)
    {
        boolean isValid = validateCard(cardNumber);
        if(isValid == true)
            return true;
        else
            return false;
    }
    
    public boolean validateCard(String cardNumber) //validate credit card number using the luhn formula
    {
        int[] digits = new int[cardNumber.length()];
        
        for (int i = 0; i < cardNumber.length(); i++) {
                digits[i] = Integer.parseInt(cardNumber.substring(i, i + 1));
        }
        for (int i = digits.length - 2; i >= 0; i = i - 2) {
                int j = digits[i];
                j = j * 2;
                if (j > 9) {
                        j = j % 10 + 1;
                }
                digits[i] = j;
        }
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
                sum += digits[i];
        }
        if (sum % 10 == 0) {
                return true;
        } else {
                return false;
        }
    }
}
