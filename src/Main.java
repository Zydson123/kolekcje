import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //losowanie 6 liczb, zapiszemy je w tablicy potem w kolekcji
        //wpisywanie 6 liczb
        //sprawdzenie ile trafionych
        System.out.println("losowanie 6 liczb");
        //losowanie bez powtórzeń
        //kolekcja = talice na sterydach
        //kolekcje mogą mieć tylko typy złożone
        //można dowolnie zmieniać rozmiar po zadeklarowaniu
        //po zadeklarowaniu można usuwać i dodawać elementy
        Set<Integer> wylosowane = new HashSet<>();
        //zbiór zazwyczaj zawiera elementy bez powtórzeń
        //zbiór zazwyczaj nie ma indeksowania elementów
        while (wylosowane.size() < 6) {
            wylosowane.add((int) (Math.random() * 100 + 1));
        }
        int ktory = 0;
        for (int element : wylosowane) {
            ktory += 1;
            System.out.println("Licza " + ktory + ": " + element + " ");
        }
    }
}