package com.paymentanalytics.classes;

import com.paymentanalytics.enums.ePaymentType;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class cTicket {

    @Id
    private UUID _id;
    private String productId;
    private double amount;
    private ePaymentType paymentType;

    public UUID get_id() {
        return _id;
    }

    public void set_id(UUID _id) {
        this._id = _id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ePaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(ePaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
