/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo5.arbolavlsimulator;

import arbolBinario.ArbolAVL;
import arbolBinario.NodoArbol;
import java.util.logging.Level;
import java.util.logging.Logger;
import tadCola.Cola;
import tadCola.ColaVacia;
import tadCola.TadCola;
import Algoritmos.Algoritmos;

/**
 *
 * @author mmall
 */
public class AlgoritmosArbol {
    
    /**
     * Retorna una cadena de String del recorrido en orden de un arbolAvl
     * <br>
     * Usa recursividad para hacer el recorrido
     * @param arbol
     * @param sb
     * @return String
     */
    public static String textoInOrder(NodoArbol arbol, StringBuffer sb){
        if(arbol!=null) {			
            textoInOrder(arbol.getIz(), sb);
            sb.append(arbol.getClave());
            sb.append(" ");
            textoInOrder(arbol.getDe(), sb);
	}
        return sb.toString();
    }
    
    /**
     * Retorna una cadena de String del recorrido en preOrden de un arbolAvl
     * <br>
     * Usa recursividad para hacer el recorrido
     * @param arbol
     * @param sb
     * @return String
     */
    public static String textoPreOrder(NodoArbol arbol, StringBuffer sb){
        if(arbol!=null) {
            sb.append(arbol.getClave());
            sb.append(" ");
            textoInOrder(arbol.getIz(), sb);
            textoInOrder(arbol.getDe(), sb);
	}
        return sb.toString();
    }
    
    /**
     * Retorna una cadena de String del recorrido en postOrden de un arbolAvl
     * <br>
     * Usa recursividad para hacer el recorrido
     * @param arbol
     * @param sb
     * @return String
     */
    public static String textoPostOrder(NodoArbol arbol, StringBuffer sb){
        if(arbol!=null) {			
            textoInOrder(arbol.getIz(), sb);
            textoInOrder(arbol.getDe(), sb);
            sb.append(arbol.getClave());
            sb.append(" ");
	}
        return sb.toString();
    }
    
    /**
     * Retorna una cadena de String del recorrido en Amplitud de un arbolAvl
     * <br>
     * Usa una estructura de datos auxiliar cola para almacenar cada uno de los nodos
     * @param arbol
     * @return 
     */
    public static String textoAmplitud(NodoArbol arbol){
        NodoArbol p;
        StringBuffer sb = new StringBuffer();
	Cola<NodoArbol> cola = new TadCola<>();
        
		
	p = arbol;
	if(p != null)
            cola.encolar(p);
	while(!cola.colaVacia()) {
            try {
                p = cola.desencolar();
                sb.append(p.getClave());
                sb.append(" ");
                if(p.getIz() != null)
                    cola.encolar(p.getIz());
                if(p.getDe() != null)
                    cola.encolar(p.getDe());
            } catch (ColaVacia ex) {
                Logger.getLogger(Algoritmos.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        
        return sb.toString();
    }
    
    public static String textoAmplitudNiveles(ArbolAVL arbol){
        NodoArbol p;
        StringBuffer sb = new StringBuffer();
	Cola<NodoArbol> cola = new TadCola<>();
		
	p = arbol.getRaiz();
	if(p != null)
            cola.encolar(p);
	while(!cola.colaVacia()) {
            try {
                p = cola.desencolar();
                //System.out.println("clave:" + p.getClave() + " nivel:" + nivel(p.getClave()) + " fe:" + p.getFe());
                sb.append("clave: ");
                sb.append(p.getClave());
                sb.append(" nivel: ");
                sb.append(arbol.nivel(p.getClave()));
                sb.append(" fe: ");
                sb.append(p.getFe());
                sb.append("\n");
                if(p.getIz() != null)
                    cola.encolar(p.getIz());
                if(p.getDe() != null)
                    cola.encolar(p.getDe());
            } catch (ColaVacia ex) {
                Logger.getLogger(AlgoritmosArbol.class.getName()).log(Level.SEVERE, null, ex);
            }
            
	}
        return sb.toString();
    }
    
    /**
     * Recibe una altura determinada y crea un nuevo arbol para ser completado de nodos con numeros aleatorios desde 1 al 1000
     * @param altura
     * @return {@link ArbolAVL}
     */
    public static ArbolAVL<Integer> arbolAleatorio(int altura){
        return arbolAleatorio(altura, new ArbolAVL<>());
    }
    
    /**
     * Metodo recursivo que recibe el arbol y la altura deseada, completando sus nodos hasta la altura deseada.
     * @param alturaDeseada
     * @param arbol
     * @return {@link ArbolAVL}
     */
    private static ArbolAVL<Integer> arbolAleatorio(int alturaDeseada, ArbolAVL<Integer> arbol){
        if(arbol.altura()>=alturaDeseada){
            return arbol;
        }
        
        arbol.insertar(Algoritmos.aleatorio(0, 1000));
        return arbolAleatorio(alturaDeseada, arbol);
    }
    
    /**
     * Metodo recursivo que determina los numeros de nodos hijos de un nodo padre
     * @param arbol
     * @return int
     */
    public static int numeroDeNodos(NodoArbol arbol) {
	if(arbol != null) {
            return 1 + numeroDeNodos(arbol.getIz()) + numeroDeNodos(arbol.getDe());
	}
        
	return 0;
    }
}
