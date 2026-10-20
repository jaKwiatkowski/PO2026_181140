import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Liczby calkowite:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Liczba nr " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];
        long sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
            sum += numbers[i];
        }

        double avrage = (double) sum / numbers.length;

        int greater = 0;
        for (int number : numbers) {
            if (number > avrage) {
                greater++;
            }
        }

        System.out.println("Najwieksza wartosc: " + max);
        System.out.println("Najmniejsza wartosc: " + min);
        System.out.println("Suma wszystkich elementow: " + sum);
        System.out.println("Srednia arytmetyczna: " + avrage);
        System.out.println("Ilosc wartości wiekszych od sredniej: " + greater);
        scanner.close();
    }
}