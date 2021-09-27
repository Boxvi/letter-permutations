/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.permutations.model;

/**
 *
 * @author Boxvi
 */
public class Permutation {

    private String letter;
    private int factorial;

    public Permutation() {
    }

    public Permutation(String letter) {
        this.letter = letter;
    }

    public Permutation(String letter, int factorial) {
        this.letter = "";
        this.factorial = 0;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public int getFactorial() {
        return factorial;
    }

    public void setFactorial(int factorial) {
        this.factorial = factorial;
    }
}
