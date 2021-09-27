/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.permutations.model;

import java.util.Vector;

/**
 *
 * @author Boxvi
 */
public class ModelPermutation extends Permutation {

    private Vector permutation = new Vector();

    public ModelPermutation() {
    }

    public ModelPermutation(String letter) {
        super(letter);
    }

    public ModelPermutation(String letter, int factorial) {
        super(letter, factorial);
    }

    public void factorial() {
        setFactorial(getLetter().length());
        for (int i = getLetter().length() - 1; i > 0; i--) {
            setFactorial(getFactorial() * i);
        }
        permute();
    }
//permute

    public void permute() {

        for (int i = 0; i < getFactorial(); i++) {
            int array[] = new int[getLetter().length()];
            for (int j = 0; j < array.length; j++) {
                array[j] = -1;
            }
            for (int j = 0; j < array.length; j++) {
                boolean next = true;
                do {
                    boolean repeat = false;
                    int random = (int) Math.rint(Math.random() * (getLetter().length() - 1));
                    for (int k = 0; k < array.length; k++) {
                        if (random == array[k]) {
                            repeat = true;
                        }
                    }
                    if (repeat == true) {
                        next = true;
                    } else if (repeat == false) {
                        array[j] = random;
                        next = false;
                    }

                } while (next);

            }
            String temp = "";
            for (int j = 0; j < array.length; j++) {
                temp += array[j];
            }
            boolean repeat = false;
            for (int j = 0; j < permutation.size(); j++) {
                if (temp.equals(permutation.get(j).toString())) {
                    repeat = true;
                }
            }
            if (repeat == true) {
                i--;
            } else if (repeat == false) {
                permutation.addElement(temp);
            }
        }
        for (int i = 0; i < permutation.size(); i++) {
            String temp = "";
            char character[] = permutation.get(i).toString().toCharArray();
            for (int j = 0; j < character.length; j++) {
                temp += getLetter().charAt(Integer.parseInt("" + character[j]));
            }
            permutation.set(i, temp);
        }
    }

    public Vector getPermutation() {
        return permutation;
    }

    public void setPermutation(Vector permutation) {
        this.permutation = permutation;
    }

    public void view() {

        factorial();
        for (int i = 0; i < permutation.size(); i++) {
            System.out.println(permutation.get(i).toString());
        }
    }

}
