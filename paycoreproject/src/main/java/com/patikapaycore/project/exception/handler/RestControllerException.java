package com.patikapaycore.project.exception.handler;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.patikapaycore.project.exception.CustomJwtException;
import org.hibernate.tool.schema.spi.CommandAcceptanceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestControllerException  extends ResponseEntityExceptionHandler {
//
//    @ExceptionHandler({CommandAcceptanceException.class})
//   @ResponseStatus(HttpStatus.BAD_REQUEST)
//



}
