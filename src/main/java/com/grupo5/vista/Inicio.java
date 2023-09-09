/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupo5.vista;

import com.grupo5.arbolavlsimulator.Global;
import javax.swing.ImageIcon;

/**
 *
 * @author mmall
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Crea un nuevo form de la pantalla inicio del Simulador
     */
    public Inicio() {
        initComponents();
        setLocationRelativeTo(this);
        iniciarIconos();
    }
    
    /**
     * Metodo que inicia los iconos de los botones de la pantalla de inicio
     */
    public void iniciarIconos(){
        jLabel1.setIcon(new javax.swing.ImageIcon(Global.getPath()+"\\com\\grupo5\\recursos\\FondoTech.jpg"));
        ImageIcon icon = new ImageIcon(Global.getPath()+"\\com\\grupo5\\recursos\\icono.png");
        setIconImage(icon.getImage());
        buttonSimulacion.setIcon(new javax.swing.ImageIcon(Global.getPath()+"\\com\\grupo5\\recursos\\entrada.png"));
        buttonAyuda.setIcon(new javax.swing.ImageIcon(Global.getPath()+"\\com\\grupo5\\recursos\\ayuda.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        buttonSimulacion = new javax.swing.JButton();
        buttonAyuda = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(51, 204, 255));
        jLabel3.setFont(new java.awt.Font("OCR A Extended", 1, 125)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setText("SIMULADOR");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 113));

        jLabel2.setBackground(new java.awt.Color(51, 204, 255));
        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 125)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SIMULADOR");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 113));

        jLabel4.setBackground(new java.awt.Color(51, 204, 255));
        jLabel4.setFont(new java.awt.Font("OCR A Extended", 1, 125)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 255));
        jLabel4.setText("ARBOL AVL");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, 113));

        jLabel5.setBackground(new java.awt.Color(51, 204, 255));
        jLabel5.setFont(new java.awt.Font("OCR A Extended", 1, 125)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ARBOL AVL");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, 113));

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Luis Gonzales");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 340, 30));

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 204, 255));
        jLabel7.setText("REALIZADO POR GRUPO #5");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 430, 20));

        jLabel8.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ayuda");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 50, 30));

        jLabel9.setFont(new java.awt.Font("OCR A Extended", 0, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Johnny Arica Prado");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 340, 30));

        jLabel10.setFont(new java.awt.Font("OCR A Extended", 0, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mario Avila");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 340, 30));

        jLabel11.setFont(new java.awt.Font("OCR A Extended", 0, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Paul Altafuya");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 340, 40));

        jLabel12.setFont(new java.awt.Font("OCR A Extended", 0, 30)); // NOI18N
        jLabel12.setText("REALIZADO POR GRUPO #5");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 430, 20));

        buttonSimulacion.setPreferredSize(new java.awt.Dimension(100, 100));
        buttonSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimulacionActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSimulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 100, 100));

        buttonAyuda.setPreferredSize(new java.awt.Dimension(100, 100));
        buttonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAyudaActionPerformed(evt);
            }
        });
        jPanel2.add(buttonAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 100, 100));

        jLabel14.setFont(new java.awt.Font("OCR A Extended", 0, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Manuel Josue Malla");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 340, 30));

        jLabel13.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Simulacion");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 100, 30));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Metodo ejecutado cuando el boton de entrar al simulador es accionado
     * <br>
     * Crea un nuevo form {@link Simulador} y lo hace visible.
     * @param evt 
     */
    private void buttonSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimulacionActionPerformed
        Simulador sim = new Simulador();
        this.dispose();
        sim.setVisible(true);
    }//GEN-LAST:event_buttonSimulacionActionPerformed
    
    /**
     * Metodo ejecutado cuando el boton de ayuda es accionado
     * <br>
     * Redirecciona al usuario al enlace del manual de usuario del proyecto.
     * @param evt 
     */
    private void buttonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAyudaActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri = new java.net.URI("https://utmachalaeduec-my.sharepoint.com/:b:/g/personal/mmalla1_utmachala_edu_ec/EZW0iFR4hAFDnXxoA8Yv5_sBLxQsSZajAGSeqd4YLWlu7g?e=qUL4Ib");
                    desktop.browse(uri);
                }catch(Exception e){                }
            }            
        }
    }//GEN-LAST:event_buttonAyudaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAyuda;
    private javax.swing.JButton buttonSimulacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
