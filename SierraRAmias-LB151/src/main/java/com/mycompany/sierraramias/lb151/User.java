/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sierraramias.lb151;

/**
 *
 * @author nutze
 */
public class User {

    private final String name;
    private int amount;
    private int tries;

    public User(String name) {
        this.name = name;
        this.amount = 0;
        this.tries = 1;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTries() {
        return tries;
    }

    public void addTries() {
        this.tries = tries++;
    }

}
