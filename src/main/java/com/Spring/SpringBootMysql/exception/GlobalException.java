package com.Spring.SpringBootMysql.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice  //to listening to all the controller that we make
public class GlobalException {
    
    
    //want to throw the function
    @ExceptionHandler(NullPointerException.class)  //@ExceptionHandling, untuk handle (NullPointerException.class)
    public ResponseEntity <String> handleNullPointerException(NullPointerException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

     //this exception, we need to do. Why? because the Exception is the parent class for the NullPointerException
     @ExceptionHandler(Exception.class)
     public ResponseEntity <String> handleException(Exception ex) {
         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("OPS! ADA ERROR BOSS!" + " " + ex.getMessage());
     }
}
