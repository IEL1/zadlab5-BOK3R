package pl.edu.ur.oopl5;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 5, 6
        Ksiazka k1 = new Ksiazka("Imię wiartu", "Patric Ruthfuss", 876, 2008, 23.99);
        Ksiazka k2 = new Ksiazka("Jesienna republika", "Brian McClellan", 696, 2016, 30.16);
        System.out.println(k1.getCena());

        k1.setCena(20.99);
        System.out.println(k1.getCena());

    }

}
