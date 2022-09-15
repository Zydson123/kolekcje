import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //losowanie 6 liczb, zapiszemy je w tablicy potem w kolekcji
        //wpisywanie 6 liczb
        //sprawdzenie ile trafionych
        System.out.println("losowanie 6 liczb");
        int tablica[] = new int[6];
        for(int i=0; i<tablica.length; i++){
            tablica[i] = (int)(Math.random() * 100 + 1);
        }
        for (int element : tablica){
            System.out.print(element + " ");
        }
    }
}