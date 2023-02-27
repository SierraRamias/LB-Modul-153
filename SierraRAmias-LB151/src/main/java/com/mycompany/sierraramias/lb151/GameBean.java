package com.mycompany.sierraramias.lb151;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.naming.NamingException;

@ManagedBean
@SessionScoped
public class GameBean {

    //Guessing Variables
    private final String sentence;
    private String hiddenSentence;
    private String guess;
    private String message;
    private int betAmount;
    private String wonAmount;
    private int life = 3;

    //User Variables
    private String name;
    private User user;

    //Wheel spin Variables
    private int amount;
    private String result;

    public GameBean() {
        // Choose a random sentence
        String[] sentences = {
            "an apple a day keeps the doctor away",
            "good things come to those who wait",
            "better late than never",
            "a blessing in disguise"
        };
        Random rand = new Random();
        sentence = sentences[rand.nextInt(sentences.length)];

        // Convert the sentence to a hidden form
        hiddenSentence = sentence.replaceAll("[a-zA-Z]", "_");
        hiddenSentence = hiddenSentence.replaceAll("\\s", "-"); // replace space with hyphen
    }

    //Logic for the User
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
    
    public String displayName() {
        return "Hello " + user.getName() + " Welcome to this Game";
    }

    //Logic for the Guessing Game
    public String getHiddenSentence() {
        if (hiddenSentence != null) {
            return hiddenSentence;
        }

        StringBuilder sb = new StringBuilder();
        boolean isNewWord = true;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetter(c)) {
                if (isNewWord) {
                    sb.append("_ ");
                    isNewWord = false;
                } else {
                    sb.append("_");
                }
            } else {
                sb.append("   "); // three spaces between words
                isNewWord = true;
            }
        }
        hiddenSentence = sb.toString();
        StringBuilder updated = new StringBuilder();
        for (int i = 0; i < hiddenSentence.length(); i++) {
            switch (hiddenSentence.charAt(i)) {
                case '_':
                    updated.append("_ ");
                    break;
                case ' ':
                    updated.append("-"); // replace space with hyphen
                    break;
                default:
                    updated.append(hiddenSentence.charAt(i));
                    break;
            }
        }
        hiddenSentence = updated.toString();
        return hiddenSentence;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public String getMessage() {
        return message;
    }

    public void checkGuess() {
        if (guess != null && guess.length() == 1) {
            char letter = guess.toLowerCase().charAt(0);
            boolean found = false;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.toLowerCase().charAt(i);
                if (c == letter) {
                    sb.append(sentence.charAt(i)).append(" ");
                    found = true;
                    giveOutPrice(countFound());
                    // update hiddenSentence with guessed letter
                    hiddenSentence = hiddenSentence.substring(0, i) + sentence.charAt(i) + hiddenSentence.substring(i + 1);
                } else if (hiddenSentence.charAt(i) != '-') {
                    sb.append(hiddenSentence.charAt(i));
                } else if (Character.isLetter(sentence.charAt(i))) {
                    sb.append("_ ");
                } else {
                    sb.append("-");
                }
            }
            if (found) {
                message = "Good guess!";
            } else {
                loseLife();
                message = "Sorry, try again.";
            }
        } else {
            message = "Please enter a single letter.";
        }
        guess = "";
    }

    public int countFound() {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.toLowerCase().charAt(i) == guess.toLowerCase().charAt(0)) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public void giveOutPrice(int count) {
        user.setAmount(user.getAmount() - getAmount() + (getBetAmount() * count));
        wonAmount = "you won" + getBetAmount() * count;
    }

    public String getWonAmount() {
        return wonAmount;
    }

    public void setBetAmount(int betAmount) {
        this.betAmount = betAmount;
    }

    public int getBetAmount() {
        return betAmount;
    }

    public void loseLife() {
        life--;
        if (life <= 0) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            ExternalContext externalContext = facesContext.getExternalContext();
            try {
                externalContext.redirect("Login.xhtml");
            } catch (IOException e) {
                // Handle the exception
            }
        }

    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    //Logic for the Spin The Wheel
    public int getAmount() {
        return user.getAmount();
    }

    public void setAmount() {
        this.amount = user.getAmount();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void spinWheel() {
        user.addTries();
        Random random = new Random();
        int number = random.nextInt(8) + 1; // generate random number between 1 and 8
        switch (number) {
            case 1:
                amount = 1000;
                user.setAmount(user.getAmount() + amount);
                break;
            case 2:
            case 3:
                amount = 500;
                user.setAmount(user.getAmount() + amount);
                break;
            case 4:
            case 5:
            case 6:
                amount = 200;
                user.setAmount(user.getAmount() + amount);
                break;
            case 7:
            case 8:
                amount = 0; // or any other value to indicate bankrot
                user.setAmount(0);
                break;
        }
        result = "You won " + amount + "!";
    }

    //Highscore Logic
    public void submitHighscore() throws NamingException {

        // create an instance of the JdbcScoreDao class
        JdbcScoreDao scoreDao = new JdbcScoreDao(MyDataSourceFactory.getDataSource());

        // create a new Score object with the given information
        Date currentDate = new Date();
        Score score = new Score(user.getName(), user.getAmount(), user.getTries(), currentDate);

        // add the score to the database using the JdbcScoreDao
        scoreDao.addScore(score);

        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        try {
            externalContext.redirect("Login.xhtml");
        } catch (IOException e) {
            // Handle the exception
        }
    }
}
