package com.example.rabbitmq.dto;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Order {

    private String orderId;
    private String email;
    private String name;
    private int qty;
    private double price;

    public Order(String orderId, String email, String name, int qty, double price) {
        this.orderId = orderId;
        this.email = email;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public Order() {
    }
}
