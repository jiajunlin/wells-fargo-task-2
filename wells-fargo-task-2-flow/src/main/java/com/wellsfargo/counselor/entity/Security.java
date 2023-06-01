package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;


@Entity
public class Security {

    @ManyToOne
    private portfolio portfolioId;

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Float purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private Long quantity;

    protected Security() {

    }

    public Security(String firstName, String lastName, String category, String purchaseDate, Float purchasePrice, Long quantity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public long getSecurityId() { return securityId; }

    public portfolio getportfolioId() { return portfolioId; }

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

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }



}
