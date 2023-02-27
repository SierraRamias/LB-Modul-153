/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sierraramias.lb151;

/**
 *
 * @author nutze
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserBean {

    private String name;
    private User user ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String submit() {
        user = new User(name);
    return "Game.xhtml?faces-redirect=true";
    }

    public User getUser() {
        return user;
    }

}
