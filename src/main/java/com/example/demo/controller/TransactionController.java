package com.example.demo.controller;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.dto.TransactionDTO;
import com.example.demo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;
    @GetMapping
    public ResponseEntity<ResponseDTO> getLatestTransaction(){
        return transactionService.getLatestTransaction();
    }

    @PostMapping
    public ResponseEntity<ResponseDTO> createTransaction(@RequestBody TransactionDTO transactionDTO){
       return transactionService.createTransaction(transactionDTO);
    }
}
