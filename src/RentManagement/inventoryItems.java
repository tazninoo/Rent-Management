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
public class inventoryItems {
    
    private String itemID;
    private String itemTypeCode;
    private String itemDescription;
    private double numberInStock;
    private String rentalOrSaleOrBoth;
    private double rentalDailyRate;
    private double salePrice;

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemTypeCode() {
        return itemTypeCode;
    }

    public void setItemTypeCode(String itemTypeCode) {
        this.itemTypeCode = itemTypeCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(double numberInStock) {
        this.numberInStock = numberInStock;
    }

    public String getRentalOrSaleOrBoth() {
        return rentalOrSaleOrBoth;
    }

    public void setRentalOrSaleOrBoth(String rentalOrSaleOrBoth) {
        this.rentalOrSaleOrBoth = rentalOrSaleOrBoth;
    }

    public double getRentalDailyRate() {
        return rentalDailyRate;
    }

    public void setRentalDailyRate(double rentalDailyRate) {
        this.rentalDailyRate = rentalDailyRate;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
    
    
    
}



