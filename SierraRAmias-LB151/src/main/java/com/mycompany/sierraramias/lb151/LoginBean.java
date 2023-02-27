package com.mycompany.sierraramias.lb151;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean
@SessionScoped
public class LoginBean {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String loginAsAdmin() {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(true);

        if (username.equals("admin") && password.equals("adminpassword")) {
            session.setAttribute("isAdmin", true);
            return "/AdminSite.xhtml";
        } else {
            FacesMessage message = new FacesMessage("Invalid credentials.");
            context.addMessage(null, message);
            return null;
        }
    }

    public String loginAsUser() {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(true);

        session.setAttribute("isAdmin", false);
        return "/GameStart.xhtml";
    }
    
    public String goToHighscore() {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(true);

        session.setAttribute("isAdmin", false);
        return "/HighScore.xhtml";
    }
}