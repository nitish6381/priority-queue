package com.example.demo.service;

import com.example.demo.comparator.TransactionComparator;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.dto.TransactionDTO;
import com.example.demo.entity.Transaction;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

@Service
public class TransactionService {

    private static PriorityQueue<Transaction> transactionPriorityQueue = new PriorityQueue<>(new TransactionComparator());
    public ResponseEntity<ResponseDTO> getLatestTransaction(){
        if(transactionPriorityQueue.isEmpty()){
            return ResponseEntity.badRequest().body(new ResponseDTO(false, "No Transaction Found", new ArrayList<>()));
        }
        transactionPriorityQueue.stream().forEach(e-> System.out.println(e));
        return ResponseEntity.ok(new ResponseDTO(true, "", transactionPriorityQueue.peek()));
    }

    public ResponseEntity<ResponseDTO> createTransaction(TransactionDTO transactionDTO){
        transactionPriorityQueue.add(new Transaction(transactionDTO.getAmount(), transactionDTO.getTimeStamp()));
        return ResponseEntity.ok(new ResponseDTO(true, "Transaction Added Successfully", transactionDTO));
    }
}
