import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz Liczbe: ");
        int n = scanner.nextInt();

        if (n % 2 == 0)
        {
            System.out.println("Liczba parzysta");
        }
        else
        {
            System.out.println("Liczba nie parzysta");
        }

        if (n % 3 == 0)
        {
            System.out.println("Liczba podzielna przez 3");
        }
        else
        {
            System.out.println("Liczba nie podzielna przez 3");
        }

        int parzyste = 0;
        long sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum += i;
            if (i % 2 == 0)
            {
                parzyste++;
            }
        }

        System.out.println("Suma: " + sum);
        System.out.println("Liczby parzyste: " + parzyste);

        scanner.close();
    }
}