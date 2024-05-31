package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private float quantity;

    protected Security() {

    }


    public Security(Portfolio portfolio, String firstName, String lastName, String category, Date purchaseDate, float purchasePrice, float quantity){

        this.portfolio=portfolio;
        this.firstName=firstName;
        this.lastName=lastName;
        this.category=category;
        this.purchaseDate=purchaseDate;
        this.purchasePrice=purchasePrice;
        this.quantity=quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(long securityId) {
        this.securityId = securityId;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }




}
