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
    public static String textoInOrder(NodoArbol arbol, StringBuffer sb){
        if(arbol!=null) {			
            textoInOrder(arbol.getIz(), sb);
            sb.append(arbol.getClave());
            sb.append(" ");
            textoInOrder(arbol.getDe(), sb);
	}
        return sb.toString();
    }
    
    public static String textoPreOrder(NodoArbol arbol, StringBuffer sb){
        if(arbol!=null) {
            sb.append(arbol.getClave());
            sb.append(" ");
            textoInOrder(arbol.getIz(), sb);
            textoInOrder(arbol.getDe(), sb);
	}
        return sb.toString();
    }
    
    public static String textoPostOrder(NodoArbol arbol, StringBuffer sb){
        if(arbol!=null) {			
            textoInOrder(arbol.getIz(), sb);
            textoInOrder(arbol.getDe(), sb);
            sb.append(arbol.getClave());
            sb.append(" ");
	}
        return sb.toString();
    }
    
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
    
    public static ArbolAVL<Integer> arbolAleatorio(int altura){
        return arbolAleatorio(altura, new ArbolAVL<>());
    }
    
    public static ArbolAVL<Integer> arbolAleatorio(int alturaDeseada, ArbolAVL<Integer> arbol){
        if(arbol.altura()>=alturaDeseada){
            return arbol;
        }
        
        arbol.insertar(Algoritmos.aleatorio(0, 1000));
        return arbolAleatorio(alturaDeseada, arbol);
    }
    
    public static int numeroDeNodos(NodoArbol arbol) {
	if(arbol != null) {
            return 1 + numeroDeNodos(arbol.getIz()) + numeroDeNodos(arbol.getDe());
	}
        
	return 0;
    }
}
