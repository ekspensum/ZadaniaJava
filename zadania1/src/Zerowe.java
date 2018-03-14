import java.util.Scanner;

public class Zerowe {
    public static void main(String[] args) {

        int n, p;
        Scanner we = new Scanner(System.in);
        System.out.print("Wprowadź rozmiar tablicy: ");
        n = we.nextInt();

        int k = -20;
        int[] tab = new int[n];
        p=n-1;
        for (int i=0; i<= p; i++) {
            tab[i] = -2*k+8;
            k++;
        }

        System.out.println(zerowe(p, tab));
    }

    static int zerowe(int p, int tab[]){
        int l=0;
        int s=0;

        for (int i=0;i<=p;i++)
            System.out.print(i+"."+tab[i]+" ");
        System.out.println();

        while (l<=p){
            s=(l+p)/2;
            if(tab[s]==0)
                return s;
            if(tab[s]*tab[p]>0)
                p=s-1;
            else
                l=s+1;
        }
    return -1;
    }
}
