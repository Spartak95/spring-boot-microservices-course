package com.xcoder.orders.web.exception;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(String message) {
        super(message);
    }

    public static OrderNotFoundException forCode(String orderNumber) {
        return new OrderNotFoundException("Order with number " + orderNumber + " not found");
    }
}
