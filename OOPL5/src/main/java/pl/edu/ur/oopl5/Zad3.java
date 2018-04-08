/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author Boker
 */
public class Zad3 {

    public static void main(String[] ars) {
        Scanner wczytaj = new Scanner(System.in);

        //Inicjacja stosu
        System.out.print("Podaj rozmiar stosu: ");
        int n = wczytaj.nextInt();
        Zad3_Stos s1 = new Zad3_Stos(n);

        //Dodanie elementu do stosu
        System.out.print("Podaj liczbe ktora chcesz dodac do stosu: ");
        int liczba = wczytaj.nextInt();
        s1.push(liczba);
        
        //Zdjecie elementu ze stosu
        s1.pop();
    }

}
