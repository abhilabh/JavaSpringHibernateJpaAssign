package com.wipro.pkg.Models;

import javax.persistence.*;

@Entity
@Table(name = "citizens")
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int citizenId;

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "citizen", cascade = CascadeType.ALL)
    private IDCard idCard;

    public Citizen() {
    }

    public Citizen(int citizenId, String name) {
        this.citizenId = citizenId;
        this.name = name;
    }

    public int getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(int citizenId) {
        this.citizenId = citizenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "citizenId=" + citizenId +
                ", name='" + name + '\'' +
                ", idCard=" + idCard.getCardNumber() +
                '}';
    }
}
