package com.example.SpringDataJPA0.exception;

import java.time.LocalDateTime;

public class StudentException {
    private int statusCode;
    private String message;
    private LocalDateTime time;

    public StudentException(int statusCode, String message, LocalDateTime time) {
        this.statusCode = statusCode;
        this.message = message;
        this.time = time;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return time;
    }

    public void setTimestamp(LocalDateTime time) {
        this.time = time;
    }
}
