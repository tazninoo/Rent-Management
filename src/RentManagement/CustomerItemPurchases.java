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
public class CustomerItemPurchases {
    
    private String purchaseID;
    private String customerID;
    private String itemID;
    private String purchaseStatusCode;
    private String purchaseDate;
    private double purchaseQuantity;
    private double purchaseAmountDue;

    public String getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(String purchaseID) {
        this.purchaseID = purchaseID;
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

    public String getPurchaseStatusCode() {
        return purchaseStatusCode;
    }

    public void setPurchaseStatusCode(String purchaseStatusCode) {
        this.purchaseStatusCode = purchaseStatusCode;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(double purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    public double getPurchaseAmountDue() {
        return purchaseAmountDue;
    }

    public void setPurchaseAmountDue(double purchaseAmountDue) {
        this.purchaseAmountDue = purchaseAmountDue;
    }
    
    
    
}



