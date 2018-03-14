import java.util.Random;

public class Minmax {
    public static void main(String[] args) {


        int[] tab5 = new int[20];
        Random gen = new Random();
        System.out.println("Wyświetla tablicę z losowych elementów: ");
        for (int i = 0; i < 20; i++) {
            tab5[i] = -50 + gen.nextInt(100);
            System.out.print(tab5[i] + " ");
        }

        minmax(tab5);
        System.out.println("\n\nWyświetla tablicę posortowaną od min do max: ");

        for (int i = 0; i < 20; i++) {
            System.out.print(tab5[i]+" ");
        }
    }

    public static void minmax(int [] tab5){
        int temp;
        //int [] tab5 = new int[20];

        for (int i=0; i<20; i++)
        {
            for (int j=0; j<19; j++)
            {
                if(tab5[j]>tab5[j+1])
                {
                    temp=tab5[j+1];
                    tab5[j+1]=tab5[j];
                    tab5[j]=temp;
                }
            }
        }

    }
}
