import java.io.*;
import java.util.Random;

public class Zad8 {


    public static void main(String[] args) throws IOException {
        Double[][] tab = new Double[10][10];
        Double [][] tab2 = new Double[10][10];
        Random los = new Random();
        FileWriter fw = null;
        DataOutputStream dos = null;
        DataInputStream dis = null;
        double [] sumRow = new double[10];
        double [] sumCol = new double[10];

        try {
            dos = new DataOutputStream(new FileOutputStream("tab2wym.bin"));
            fw = new FileWriter("tab2wym.txt");
            for (int i = 0; i < 10; i++)
                for (int j = 0; j < 10; j++) {
                    tab[i][j] = los.nextDouble() * 1000;
                    fw.write(Double.toString(tab[i][j]) + "\r\n");
                    dos.writeDouble(tab[i][j]);
                }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fw.close();
            dos.close();
        }

        dis = new DataInputStream(new FileInputStream("tab2wym.bin"));

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab2[i][j] = dis.readDouble();
                System.out.print(tab2[i][j]+" ");
                sumCol[j] = sumCol[j]+tab2[i][j];
                sumRow[i] = sumRow[i]+tab2[i][j];
            }
            System.out.println();
        }

        for (int i=0; i<sumCol.length; i++){
            System.out.println("średnia kolumny: "+i+". "+sumCol[i]/10.0);
            System.out.println("średnia wiersza: "+i+". "+sumRow[i]/10.0);
        }

        dis.close();
    }
}
