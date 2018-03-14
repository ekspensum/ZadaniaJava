import java.util.Random;

public class MacierzIloczyn {
    public static void main(String[] args) {
        int a=5, b=3;
        Random ran = new Random();
        int tab1 [][] = new int[a][b];
        int tab2 [][] = new int[b][a];

        for (int i=0; i<a; i++){
            System.out.println();
            for (int j=0; j<b; j++){
                tab1[i][j]=ran.nextInt(10);
                System.out.print(tab1[i][j]+" ");
            }
        }
        System.out.println();
        for (int i=0; i<b; i++){
            System.out.println();
            for (int j=0; j<a; j++){
                tab2[i][j]=ran.nextInt(10);
                System.out.print(tab2[i][j]+" ");
            }
        }
        System.out.println();
        int A [][] = wynik(tab1, tab2, a, b);
        for (int i=0; i<a; i++){
            System.out.println();
            for (int j=0; j<a; j++)
                System.out.print(A[i][j]+" ");
        }

    }

    static int [][] wynik(int [][] tab1, int [][] tab2, int a, int b){
        int tab [][] = new int[a][a];
        for (int i=0; i<a; i++){
            //System.out.println();
            for (int j=0; j<a; j++){
                //System.out.println();
                for (int k=0, l=0; k<b; k++, l++){
                        //System.out.println();
                        tab[i][j]=tab[i][j]+tab1[i][k]*tab2[l][j];
                        //System.out.print(tab[i][j]+" ");
                }
                //System.out.print(tab[i][j]+" ");
            }
        }
        return tab;
    }
}
