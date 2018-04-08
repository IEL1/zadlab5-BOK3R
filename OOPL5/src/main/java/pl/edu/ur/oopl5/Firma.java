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
public class Firma {

    private Pracownik[] firma;
    private int pozycja = 0;

    public Firma(int n) {
        firma = new Pracownik[n];
    }

    public void dodaj(Pracownik p) {
        if (pozycja >= firma.length) {
            System.out.print("Tablica pracownikow jest juz pelna");
        } else {
            firma[pozycja] = new Pracownik(p.getImie(), p.getNazwisko(), p.getWiek(), p.getStanowisko());
            pozycja++;
        }

    }
    
    public String toString(){
        String wypisz = "\nLista pracownikow\n";
        for(int i=0;i<pozycja;i++){
            wypisz += "\nPracownik nr "+(i+1)+"\n"+firma[i];
        }
        return wypisz;
    }

}
