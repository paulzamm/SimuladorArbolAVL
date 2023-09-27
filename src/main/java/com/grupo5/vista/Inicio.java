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
        ImageIcon icon = new ImageIcon(Global.getPath()+"\\com\\grupo5\\recursos\\icono.png");
        setIconImage(icon.getImage());
        jLabel1.setIcon(new javax.swing.ImageIcon(Global.getPath()+"\\com\\grupo5\\recursos\\fondoInicio.jpg"));
        buttonSimulacion.setIcon(new javax.swing.ImageIcon(Global.getPath()+"\\com\\grupo5\\recursos\\botonSimulador.png"));
        buttonAyuda.setIcon(new javax.swing.ImageIcon(Global.getPath()+"\\com\\grupo5\\recursos\\botonAyuda.png"));
        buttonDesarrolladores.setIcon(new javax.swing.ImageIcon(Global.getPath()+"\\com\\grupo5\\recursos\\botonDesarrolladores.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buttonAyuda = new javax.swing.JButton();
        buttonSimulacion = new javax.swing.JButton();
        buttonDesarrolladores = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonAyuda.setPreferredSize(new java.awt.Dimension(100, 100));
        buttonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAyudaActionPerformed(evt);
            }
        });
        jPanel2.add(buttonAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 200, 50));

        buttonSimulacion.setPreferredSize(new java.awt.Dimension(100, 100));
        buttonSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimulacionActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSimulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 200, 50));

        buttonDesarrolladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDesarrolladoresActionPerformed(evt);
            }
        });
        jPanel2.add(buttonDesarrolladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 200, 50));
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
    private void buttonSimulacionActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        Simulador sim = new Simulador();
        this.dispose();
        sim.setVisible(true);
    }                                                
    
    /**
     * Metodo ejecutado cuando el boton de ayuda es accionado
     * <br>
     * Redirecciona al usuario al enlace del manual de usuario del proyecto.
     * @param evt 
     */
    private void buttonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAyudaActionPerformed
        java.awt.Desktop desktop;
        if(java.awt.Desktop.isDesktopSupported()){
            desktop = java.awt.Desktop.getDesktop();
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri = new java.net.URI("https://utmachalaeduec-my.sharepoint.com/:b:/g/personal/mmalla1_utmachala_edu_ec/EZW0iFR4hAFDnXxoA8Yv5_sBLxQsSZajAGSeqd4YLWlu7g?e=qUL4Ib");
                    desktop.browse(uri);
                }catch(Exception e){                }
            }
        }
    }//GEN-LAST:event_buttonAyudaActionPerformed

//GEN-FIRST:event_buttonSimulacionActionPerformed
 
//GEN-LAST:event_buttonSimulacionActionPerformed
    /** 
     * Metodo ejecutado cuando el boton Desarrolladores es accionado
     * <br>
     * Crea un nuevo form {@link InfoDesarrolladores} y lo hace visible.
     * Redirecciona al usuario a la pantalla de información de Desarrolladores.
     * @param evt 
     */
    private void buttonDesarrolladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDesarrolladoresActionPerformed
        InfoDesarrolladores inf = new InfoDesarrolladores();
        this.dispose();
        inf.setVisible(true);
    }//GEN-LAST:event_buttonDesarrolladoresActionPerformed
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAyuda;
    private javax.swing.JButton buttonDesarrolladores;
    private javax.swing.JButton buttonSimulacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
