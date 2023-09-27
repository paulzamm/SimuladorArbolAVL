/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import arbolBinario.ArbolAVL;
import arbolBinario.NodoArbol;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import arbolavlsimulator.AlgoritmosArbol;
import java.awt.Dimension;
import javax.swing.JLabel;

/**
 * JPanel usado para pintar el arbol AVL
 * @author mmall
 */
public class Canvas extends javax.swing.JPanel {

    /**
     * Creates new form Canvas
     * @param arbol
     */
    public Canvas(ArbolAVL<Integer> arbol) {
        initComponents();
        Canvas.arbol = arbol;
        nodoBusqueda = null;
    }
    
    public static ArbolAVL<Integer> arbol;
    public static NodoArbol<Integer> nodoBusqueda;
    public static Dimension defaultSize = new Dimension(WIDTH, HEIGHT);
    
    /**
     * Asigna el arbol que usara el canvas
     * @param Arbol
     */
    public void setArbol(ArbolAVL Arbol){
        arbol = Arbol;
        
    }
    
    /**
     * Asigna un nodo que sera buscado y pintado dentro del canvas
     * @param nodo 
     */
    public void setnodoBusqueda(NodoArbol<Integer> nodo){
        nodoBusqueda = nodo;
    }
    
    /**
     * Vuelve a repintar el canvas
     */
    public void repintar(){
        int x = AlgoritmosArbol.nodosHojas(arbol.getRaiz())*200+200;
        int y =  arbol.altura()*75;
        
        int width = defaultSize.width;
        int height = defaultSize.height;
        
        if(x>defaultSize.width)width = x;
        if(y>defaultSize.height)height = y;
        this.setPreferredSize(new Dimension(width, height));
        
        repaint();
    }
    
    /**
     * Instrucciones a realizar cuando el canvas sea pintado
     * @param g 
     */
    @Override
    public void paint(Graphics g){
        super.paint(g);
        dibujarNodo(g, getWidth()/2, 20, arbol.getRaiz());
    }
    
    /**
     * Metodo recursivo que pinta cada uno de los nodos de un arbol AVL
     * <br>
     * Recibe las posiciones (x) y (y) para denterminar el lugar donde el nodo sera pintado
     * @param g
     * @param x
     * @param y
     * @param nodo 
     */
    public void dibujarNodo(Graphics g, int x, int y, NodoArbol<Integer> nodo){
    	int anchoExtra;
        if(nodo != null) {
            g.setColor(Color.GREEN);
            g.fillOval(x, y, 30, 30);
            if(nodoBusqueda!=null && nodoBusqueda.equals(nodo)){
                g.setColor(Color.RED);
                g.drawOval(x, y, 30, 30);
            }
            g.setColor(Color.BLACK);
            g.setFont(new Font( "Arial", Font.BOLD, 14 ) );
            g.drawString(nodo.getClave().toString(), x+8, y+18);
            g.setFont(new Font( "Arial", Font.ITALIC, 10 ) );
            g.drawString(nodo.getFe()+"", x+8+5, y+18-20);
            
            anchoExtra = AlgoritmosArbol.numeroDeNodosCompleto(nodo)*(40);
            g.setColor(Color.BLACK);
            if(nodo.getIz() != null)
            	g.drawLine(x+15, y+15, x-50-anchoExtra+15, y+75+15);
	        if(nodo.getDe() != null)
	         	g.drawLine(x+15, y+15, x+50+anchoExtra+15, y+75+15);
            dibujarNodo(g, x-50-anchoExtra, y+75, nodo.getIz());
            dibujarNodo(g, x+50+anchoExtra, y+75, nodo.getDe());
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

        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
