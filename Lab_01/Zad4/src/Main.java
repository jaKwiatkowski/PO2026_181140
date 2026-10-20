import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Nie bylo srednika

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) { //Byla deklaracja zamiast porownania
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta"); //Nie bylo srednika
        }

        for (int i = 0; i <= 5; i++) { //Byla dekrementacja zamiast inkrementacji
            System.out.println(i);
        }

        scanner.close();
    }
}