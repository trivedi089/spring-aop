package org.example;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status){

        //logging
        //Authentication
        //Authorisation
        //Sanitize the data
        System.out.println("Checkout method from shopping cart called");

        }
    public int quantity(){
        return 2;
    }
}
