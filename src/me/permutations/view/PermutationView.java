/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.permutations.view;

import javax.swing.JButton;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Boxvi
 */
public class PermutationView extends javax.swing.JFrame {

    /**
     * Creates new form permutationView
     */
    public PermutationView() {
        initComponents();
    }

    public JButton getBtnclean_up() {
        return btnclean_up;
    }

    public void setBtnclean_up(JButton btnclean_up) {
        this.btnclean_up = btnclean_up;
    }

    public JButton getBtnexit() {
        return btnexit;
    }

    public void setBtnexit(JButton btnexit) {
        this.btnexit = btnexit;
    }

    public JButton getBtngenerate() {
        return btngenerate;
    }

    public void setBtngenerate(JButton btngenerate) {
        this.btngenerate = btngenerate;
    }

    public JTextField getTxtgenerate() {
        return txtgenerate;
    }

    public void setTxtgenerate(JTextField txtgenerate) {
        this.txtgenerate = txtgenerate;
    }

    public JTextArea getTxtarea() {
        return txtarea;
    }

    public void setTxtarea(JTextArea txtarea) {
        this.txtarea = txtarea;
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtgenerate = new javax.swing.JTextField();
        btnexit = new javax.swing.JButton();
        btnclean_up = new javax.swing.JButton();
        btngenerate = new javax.swing.JButton();
        txtarea = new javax.swing.JTextArea();
        bottom = new javax.swing.JLabel();
        bottom2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("QUIERA VER SUS PERMUTACION:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DE PERMUTACIONES");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DE LETRAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("BIENVENIDO AL SISTEMA ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("A CONTINUACION DEBERA ESCRIBIR LA LETRA QUE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txtgenerate.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jPanel1.add(txtgenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 300, 50));

        btnexit.setBackground(new java.awt.Color(102, 102, 255));
        btnexit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnexit.setForeground(new java.awt.Color(51, 255, 0));
        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/permutations/view/images/exit.png"))); // NOI18N
        btnexit.setText("SALIR");
        btnexit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnexit.setBorderPainted(false);
        jPanel1.add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 150, 50));

        btnclean_up.setBackground(new java.awt.Color(102, 102, 255));
        btnclean_up.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnclean_up.setForeground(new java.awt.Color(51, 255, 0));
        btnclean_up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/permutations/view/images/clean_up.png"))); // NOI18N
        btnclean_up.setText("LIMPIAR");
        btnclean_up.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnclean_up.setBorderPainted(false);
        jPanel1.add(btnclean_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 150, 50));

        btngenerate.setBackground(new java.awt.Color(102, 102, 255));
        btngenerate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btngenerate.setForeground(new java.awt.Color(51, 255, 0));
        btngenerate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/permutations/view/images/generate.png"))); // NOI18N
        btngenerate.setText("GENERAR");
        btngenerate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btngenerate.setBorderPainted(false);
        jPanel1.add(btngenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 150, 50));

        txtarea.setColumns(20);
        txtarea.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtarea.setRows(5);
        jPanel1.add(txtarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 300, 180));

        bottom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/permutations/view/images/bottom.png"))); // NOI18N
        jPanel1.add(bottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        bottom2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/permutations/view/images/bottom2.png"))); // NOI18N
        bottom2.setText("jLabel2");
        jPanel1.add(bottom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bottom;
    private javax.swing.JLabel bottom2;
    private javax.swing.JButton btnclean_up;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btngenerate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtgenerate;
    // End of variables declaration//GEN-END:variables
}
