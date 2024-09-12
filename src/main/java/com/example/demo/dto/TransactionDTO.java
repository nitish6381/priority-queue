package com.example.demo.dto;

public class TransactionDTO {
    double amount;
    long timeStamp;

    public TransactionDTO(double amount, long timeStamp) {
        this.amount = amount;
        this.timeStamp = timeStamp;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
