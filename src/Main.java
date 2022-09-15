import java.util.*;

public class Main {
    public static void losuj(int n, Set<Integer> tab) {
        //losowanie bez powtórzeń
        while (tab.size() < n) {
            tab.add((int) (Math.random() * 10 + 1));
        }
    }

    public static void wypisz(Set<Integer> tab) {
        int ktory = 0;
        for (int element : tab) {
            ktory += 1;
            System.out.println("Licza " + ktory + ": " + element + " ");
        }
    }

    public static void skaner(int n, List<Integer> li) {
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
        System.out.println(li);
    }

    public static void trafianie(List<Integer> traf, Set<Integer> wyl) {
        for (Integer Wartosc : wyl) {
            if (wyl.contains(Wartosc)) {
                traf.add(Wartosc);
            }
        }
    }

    public static void main(String[] args) {
        //losowanie 6 liczb, zapiszemy je w tablicy potem w kolekcji
        //wpisywanie 6 liczb
        //sprawdzenie ile trafionych
        System.out.println("losowanie 6 liczb");
        //kolekcja = talice na sterydach
        //kolekcje mogą mieć tylko typy złożone
        //można dowolnie zmieniać rozmiar po zadeklarowaniu
        //po zadeklarowaniu można usuwać i dodawać elementy
        Set<Integer> wylosowane = new HashSet<>();
        //aktywowanie funkcji losowania
        losuj(6, wylosowane);
        //aktywowanie funkcji wypisania zbioru
        wypisz(wylosowane);
        //aktywacja funkcji wpisania do zbioru
        List<Integer> wpisane = new ArrayList<>();
        skaner(6, wpisane);
        //sprawdzamy które wartości zostąły wylosowane
        List<Integer> trafione = new LinkedList<>();
        trafianie(trafione, wylosowane);
        //jeżeli wartość wpisana została wylosowana to dodajemy ją do listy "trafione"
    }
}