package telefony;

public class Telefony {
    public static void main(String[] args) {
         Telefon telefonAni = new Telefon("783982331");
         Telefon telefonJarka = new Telefon("608234982");
         telefonAni.zadzwon("0124239832");
         telefonJarka.zadzwon("112");
         double kwota = telefonAni.obliczKwoteDoZaplaty();
         System.out.printf("Ania ma do zaplaty %f zl.", kwota);
    }
}
