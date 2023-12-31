/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupo5.vista;

import com.grupo5.arbolavlsimulator.Global;
import javax.swing.ImageIcon;

/**
 *
 * @author paul
 */
public class InfoDesarrolladores extends javax.swing.JFrame {

    /**
     * Creates new form InfoDesarrolladores
     */
    public InfoDesarrolladores() {
        initComponents();
        setLocationRelativeTo(this);
        ImageIcon icon = new ImageIcon(Global.getPath()+"\\com\\grupo5\\recursos\\icono.png");
        setIconImage(icon.getImage());
        jLabel1.setIcon(new javax.swing.ImageIcon(Global.getPath()+"\\com\\grupo5\\recursos\\fondoDesarrolladores.jpg"));
        buttonBack.setIcon(new javax.swing.ImageIcon(Global.getPath()+"\\com\\grupo5\\recursos\\botonRegresar.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });
        jPanel1.add(buttonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 190, 40));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /** 
     * Metodo ejecutado cuando el boton Regresar es accionado
     * <br>
     * Crea un nuevo form {@link Simulador} y lo hace visible.
     * Redirecciona al usuario a la pantalla de inicio.
     * @param evt 
     */
    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        Inicio inicio = new Inicio();
        this.dispose();
        inicio.setVisible(true);
    }//GEN-LAST:event_buttonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
