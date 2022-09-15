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

        int tablica2 [];
        tablica2 = tablica;
        tablica[0] = 0;
        System.out.println();
        System.out.println("tablica 1");
        for (int element : tablica){
            System.out.println(element + " ");
        }
        System.out.println("tablica 2");
        for (int element : tablica2){
            System.out.println(element + " ");
        }
        System.out.println("tablica 1");
        System.out.println(tablica);
        System.out.println("tablica 2");
        System.out.println(tablica2);
        int tablica3[] =tablica.clone();
        tablica3[1] = 0;
        System.out.println();
        System.out.println("tablica 1");
        for (int element : tablica){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("tablica 2");
        for (int element : tablica2){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("tablica 3");
        for (int element : tablica3){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(tablica3);
    }
}