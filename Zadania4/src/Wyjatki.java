import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjatki {


    public static void main(String[] args) {
        Scanner we = new Scanner(System.in);

        Double liczba=0.0;
        System.out.println("Wprowadż liczbę: ");
//        if (!we.hasNextDouble()) throw new IllegalArgumentException("Wprowadzony znak nie jest liczbą");
//        else liczba = we.nextDouble();
        if (!we.hasNextDouble()) {
            try {
                if (!we.hasNextDouble()) throw new IllegalArgumentException("To nie liczba");
                else liczba = we.nextDouble();
            } catch (IllegalArgumentException io) {
                System.out.println(io);
            } finally {
                System.out.println("Działa");
            }
        } else liczba = we.nextDouble();
//        System.out.println(sqrt(liczba));
        System.out.println(pierwiastek(liczba));
    }

    public static Double sqrt(Double d) {
        if (d < 0) throw new IllegalArgumentException("Liczba mniejsza od 0");
        return Math.sqrt(d);
    }

    public static Double pierwiastek(Double d) {
        try {
            if (d < 0) throw new IllegalArgumentException("Mniejsza od 0");
            else return Math.sqrt(d);
        } catch (IllegalArgumentException i) {
            System.out.println(i);
        } finally {
            System.out.println("Program działa dalej");
        }
        return Math.sqrt(d);
    }
}
