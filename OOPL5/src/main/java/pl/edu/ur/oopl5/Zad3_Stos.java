/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author Boker
 */
public class Zad3_Stos {

    private int[] stos;
    private int wskaznikStosu = 0;

    public Zad3_Stos(int n) {
        stos = new int[n];
    }

    public void pop() {
        if (wskaznikStosu <= 0) {
            System.out.println("Stos jest pusty");
        } else {
            wskaznikStosu--;
            System.out.println("Zdjęty element: " + stos[wskaznikStosu]);
        }
    }

    public void push(int a) {
        if (wskaznikStosu > stos.length) {
            System.out.println("Stos przepełniony - nie mozna dodac!");

        } else {
            stos[wskaznikStosu] = a;
            System.out.println("Dodano element do stosu.");
            wskaznikStosu++;
        }
    }

}
