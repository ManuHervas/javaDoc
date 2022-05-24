/*
*clase separada del metodo main y de la clase principal
 */
package javadocedd;

import java.util.Scanner;

/**
 *
 * @author Manuel Hervás
 */
import java.util.ArrayList;

import java.util.Random;

 

/**

 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto

**/

public class doc { 

    //Campos de la clase

    private ArrayList<Integer> serieAleatoria;

    /**

     * Constructor para la serie de números aleatorios

     * @param numeroItems El parámetro numeroItems define el número de elementos que va a tener la serie aleatoria

     */

    public doc (int numeroItems) {

        serieAleatoria = new ArrayList<Integer> ();

        for (int i=0; i<numeroItems; i++) {  serieAleatoria.add(0);  }

        System.out.println ("Serie inicializada. El número de elementos en la serie es: " + getNumeroItems() );

    } //Cierre del constructor

    doc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**

     * Método que devuelve el número de ítems (números aleatorios) existentes en la serie

     * @return El número de ítems (números aleatorios) de que consta la serie

     */

    public int getNumeroItems() { return serieAleatoria.size(); }

    /**

     * Método que genera la serie de números aleatorios

     */

    public void generarSerieDeAleatorios () {

        Random numAleatorio;

        numAleatorio = new Random ();

        for (int i=0; i < serieAleatoria.size(); i++) { serieAleatoria.set(i, numAleatorio.nextInt(1000) ); }

        System.out.print ("Serie generada! ");

    } //Cierre del método

} //Cierre de la clase
    
    

