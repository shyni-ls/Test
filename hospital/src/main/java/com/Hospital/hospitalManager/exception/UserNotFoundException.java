package com.Hospital.hospitalManager.exception;


public class UserNotFoundException extends RuntimeException {
 public UserNotFoundException(String message){
     super(message);
 }
}
