package com.example.santanderdevweek2023.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    @Column(name = "available_limit", scale = 13, precision = 2)
    private BigDecimal limit;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public Card() {
    }
}
