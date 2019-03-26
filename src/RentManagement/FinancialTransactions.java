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
public class FinancialTransactions {
    
    private String transactionID;
    private String accountID;
    private String itemRentalID;
    private String purchaseID;
    private String previousTransactionID;
    private String transactionDate;
    private String transactionTypeCode;
    private double transactionAmount;
    private String transactionComment;

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getItemRentalID() {
        return itemRentalID;
    }

    public void setItemRentalID(String itemRentalID) {
        this.itemRentalID = itemRentalID;
    }

    public String getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(String purchaseID) {
        this.purchaseID = purchaseID;
    }

    public String getPreviousTransactionID() {
        return previousTransactionID;
    }

    public void setPreviousTransactionID(String previousTransactionID) {
        this.previousTransactionID = previousTransactionID;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionTypeCode() {
        return transactionTypeCode;
    }

    public void setTransactionTypeCode(String transactionTypeCode) {
        this.transactionTypeCode = transactionTypeCode;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionComment() {
        return transactionComment;
    }

    public void setTransactionComment(String transactionComment) {
        this.transactionComment = transactionComment;
    }
    
    
    
}



