/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RentManagement;

/**
 *
 * @author Zerina Taznin Nova
 */
public class CustomerItemRentals {
    
    private String itemRentalID;
    private String customerID;
    private String itemID;
    private String rentalDateOut;
    private String rentalDateRefunded;
    private String rentalAmountDue;
    private String otherRentalDetails;

    public String getItemRentalID() {
        return itemRentalID;
    }

    public void setItemRentalID(String itemRentalID) {
        this.itemRentalID = itemRentalID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getRentalDateOut() {
        return rentalDateOut;
    }

    public void setRentalDateOut(String rentalDateOut) {
        this.rentalDateOut = rentalDateOut;
    }

    public String getRentalDateRefunded() {
        return rentalDateRefunded;
    }

    public void setRentalDateRefunded(String rentalDateRefunded) {
        this.rentalDateRefunded = rentalDateRefunded;
    }

    public String getRentalAmountDue() {
        return rentalAmountDue;
    }

    public void setRentalAmountDue(String rentalAmountDue) {
        this.rentalAmountDue = rentalAmountDue;
    }

    public String getOtherRentalDetails() {
        return otherRentalDetails;
    }

    public void setOtherRentalDetails(String otherRentalDetails) {
        this.otherRentalDetails = otherRentalDetails;
    }
    
    
    
}



