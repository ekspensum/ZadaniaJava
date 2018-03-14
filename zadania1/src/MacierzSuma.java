import java.util.Random;

public class MacierzSuma {
    public static void main(String[] args) {
        int a=3,b=8;

        int tab1 [][] = new int[a][b];
        int tab2 [][] = new int[a][b];
        Random ran = new Random(100);

        for (int i=0; i<a; i++){
            System.out.println();
            for (int j=0; j<b; j++){
                tab1[i][j]=-50+ran.nextInt(100);
                System.out.print(tab1[i][j]+" ");
            }
        }

        System.out.println();

        for (int i=0; i<a; i++){
            System.out.println();
            for (int j=0; j<b; j++){
                    tab2[i][j]=-50+ran.nextInt(100);
                    System.out.print(tab2[i][j]+" ");
            }
         }
        System.out.println();

        wynik(tab1, tab2, a, b, "dif");
    }

    static int [][] wynik(int [][] tab1, int [][] tab2, int a, int b, String c){

        int tab [][] = new int[a][b];
        if (c=="sum"){
            for (int i=0; i<a; i++){
                System.out.println();
                for (int j=0; j<b; j++){
                    tab[i][j]=tab1[i][j]+tab2[i][j];
                    System.out.print(tab[i][j]+" ");
                }
            }
        }
        else if (c=="dif"){
            for (int i=0; i<a; i++){
                System.out.println();
                for (int j=0; j<b; j++){
                    tab[i][j]=tab1[i][j]-tab2[i][j];
                    System.out.print(tab[i][j]+" ");
                }
            }
        }
        else System.out.println("Podano nieprawidłowy rodzaj działania");
        return tab;
    }
}
