/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.permutations.controller;

import javax.swing.JOptionPane;
import me.permutations.model.ModelPermutation;
import me.permutations.model.Permutation;
import me.permutations.view.PermutationView;

/**
 *
 * @author Boxvi
 */
public class Controller {

    private ModelPermutation modelPermutation;
    private PermutationView permutationView;

    public Controller(ModelPermutation modelPermutation, PermutationView permutationView) {
        this.permutationView = permutationView;

        permutationView.setVisible(true);
        permutationView.setTitle("PERMUTADOR DE PALABRAS");
        permutationView.setLocationRelativeTo(null);
        permutationView.getTxtarea().setEditable(false);
    }

    public void startController() {

        permutationView.getBtngenerate().addActionListener(l -> generate());
        permutationView.getBtnclean_up().addActionListener(l -> cleanFields());
        permutationView.getBtnexit().addActionListener(l -> exit());
    }

    public void generate() {
        if (!permutationView.getTxtgenerate().getText().isEmpty()) {

            modelPermutation = new ModelPermutation(permutationView.getTxtgenerate().getText());
            modelPermutation.factorial();
            for (int i = 0; i < modelPermutation.getPermutation().size(); i++) {
                permutationView.getTxtarea().setText(permutationView.getTxtarea().getText() + " > " + modelPermutation.getPermutation().get(i).toString() + "\n");
            }
        } else {
            JOptionPane.showMessageDialog(permutationView, "el campo para escribir la letra debe de estar lleno");
        }
    }

    public void cleanFields() {
        permutationView.getTxtarea().setText(null);
        permutationView.getTxtgenerate().setText(null);
    }

    public void exit() {
        JOptionPane.showMessageDialog(permutationView, "GRACIAS POR USAR EL SISTEMA ATT: BOXVI 7W7");
        System.exit(0);
    }
}
