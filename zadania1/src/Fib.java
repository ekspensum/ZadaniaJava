import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner we = new Scanner(System.in);
        System.out.println("Wprowadź n-ty wyraz ciągu Fibonaciego: ");
        int n = we.nextInt();
        System.out.println(fib(n));
    }

    static int fib(int n){

        if(n==1 || n==2) return 1;

        return fib(n-1)+fib(n-2);
    }

//    static int fib2(int n) {
//        int tab [] = new int[n];
//        tab[0]=1;
//        tab[1]=1;
//        for(int i=2;i<n;i++)
//            tab[i]=tab[i-1]+tab[i-2];
//        return tab[n-1];
//    }
//    static int fib3(int n){
//        int fib1=1;
//        int fib2=1;
//        int fib=0;
//        for(int i=0; i<n-2; i++){
//            fib=fib2+fib1;
//            fib2=fib1;
//            fib1=fib;
//        }
//        return fib;
//    }
}
