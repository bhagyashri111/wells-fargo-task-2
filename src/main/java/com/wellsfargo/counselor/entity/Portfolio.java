package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

public class Portfolio {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime createdOn;

    protected Portfolio() {

    }

    public  Portfolio(Client client, LocalDateTime createdOn ){
        this.client=client;
        this.createdOn=createdOn;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client){
        this.client=client;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

}
