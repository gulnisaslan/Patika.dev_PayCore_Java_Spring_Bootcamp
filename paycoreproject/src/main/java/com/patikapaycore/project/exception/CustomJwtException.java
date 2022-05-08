package com.patikapaycore.project.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class CustomJwtException extends RuntimeException{
    private String message;
    private   HttpStatus httpStatus;
   
  
   
}

