package com.kodilla.kodilla.hibernate.manytomany.facade;

public class OrderProcessingException extends Exception {
    public static String ERR_TOO_SHORT_FRAGMENT_NAME ="Fragment name was too short";
    public static String ERR_NOT_FOUND_EMPLOYEE = "Employee was not found in database";
    public static String ERR_NOT_FOUND_COMPANY = "Company was not found in database";
    public OrderProcessingException (String message) {
        super(message);
    }
}
