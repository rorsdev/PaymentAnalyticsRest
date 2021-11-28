package com.paymentanalytics.classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class cProduct {
    @Id
    UUID _id;
    String name;
    double price;
    String description;
}
