/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupo5.vista;

import arbolBinario.ArbolAVL;
import com.grupo5.arbolavlsimulator.AlgoritmosArbol;
import com.grupo5.arbolavlsimulator.Global;
import static com.grupo5.vista.Simulador.estadoBotones;
import static com.grupo5.vista.Simulador.mostrarCanvas;
import java.awt.CardLayout;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

/**
 *
 * @author paul
 */
public class Simulador extends javax.swing.JFrame {

    /**
     * Creates new form Simulador2
     */
    public Simulador() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        arbol = new ArbolAVL<>();
        Simulador.canvas = new Canvas(arbol);
        setLocationRelativeTo(this);
        ImageIcon icon = new ImageIcon(Global.getPath()+"\\com\\grupo5\\recursos\\icono.png");
        setIconImage(icon.getImage());
        limpiarAccion(true);
        estadoBotones("Generar");
        canvas.setBounds(0, 0, 2000, 2000);
        mostrarCanvas();
    }
    private static ArbolAVL<Integer> arbol;
    private static Canvas canvas;
    
    /**
     * Muestra el panel canvas, donde sera pintado el arbol AVL.
     */
    public static void mostrarCanvas(){
        try{
            jScrollPaneMain.setViewportView(canvas);
            jScrollPaneMain.setWheelScrollingEnabled(true);
            jScrollPaneMain.getVerticalScrollBar().setUnitIncrement(25);
            jScrollPaneMain.getHorizontalScrollBar().setUnitIncrement(25);
            jScrollPaneMain.setBorder(null);
            canvas.repintar();
            PanelCentral.repaint();
        }catch(Exception ex){}
    }
    
    /**
     * Determina si la entrada de texto es un numero entero positivo entre 0 y 999.
     * @param texto
     * @return Boolean
     */
    public static boolean esEnteroPositivo(String texto){
        try{
            int x = Integer.parseInt(texto);
            if(x>=0 && x<1000){
               return true;
           }
        }catch(Exception e){
            
        }
        return false;
    }
    
    /**
     * Muestra por texto el estado del arbol AVL.
     */
    public void informacionEstadoArbol(){
        limpiarEstadoArbol();
        textNumNodos.setText(textNumNodos.getText()+" "+arbol.numeroDeNodos());
        textAltura.setText(textAltura.getText()+" "+arbol.altura());
        TextNodoMenor.setText(TextNodoMenor.getText()+" "+arbol.menor());
        TextNodoMayor.setText(TextNodoMayor.getText()+" "+arbol.mayor());
        txtAreaRecorridos.append("In Order: " +AlgoritmosArbol.textoInOrder(arbol.getRaiz(), new StringBuffer())
            + "\n\nPre Order: "+AlgoritmosArbol.textoPreOrder(arbol.getRaiz(), new StringBuffer())
            + "\n\nPost Order: "+AlgoritmosArbol.textoPostOrder(arbol.getRaiz(), new StringBuffer())
            + "\n\nAmplitud: "+AlgoritmosArbol.textoAmplitud(arbol.getRaiz())
            + "\n\nNiveles: "+AlgoritmosArbol.textoAmplitudNiveles(arbol));
        
    }
    
    /**
     * Limpia los textos del estado del arbol AVL.
     */
    public void limpiarEstadoArbol(){
        textNumNodos.setText("Numero de nodos:");
        textAltura.setText("Altura:");
        TextNodoMenor.setText("Nodo menor:");
        TextNodoMayor.setText("Nodo mayor:");
        txtAreaRecorridos.setText("");
    }
    
    /**
     * Limpia las acciones realizadas en el simulador.
     * <br>
     * Coloca en null el nodoBusqueda del canvas.
     * <br>
     * Limpia el texto de aviso y el texto de entrada.
     * <br>
     * Dependiendo del dato booleano esGenerarArbol aparece el objeto Spinner y desaparece la entrada de texto o viceversa.
     * <br>
     * Termina repintando el panel y mostrando el canvas.
     * @param esGenerarArbol 
     */
    public void limpiarAccion(Boolean esGenerarArbol){
        canvas.setnodoBusqueda(null);
        textoAviso.setText("");
        jTextField1.setText("");
        jSpinner1.setVisible(esGenerarArbol);
        jTextField1.setVisible(!esGenerarArbol);
        repaint();
        mostrarCanvas();
    }
    
    /**
     * Primero pinta todos los botones principales al color estandar.
     * Dependiendo de la cadena de texto proporcionada pintara cierto boton de cyan y azul del menu.
     * @param txt 
     */
    public static void estadoBotones(String txt){
        BotonAleatorio.setBorder(BorderFactory.createLineBorder(Color.gray));
        BotonAleatorio.setBackground(Color.white);
        BotonBusqueda.setBorder(BorderFactory.createLineBorder(Color.gray));
        BotonBusqueda.setBackground(Color.white);
        BotonEliminar.setBorder(BorderFactory.createLineBorder(Color.gray));
        BotonEliminar.setBackground(Color.white);
        BotonInsertar.setBorder(BorderFactory.createLineBorder(Color.gray));
        BotonInsertar.setBackground(Color.white);
        BotonSalida.setBorder(BorderFactory.createLineBorder(Color.gray));
        BotonSalida.setBackground(Color.white);
        
        if(txt.equals("Generar")){
            BotonAleatorio.setBorder(BorderFactory.createLineBorder(Color.BLUE));
            BotonAleatorio.setBackground(Color.CYAN);
        }else if(txt.equals("Eliminar")){
            BotonEliminar.setBorder(BorderFactory.createLineBorder(Color.BLUE));
            BotonEliminar.setBackground(Color.CYAN);
        }else if(txt.equals("Ingresar")){
            BotonInsertar.setBorder(BorderFactory.createLineBorder(Color.BLUE));
            BotonInsertar.setBackground(Color.CYAN);
        }else if(txt.equals("Buscar")){
            BotonBusqueda.setBorder(BorderFactory.createLineBorder(Color.BLUE));
            BotonBusqueda.setBackground(Color.CYAN);
        }else if(txt.equals("Salida")){
            BotonSalida.setBorder(BorderFactory.createLineBorder(Color.BLUE));
            BotonSalida.setBackground(Color.CYAN);
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Footer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        BotonAccion = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        textoAviso = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        BotonAccion1 = new javax.swing.JButton();
        txtTitulo = new javax.swing.JLabel();
        botones = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        BotonAleatorio = new javax.swing.JButton();
        BotonInsertar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonBusqueda = new javax.swing.JButton();
        BotonSalida = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        textNumNodos = new javax.swing.JLabel();
        textAltura = new javax.swing.JLabel();
        TextNodoMayor = new javax.swing.JLabel();
        TextNodoMenor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaRecorridos = new javax.swing.JTextArea();
        PanelCentral = new javax.swing.JPanel();
        jScrollPaneMain = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Footer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("UTMACH COPYRIGTH 2023 | 2023-1 | MALLA, ARICA, ALTAFUYA, ÁVILA, GONZÁLEZ | 3RO A");

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(886, Short.MAX_VALUE))
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Footer, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 200, 35));

        BotonAccion.setText("Generar");
        BotonAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAccionActionPerformed(evt);
            }
        });
        jPanel2.add(BotonAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 140, 35));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        textoAviso.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(textoAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 240, 100));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jSpinner1.setFocusable(false);
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 200, 40));

        BotonAccion1.setText("Limpiar Árbol");
        BotonAccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAccion1ActionPerformed(evt);
            }
        });
        jPanel2.add(BotonAccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 140, 35));

        txtTitulo.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        txtTitulo.setText("Generar un árbol aleatorio");
        jPanel2.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        botones.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel8.setFont(new java.awt.Font("OCR A Extended", 1, 44)); // NOI18N
        jLabel8.setText("ARBOL AVL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        botones.add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel2.setText("ESTADO DEL ARBOL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        botones.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        BotonAleatorio.setText("Árbol Aleatorio");
        BotonAleatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonAleatorio.setMinimumSize(new java.awt.Dimension(200, 50));
        BotonAleatorio.setPreferredSize(new java.awt.Dimension(200, 50));
        BotonAleatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAleatorioActionPerformed(evt);
            }
        });
        jPanel5.add(BotonAleatorio);

        BotonInsertar.setText("Inserción");
        BotonInsertar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonInsertar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsertarActionPerformed(evt);
            }
        });
        jPanel5.add(BotonInsertar);

        BotonEliminar.setText("Eliminación");
        BotonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        jPanel5.add(BotonEliminar);

        BotonBusqueda.setText("Búsqueda");
        BotonBusqueda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonBusqueda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBusquedaActionPerformed(evt);
            }
        });
        jPanel5.add(BotonBusqueda);

        BotonSalida.setText("Salida");
        BotonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalidaActionPerformed(evt);
            }
        });
        jPanel5.add(BotonSalida);

        botones.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(botones, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setMinimumSize(new java.awt.Dimension(280, 435));
        jPanel4.setPreferredSize(new java.awt.Dimension(280, 435));

        textNumNodos.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        textNumNodos.setText("Número de nodos:");

        textAltura.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        textAltura.setText("Altura:");

        TextNodoMayor.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        TextNodoMayor.setText("Nodo mayor:");

        TextNodoMenor.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        TextNodoMenor.setText("Nodo menor:");

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel7.setText("Recorridos:");

        txtAreaRecorridos.setEditable(false);
        txtAreaRecorridos.setColumns(20);
        txtAreaRecorridos.setRows(1);
        jScrollPane2.setViewportView(txtAreaRecorridos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(TextNodoMayor)
                    .addComponent(textAltura)
                    .addComponent(textNumNodos)
                    .addComponent(TextNodoMenor))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(textNumNodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAltura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextNodoMenor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextNodoMayor)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(446, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(194, 194, 194)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(98, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_END);

        PanelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPaneMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        PanelCentral.add(jScrollPaneMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 570));

        getContentPane().add(PanelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Funcion ejecutada cuando el boton de multi-accion del menu es ejecutado.
     * <br>
     * Procesa la instruccion a ejecutar dependiendo de la seccion del programa en la que el usuario se encuentre.
     * <br>
     * Realiza las 4 funciones fundamentales del programa: Arbol aleatorio, Insertar, Eliminar y Buscar.
     * @param evt 
     */
    private void BotonAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAccionActionPerformed
        String accion = BotonAccion.getText();

        if(accion.equals("Generar")){
            arbol = AlgoritmosArbol.arbolAleatorio(Integer.parseInt(jSpinner1.getValue().toString()));
            canvas.setArbol(arbol);
            textoAviso.setForeground(Color.BLUE);
            textoAviso.setText("Arbol de "+jSpinner1.getValue().toString()+" niveles generado!");
        }else if(esEnteroPositivo(jTextField1.getText())){
            if(accion.equals("Buscar")){
                if(arbol.buscar(Integer.valueOf(jTextField1.getText()))){
                    canvas.setnodoBusqueda(arbol.buscarNodo(Integer.valueOf(jTextField1.getText())));
                    textoAviso.setForeground(Color.BLUE);
                    textoAviso.setText("El dato ("+jTextField1.getText()+") ha sido encontrado");
                }else{
                    textoAviso.setForeground(Color.RED);
                    canvas.setnodoBusqueda(null);
                    textoAviso.setText("El dato ("+jTextField1.getText()+") no existe en el arbol");
                }
            }else if(accion.equals("Ingresar")){
                arbol.insertar(Integer.valueOf(jTextField1.getText()));
                textoAviso.setForeground(Color.BLUE);
                textoAviso.setText("Se ha ingresado el dato: "+jTextField1.getText());
            }else if(accion.equals("Eliminar")){
                if(arbol.buscar(Integer.valueOf(jTextField1.getText()))){
                    arbol.eliminar(Integer.valueOf(jTextField1.getText()));
                    textoAviso.setForeground(Color.BLUE);
                    textoAviso.setText("Se ha eliminado el dato: "+jTextField1.getText());
                }else{
                    textoAviso.setForeground(Color.RED);
                    textoAviso.setText("No se ha encontrado el dato: "+jTextField1.getText());
                }
            }
        }else{
            textoAviso.setForeground(Color.RED);
            textoAviso.setText("<html>Dato invalido<br><br>Ingrese un numero positivo de tres digitos.</html>");
        }

        jTextField1.setText("");
        mostrarCanvas();
        informacionEstadoArbol();
    }//GEN-LAST:event_BotonAccionActionPerformed
    /**
     * Metodo ejecutado cuando el boton de Limpiar Arbol es accionado.
     * <br>
     * Crea un nuevo arbol y lo asigna a la variable arbol del formulario.
     * <br>
     * Llama al metodo limpiar Accion.
     * @param evt 
     */
    private void BotonAccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAccion1ActionPerformed
        arbol = new ArbolAVL<>();
        canvas.setArbol(arbol);

        limpiarAccion(BotonAccion.getText().equals("Generar"));
    }//GEN-LAST:event_BotonAccion1ActionPerformed
     /**
     * Metodo ejecutado cuando el boton de arbol aleatorio es accionado.
     * <br>
     * Pinta en azul el boton Generar dentro de los botones del menu.
     * <br>
     * Coloca el texto del titulo de acuerdo a la seccion.
     * <br>
     * Coloca el texto del boton de accion a Generar.
     * <br>
     * Limpia los textos de aviso. 
     * @param evt 
     */
    private void BotonAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAleatorioActionPerformed
        estadoBotones("Generar");
        txtTitulo.setText("Generar un arbol aleatorio");
        BotonAccion.setText("Generar");
        limpiarAccion(true);
    }//GEN-LAST:event_BotonAleatorioActionPerformed
     /**
     * Metodo ejecutado cuando el boton de Insercion es accionado.
     * <br>
     * Pinta en azul el boton Insertar dentro de los botones del menu.
     * <br>
     * Coloca el texto del titulo de acuerdo a la seccion.
     * <br>
     * Coloca el texto del boton de accion a Insertar.
     * <br>
     * Limpia los textos de aviso.
     * @param evt 
     */
    private void BotonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertarActionPerformed
        estadoBotones("Ingresar");
        txtTitulo.setText("Insertar un dato");
        BotonAccion.setText("Ingresar");
        limpiarAccion(false);
    }//GEN-LAST:event_BotonInsertarActionPerformed
    /**
     * Metodo ejecutado cuando el boton de eliminar es accionado.
     * <br>
     * Pinta en azul el boton Eliminacion dentro de los botones del menu.
     * <br>
     * Coloca el texto del titulo de acuerdo a la seccion.
     * <br>
     * Coloca el texto del boton de accion a Eliminar.
     * <br>
     * Limpia los textos de aviso.
     * @param evt 
     */
    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        estadoBotones("Eliminar");
        txtTitulo.setText("Eliminar un dato");
        BotonAccion.setText("Eliminar");
        limpiarAccion(false);
    }//GEN-LAST:event_BotonEliminarActionPerformed
    /**
     * Metodo ejecutado cuando el boton de Busqueda es accionado.
     * <br>
     * Pinta en azul el boton Busqueda dentro de los botones del menu.
     * <br>
     * Coloca el texto del titulo de acuerdo a la seccion.
     * <br>
     * Coloca el texto del boton de accion a Buscar.
     * <br>
     * Limpia los textos de aviso.
     * @param evt 
     */
    private void BotonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBusquedaActionPerformed
        estadoBotones("Buscar");
        txtTitulo.setText("Buscar un dato");
        BotonAccion.setText("Buscar");
        limpiarAccion(false);
    }//GEN-LAST:event_BotonBusquedaActionPerformed
     /**
     * Metodo ejecutado cuando el boton de Salida es accionado.
     * <br>
     * Pinta en azul el boton Salida dentro de los botones del menu.
     * <br>
     * Muestra la pantalla de salida del programa.
     * @param evt 
     */
    private void BotonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalidaActionPerformed
        estadoBotones("Salida");
        try{
            jScrollPaneMain.setViewportView(new Salida());
            jScrollPaneMain.setWheelScrollingEnabled(true);
            jScrollPaneMain.getVerticalScrollBar().setUnitIncrement(25);
            jScrollPaneMain.setBorder(null);
            PanelCentral.repaint();
        }catch(Exception ex){}
    }//GEN-LAST:event_BotonSalidaActionPerformed
    /**
     * Funcion ejecutada al abrir la ventana del programa.
     * <br>
     * Llama a la funcion de mostrarCanvas.
     * @param evt 
     */
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        mostrarCanvas();
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAccion;
    private javax.swing.JButton BotonAccion1;
    private static javax.swing.JButton BotonAleatorio;
    private static javax.swing.JButton BotonBusqueda;
    private static javax.swing.JButton BotonEliminar;
    private static javax.swing.JButton BotonInsertar;
    private static javax.swing.JButton BotonSalida;
    private javax.swing.JPanel Footer;
    private static javax.swing.JPanel PanelCentral;
    private javax.swing.JLabel TextNodoMayor;
    private javax.swing.JLabel TextNodoMenor;
    private javax.swing.JPanel botones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JScrollPane jScrollPaneMain;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel textAltura;
    private javax.swing.JLabel textNumNodos;
    private javax.swing.JLabel textoAviso;
    private javax.swing.JTextArea txtAreaRecorridos;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
