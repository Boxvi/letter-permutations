/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.permutations;

import me.permutations.controller.Controller;
import me.permutations.model.ModelPermutation;
import me.permutations.model.Permutation;
import me.permutations.view.PermutationView;

/**
 *
 * @author Boxvi
 */
public class main {

    public static void main(String[] args) {

        ModelPermutation test = new ModelPermutation();
        
        
        PermutationView permutationView = new PermutationView();

        Controller controller = new Controller(test, permutationView);

        controller.startController();

        //test.permute();
        //test.view();
    }

}
