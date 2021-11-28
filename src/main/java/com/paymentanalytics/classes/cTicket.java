package com.paymentanalytics.classes;

import com.paymentanalytics.enums.ePaymentType;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class cTicket {

    @Id
    UUID _id;
    String productId;
    double amount;
    ePaymentType paymentType;
}
