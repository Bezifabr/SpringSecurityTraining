package dev.saranda.springsecurity.smallsecuredapp.model;

import dev.saranda.springsecurity.smallsecuredapp.model.enums.Currency;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private double price;

    @Enumerated(EnumType.STRING)
    private Currency currency;

}