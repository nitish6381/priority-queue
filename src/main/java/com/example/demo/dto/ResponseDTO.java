package com.example.demo.dto;

public class ResponseDTO<T> {
    boolean status;
    String message;
    T data;

    public ResponseDTO(boolean status, String message, T data){
        this.data = data;
        this.message = message;
        this.status =status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
