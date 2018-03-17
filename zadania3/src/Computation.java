import java.util.Scanner;

public interface Computation {
    double compute(double arg1, double arg2);
}

class Addition implements Computation{
    @Override
    public double compute(double arg1, double arg2) {
        return arg1+arg2;
    }
}

class Multiplication implements Computation{
    @Override
    public double compute(double arg1, double arg2) {
        return arg1*arg2;
    }
}

class Main2 {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Main2 main = new Main2();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        String x;
        System.out.println("Mnożenie - wprowadź: 1\n" +
                "Dodawanie - wprowadź inny znak:");
        x = input.next();
        if(x.equals("1")) return true;
        return false; // tutaj zapytaj użytkownika co chce zrobić (mnożenie czy dodawanie)
    }

    private double getArgument() {
        System.out.println("Wprowadź liczbę: ");
        return input.nextInt(); // tutaj pobierz liczbę od użytkownika
    }
}