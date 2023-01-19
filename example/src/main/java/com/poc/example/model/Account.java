package com.poc.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Account")
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    private String cardCode;
    private String name;
    private String type;
    private String parentAccountName;
    private String billingCity;
    private String description;
    private String website;

}
