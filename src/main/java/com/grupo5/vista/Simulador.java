/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupo5.vista;

import arbolBinario.ArbolAVL;
import com.grupo5.arbolavlsimulator.AlgoritmosArbol;
import com.grupo5.arbolavlsimulator.Global;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

/**
 *
 * @author mmall
 */
public class Simulador extends javax.swing.JFrame {

    /**
     * Creates new form Home
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
    }
    
    private static ArbolAVL<Integer> arbol;
    private static Canvas canvas;
    
    /**
     * Muestra el panel canvas, donde sera pintado el arbol AVL.
     */
    public static void mostrarCanvas(){
        try{
            CardLayout cl = (CardLayout)(PanelScroll.getLayout());
            cl.show(PanelScroll, "canvas");
        }catch(Exception ex){}
        PanelScroll.repaint();
    }
    
    /**
     * Determina si la entrada de texto es un numero entero positivo entre 0 y 999
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
     * Muestra por texto el estado del arbol AVL
     */
    public void informacionEstadoArbol(){
        limpiarEstadoArbol();
        textNumNodos.setText(textNumNodos.getText()+" "+arbol.numeroDeNodos());
        textAltura.setText(textAltura.getText()+" "+arbol.altura());
        TextNodoMenor.setText(TextNodoMenor.getText()+" "+arbol.menor());
        TextNodoMayor.setText(TextNodoMayor.getText()+" "+arbol.mayor());
        txtAreaInOrder.append(AlgoritmosArbol.textoInOrder(arbol.getRaiz(), new StringBuffer()));
        txtAreaPreOrden.append(AlgoritmosArbol.textoPreOrder(arbol.getRaiz(), new StringBuffer()));
        txtAreaPostOrder.append(AlgoritmosArbol.textoPostOrder(arbol.getRaiz(), new StringBuffer()));
        txtAreaAmplitud.append(AlgoritmosArbol.textoAmplitud(arbol.getRaiz()));
        txtAreaNiveles.append(AlgoritmosArbol.textoAmplitudNiveles(arbol));
        
    }
    
    /**
     * Limpia los textos del estado del arbol AVL
     */
    public void limpiarEstadoArbol(){
        textNumNodos.setText("Numero de nodos:");
        textAltura.setText("Altura:");
        TextNodoMenor.setText("Nodo menor:");
        TextNodoMayor.setText("Nodo mayor:");
        txtAreaInOrder.setText("");
        txtAreaPreOrden.setText("");
        txtAreaPostOrder.setText("");
        txtAreaAmplitud.setText("");
        txtAreaNiveles.setText("");
    }
    
