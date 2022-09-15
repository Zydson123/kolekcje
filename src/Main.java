import java.util.*;

public class Main {
    public static Set<Integer> losuj(int n) {
        //losowanie bez powtórzeń
        Set<Integer> wylosowane = new HashSet<>();
        while (wylosowane.size() < n) {
            wylosowane.add((int) (Math.random() * 10 + 1));
        }
        return wylosowane;
    }

    public static void wypisz(Set<Integer> tab) {
        int ktory = 0;
        for (int element : tab) {
            ktory += 1;
            System.out.println("Liczba " + ktory + ": " + element + " ");
        }
    }

    public static List<Integer> skaner(int n) {
        List<Integer> li = new ArrayList<>();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj 6 liczb");
        //Lista to kolekcja w której można zmienić rozmiar w trakcie działania programu
        //elementy indeksowania mogą się powtarzać
        while (li.size() < n) {
            int liczba = klawiatura.nextInt();
            while (li.contains(liczba)) {
                System.out.println("Już taką liczbę wpisałeś, wpisz inną");
                liczba = klawiatura.nextInt();
            }
            li.add(liczba);
        }
        return li;
    }

    public static List<Integer> trafianie(Set<Integer> wyl) {
        List<Integer> traf = new LinkedList<>();
        for (Integer Wartosc : wyl) {
            if (wyl.contains(Wartosc)) {
                traf.add(Wartosc);
            }
        }
        return traf;
    }

    public static void main(String[] args) {
        System.out.println("losowanie 6 liczb");
        //aktywowanie funkcji losowania
        Set<Integer> wylosowane = losuj(6);
        //aktywowanie funkcji wypisania zbioru
        wypisz(wylosowane);
        //aktywacja funkcji wpisania do zbioru
        List<Integer> wpisane = skaner(6);
        System.out.println("Twoję trafy to");
        System.out.println(wpisane);
        //sprawdzamy które wartości zostąły wylosowane
        //jeżeli wartość wpisana została wylosowana to dodajemy ją do listy "trafione"
        List<Integer> trafione = trafianie(wylosowane);
        System.out.println("Wylosowane liczby to: ");
        System.out.println(trafione);
    }
}