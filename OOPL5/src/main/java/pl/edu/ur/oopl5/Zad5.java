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
public class Zad5 {

    public static void main(String[] arg) {
        Scanner wczytaj = new Scanner(System.in);
        Firma firma = new Firma(100);

        //Dodawnie nowych pracowników
        System.out.print("Podaj imie pracownika: ");
        String imie = wczytaj.nextLine();
        System.out.print("Podaj nazwisko: ");
        String nazwisko = wczytaj.nextLine();
        System.out.print("Podaj wiek: ");
        int wiek = wczytaj.nextInt();
        System.out.print("Podaj stanowisko: ");
        String stanowisko = wczytaj.next();
        Pracownik p1 = new Pracownik(imie, nazwisko, wiek, stanowisko);
        firma.dodaj(p1);
        
        //Wyświetlanie tablicy
        System.out.println(firma);
    }

}
