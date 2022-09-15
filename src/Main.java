import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Wpisz liczbę!");
        Scanner wpisz = new Scanner(System.in);
        int wpisana = wpisz.nextInt();
        System.out.println("Wpisałeś " + wpisana + "!");
    }
}