    /**
     * Limpia las acciones realizadas en el simulador
     * <br>
     * Coloca en null el nodoBusqueda del canvas
     * <br>
     * Limpia el texto de aviso y el texto de entrada
     * <br>
     * Dependiendo del dato booleano esGenerarArbol aparece el objeto Spinner y desaparece la entrada de texto o viceversa.
     * <br>
     * Termina repintando el panel y mostrando el canvas
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
     * Primero pinta todos los botones principales al color estandar
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

        Background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        BotonAccion = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        textoAviso = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        BotonAccion1 = new javax.swing.JButton();
        txtTitulo = new javax.swing.JLabel();
        Footer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botones = new javax.swing.JPanel();
        BotonAleatorio = new javax.swing.JButton();
        BotonInsertar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonBusqueda = new javax.swing.JButton();
        BotonSalida = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textNumNodos = new javax.swing.JLabel();
        textAltura = new javax.swing.JLabel();
        TextNodoMayor = new javax.swing.JLabel();
        TextNodoMenor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textInOrder = new javax.swing.JLabel();
        textPreOrder = new javax.swing.JLabel();
        textPostOrder = new javax.swing.JLabel();
        textAmplitud = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaInOrder = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaPreOrden = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaPostOrder = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaAmplitud = new javax.swing.JTextArea();
        textAmplitud1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaNiveles = new javax.swing.JTextArea();
        PanelCentral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelScroll = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setMinimumSize(new java.awt.Dimension(1550, 1030));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel8.setFont(new java.awt.Font("OCR A Extended", 1, 48)); // NOI18N
        jLabel8.setText("ARBOL AVL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 200, 35));

        BotonAccion.setText("Generar");
        BotonAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAccionActionPerformed(evt);
            }
        });
        jPanel2.add(BotonAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 140, 35));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        textoAviso.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(textoAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 180, 40));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 200, 40));

        BotonAccion1.setText("Limpiar Arbol");
        BotonAccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAccion1ActionPerformed(evt);
            }
        });
        jPanel2.add(BotonAccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 140, 35));

        txtTitulo.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        txtTitulo.setText("Generar un arbol aleatorio");
        jPanel2.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        Footer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("UTMACH COPYRIGTH 2023 | 2023-1 | MALLA, ARICA, ALTAFUYA, AVILA, GONSALEZ | 3RO A");

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(852, Short.MAX_VALUE))
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotonAleatorio.setText("Arbol Aleatorio");
        BotonAleatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonAleatorio.setMinimumSize(new java.awt.Dimension(200, 50));
        BotonAleatorio.setPreferredSize(new java.awt.Dimension(200, 50));
        BotonAleatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAleatorioActionPerformed(evt);
            }
        });

        BotonInsertar.setText("Inserción");
        BotonInsertar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonInsertar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsertarActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminación");
        BotonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonBusqueda.setText("Busqueda");
        BotonBusqueda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonBusqueda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBusquedaActionPerformed(evt);
            }
        });

        BotonSalida.setText("Salida");
        BotonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        botonesLayout.setVerticalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonesLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BotonSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonAleatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(405, 100));

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        jLabel2.setText("ESTADO DEL ARBOL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        textNumNodos.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        textNumNodos.setText("Numero de nodos:");

        textAltura.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        textAltura.setText("Altura:");

        TextNodoMayor.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        TextNodoMayor.setText("Nodo mayor:");

        TextNodoMenor.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        TextNodoMenor.setText("Nodo menor:");

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel7.setText("Recorridos:");

        textInOrder.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        textInOrder.setText("InOrder:");

        textPreOrder.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        textPreOrder.setText("PreOrder:");

        textPostOrder.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        textPostOrder.setText("PostOrder:");

        textAmplitud.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        textAmplitud.setText("Amplitud:");

        txtAreaInOrder.setEditable(false);
        txtAreaInOrder.setColumns(20);
        txtAreaInOrder.setRows(1);
        jScrollPane2.setViewportView(txtAreaInOrder);

        txtAreaPreOrden.setEditable(false);
        txtAreaPreOrden.setColumns(20);
        txtAreaPreOrden.setRows(1);
        jScrollPane3.setViewportView(txtAreaPreOrden);

        txtAreaPostOrder.setEditable(false);
        txtAreaPostOrder.setColumns(20);
        txtAreaPostOrder.setRows(1);
        jScrollPane4.setViewportView(txtAreaPostOrder);

        txtAreaAmplitud.setEditable(false);
        txtAreaAmplitud.setColumns(20);
        txtAreaAmplitud.setRows(1);
        jScrollPane5.setViewportView(txtAreaAmplitud);

        textAmplitud1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        textAmplitud1.setText("Niveles:");

        txtAreaNiveles.setEditable(false);
        txtAreaNiveles.setColumns(20);
        txtAreaNiveles.setRows(10);
        jScrollPane6.setViewportView(txtAreaNiveles);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAmplitud1)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAmplitud)
                    .addComponent(textPostOrder)
                    .addComponent(textPreOrder)
                    .addComponent(textInOrder)
                    .addComponent(jLabel7)
                    .addComponent(TextNodoMayor)
                    .addComponent(textAltura)
                    .addComponent(textNumNodos)
                    .addComponent(TextNodoMenor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textNumNodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAltura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextNodoMenor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextNodoMayor)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textInOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPreOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPostOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textAmplitud)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textAmplitud1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        PanelScroll.setLayout(new java.awt.CardLayout());
        jScrollPane1.setViewportView(PanelScroll);

        javax.swing.GroupLayout PanelCentralLayout = new javax.swing.GroupLayout(PanelCentral);
        PanelCentral.setLayout(PanelCentralLayout);
        PanelCentralLayout.setHorizontalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PanelCentralLayout.setVerticalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAleatorioActionPerformed
        estadoBotones("Generar");
        txtTitulo.setText("Generar un arbol aleatorio");
        BotonAccion.setText("Generar");
        limpiarAccion(true);
    }//GEN-LAST:event_BotonAleatorioActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        estadoBotones("Eliminar");
        txtTitulo.setText("Eliminar un dato");
        BotonAccion.setText("Eliminar");
        limpiarAccion(false);
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        PanelScroll.add(canvas, "canvas");
        PanelScroll.add(new Salida(), "salida");
        mostrarCanvas();
    }//GEN-LAST:event_formWindowActivated

    private void BotonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertarActionPerformed
        estadoBotones("Ingresar");
        txtTitulo.setText("Insertar un dato");
        BotonAccion.setText("Ingresar");
        limpiarAccion(false);
    }//GEN-LAST:event_BotonInsertarActionPerformed

    private void BotonAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAccionActionPerformed
        String accion = BotonAccion.getText();
        if(accion.equals("Buscar")){
            if(arbol.buscar(Integer.valueOf(jTextField1.getText()))){
                canvas.setnodoBusqueda(arbol.buscarNodo(Integer.valueOf(jTextField1.getText())));
                textoAviso.setForeground(Color.GREEN);
                textoAviso.setText("El dato ("+jTextField1.getText()+") ha sido encontrado");
            }else{
                textoAviso.setForeground(Color.RED);
                canvas.setnodoBusqueda(null);
                textoAviso.setText("El dato ("+jTextField1.getText()+") no existe en el arbol");
            }
            
        }else if(accion.equals("Generar")){
            
            arbol = AlgoritmosArbol.arbolAleatorio(Integer.parseInt(jSpinner1.getValue().toString()));
            canvas.setArbol(arbol);
        }else if(esEnteroPositivo(jTextField1.getText())){
            
            if(accion.equals("Ingresar")){
                arbol.insertar(Integer.parseInt(jTextField1.getText()));
            }else if(accion.equals("Eliminar")){
                arbol.eliminar(Integer.valueOf(jTextField1.getText()));
            }
            
            
            textoAviso.setText("");
        }else{
            textoAviso.setForeground(Color.RED);
            textoAviso.setText("<html>Dato invalido<br><br>Ingrese un numero positivo de tres digitos.</html>");
            
        }
        
        canvas.repintar();
        informacionEstadoArbol();
    }//GEN-LAST:event_BotonAccionActionPerformed

    private void BotonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBusquedaActionPerformed
        estadoBotones("Buscar");
        txtTitulo.setText("Buscar un dato");
        BotonAccion.setText("Buscar");
        limpiarAccion(false);
    }//GEN-LAST:event_BotonBusquedaActionPerformed

    private void BotonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalidaActionPerformed
        estadoBotones("Salida");
        try{
            CardLayout cl = (CardLayout)(PanelScroll.getLayout());
            cl.show(PanelScroll, "salida");
        }catch(Exception ex){}
        PanelScroll.repaint();
    }//GEN-LAST:event_BotonSalidaActionPerformed

    private void BotonAccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAccion1ActionPerformed
        arbol = new ArbolAVL<>();
        canvas.setArbol(arbol);
        
        limpiarAccion(BotonAccion.getText().equals("Generar"));
    }//GEN-LAST:event_BotonAccion1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton BotonAccion;
    private javax.swing.JButton BotonAccion1;
    private static javax.swing.JButton BotonAleatorio;
    private static javax.swing.JButton BotonBusqueda;
    private static javax.swing.JButton BotonEliminar;
    private static javax.swing.JButton BotonInsertar;
    private static javax.swing.JButton BotonSalida;
    private javax.swing.JPanel Footer;
    private static javax.swing.JPanel PanelCentral;
    private static javax.swing.JPanel PanelScroll;
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
    private static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel textAltura;
    private javax.swing.JLabel textAmplitud;
    private javax.swing.JLabel textAmplitud1;
    private javax.swing.JLabel textInOrder;
    private javax.swing.JLabel textNumNodos;
    private javax.swing.JLabel textPostOrder;
    private javax.swing.JLabel textPreOrder;
    private javax.swing.JLabel textoAviso;
    private javax.swing.JTextArea txtAreaAmplitud;
    private javax.swing.JTextArea txtAreaInOrder;
    private javax.swing.JTextArea txtAreaNiveles;
    private javax.swing.JTextArea txtAreaPostOrder;
    private javax.swing.JTextArea txtAreaPreOrden;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}