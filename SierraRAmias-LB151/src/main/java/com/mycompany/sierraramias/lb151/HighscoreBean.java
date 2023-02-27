/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sierraramias.lb151;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author nutze
 */
@SessionScoped
@Named
public class HighscoreBean implements Serializable {

    
    private ScoreDao scoreDao;

    private String name;
    private int amount;
    private int tries;

    public HighscoreBean() {
        scoreDao = new JdbcScoreDao(); // instantiate the DAO implementation
    }

    public void setScoreDao(ScoreDao scoreDao) {
        this.scoreDao = scoreDao;
    }

    public void addScore() {
        Score score = new Score(name, amount, tries, new Date());
        scoreDao.addScore(score);
        // reset the form fields
        name = null;
        amount = 0;
        tries = 0;
    }

    public List<Score> getHighscores() {
        List<Score> highscores = scoreDao.getHighscores();
        highscores.sort(new Comparator<Score>() {
            @Override
            public int compare(Score s1, Score s2) {
                return Integer.compare(s1.getAmount(), s2.getAmount());
            }
        });
        return highscores;
    }

    // getters and setters for name, amount, tries
    // and setter for scoreDao using @ManagedProperty annotation
}
