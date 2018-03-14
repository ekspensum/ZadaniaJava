import java.util.Random;
import java.util.Scanner;

public class MinMaxRek {
    public static void main(String[] args) {
        Scanner we = new Scanner(System.in);
        System.out.print("Wprowadź rozmiar tablicy: ");
        int a = we.nextInt();
        int tab[] = new int[a];
        Random los = new Random();
        for (int i = 0; i < a; i++) {
            tab[i] = -100 + los.nextInt(200);
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        //int A[] = new int[a];
        //A = minmax(tab, a, 0);
        minmax(tab,a,0);
        for (int i = 0; i < a; i++)
            System.out.print(tab[i] + " ");
        System.out.println("\nMinimalna wartość: "+tab[0]);
    }

    public static int [] minmax(int[] tab, int a, int x) {
        int temp;
        x++;
        if (x == a) return tab;
        else {
            for (int i = 0; i < a - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                }
                //System.out.print(tab[i]+" ");
            }
//            System.out.println();
//            for (int i = 0; i < a; i++)
//                System.out.print(tab[i] + " ");
            return minmax(tab, a, x);
        }
    }
}
