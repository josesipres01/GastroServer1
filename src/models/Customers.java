/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author joses
 */
public class Customers {
    
    //Atributos
    private int customerID;
    private String customerDetails;

    //Constructor
    public Customers(int customerID, String customerDetails) {
        this.customerID = customerID;
        this.customerDetails = customerDetails;
    }

    //Setters y getters
    public int getCustomerID() {
        return customerID;
    }
        public String getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerDetails(String customerDetails) {
        this.customerDetails = customerDetails;
    }
    
     @Override
    public String toString() {
        return "Customers{" 
                + "customerID=" + customerID + 
                ", customerDetails=" + customerDetails + '}';
    }


    
    
    
}
