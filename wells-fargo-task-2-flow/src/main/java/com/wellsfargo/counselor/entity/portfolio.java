package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class portfolio {

    @ManyToOne
    private Client clientId;

    @OneToMany(mappedBy = "client")
    private List<Client> portfolioList;

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String creationDate;

    protected portfolio() {

    }


    public Client getClient() { return clientId; }


    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

}
