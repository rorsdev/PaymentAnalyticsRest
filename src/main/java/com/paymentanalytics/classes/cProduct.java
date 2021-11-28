package com.paymentanalytics.classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class cProduct {
    @Id
    private UUID _id;
    private String name;
    private double price;
    private String description;

    public UUID get_id() {
        return _id;
    }

    public void set_id(UUID _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
