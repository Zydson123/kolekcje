package com.Klasa3p.gra;

import java.util.*;

public class gra {
    //modyfikatory dostępu
    /*
    public - dostępne wszędzie
    brak - dostępne wszędzie w pakiecie
    private - dostępne tylko w klasie
    protected - dostępne w klasie i klasach potomnych oraz w pakiecie

    używanie private to hermetyzacja (zamknięcie zmiennych w ramie klasy)
     */
    private static Set<Integer> wylosowaneliczby = new HashSet<>();
    List<Integer> liczby = new ArrayList<>();

    private static List<Integer> trafy = new LinkedList<>();

    public void losu(int n) {
        while (wylosowaneliczby.size() < n) {
            wylosowaneliczby.add((int) (Math.random() * 10 + 1));
        }
    }

    public void wpisane(int n) {
        System.out.println(wylosowaneliczby);
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj " + n + " liczb");
        //Lista to kolekcja w której można zmienić rozmiar w trakcie działania programu
        //elementy indeksowania mogą się powtarzać
        while (liczby.size() < n) {
            int liczba = klawiatura.nextInt();
            while (liczby.contains(liczba)) {
                System.out.println("Już taką liczbę wpisałeś, wpisz inną");
                liczba = klawiatura.nextInt();
            }
            liczby.add(liczba);
        }
    }

    public static void trafianie(List<Integer> traf) {
        for (Integer Wartosc : traf) {
            if (wylosowaneliczby.contains(Wartosc)) {
                trafy.add(Wartosc);
            }
        }
        System.out.println("Liczby które trafiłeś to:");
        System.out.println(trafy);
    }

}
