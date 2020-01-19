package com.Globomatic.bike.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@JsonIgnoreProperties({"hibernateInitializer", "handler"})
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Boolean contact;
    private String email;
    private String name;
    private String model;
    private String phone;

    private Date purchaseDate;
    private BigDecimal purchasePrice;
    private String serialNumber;


    public Bike(Boolean contact,String email,String name, String model,  String phone, Date purchaseDate, BigDecimal purchasePrice, String serialNumber) {
        this.contact = contact;
        this.email = email;
        this.name = name;
        this.model = model;
        this.phone = phone;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.serialNumber = serialNumber;

    }
    public Bike(){
        this.name = "";
        this.email = "";
        this.phone = "";
        this.model = "";
        this.serialNumber = "";
        this.purchasePrice = BigDecimal.valueOf(0);
        this.purchaseDate = null;
        this.contact = Boolean.valueOf("");
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public Boolean getContact() {
        return contact;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setContact(Boolean contact) {
        this.contact = contact;
    }
}
