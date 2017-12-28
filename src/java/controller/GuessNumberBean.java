/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author User
 */
@Named(value = "guessNumberBean")
@SessionScoped
public class GuessNumberBean implements Serializable {

    private final int RANDOMnUMBER;
    private int max = 10;
    private int min = 1;
    private int userguess;
    private String response;

    public GuessNumberBean() {
        Random random = new Random();
        RANDOMnUMBER = random.nextInt(max) + 1;
    }

    public String getResponse() {
        if (userguess == RANDOMnUMBER) {
            return "You guessed right!";
        } else if (userguess < RANDOMnUMBER) {
            return "Sorry! Too low!";
        } else {
            return "Sorry! Too high!";
        }
    }

    public String getImage() {
        if (userguess == RANDOMnUMBER) {
            return "resources/img/giphy.gif";
        } else {
            return "resources/img/sorry.gif";
        }
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getUserguess() {
        return userguess;
    }

    public void setUserguess(int userguess) {
        this.userguess = userguess;
    }

}
