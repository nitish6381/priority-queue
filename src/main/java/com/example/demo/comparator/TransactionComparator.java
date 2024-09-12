package com.example.demo.comparator;

import com.example.demo.entity.Transaction;

import java.util.Comparator;

public class TransactionComparator implements Comparator<Transaction> {
    @Override
    public int compare(Transaction o1, Transaction o2) {
        if(o1.getTimeStamp() > o2.getTimeStamp() ){
            return 1;
        } else if (o1.getTimeStamp() < o2.getTimeStamp()) {
            return -1;
        } else {
            return Double.compare(o2.getAmount(), o1.getAmount());
        }
    }
}
