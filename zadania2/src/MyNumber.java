import java.util.Random;

public class MyNumber {
    Random r = new Random();
    private int num;

    public MyNumber() {
        this.num = -10 + r.nextInt(20);
    }
//    public MyNumber(MyNumber x){
//        this.num=x.num;
//    }

    public int getNum() {

        return this.num;
    }

    public boolean isOdd() {
        if (this.num % 2 != 0) return true;
        else return false;
    }

    public boolean isEven() {
        if (this.num % 2 == 0) return true;
        else return false;
    }
    public double sqrt(){
        if (this.num<0) {
            System.out.print("Pierwiastkowanie niemożliwe - liczba mniejsza od ");
            return 0;
        }
        else {
            System.out.print("Pierwiastek: ");
            return Math.sqrt(this.num);
        }

    }

    public double pow(MyNumber x) {
        return Math.pow(this.num, x.getNum());
    }
    public int add(MyNumber x){
        return this.num+x.getNum();
    }
    public int subtract(MyNumber x){
        return this.num - x.getNum();
    }

}
