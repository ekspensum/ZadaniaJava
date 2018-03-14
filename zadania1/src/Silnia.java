import java.util.List;
public class Silnia {

    static int silnia(int n) {
        if (n==0) return 1;
        else {
            return n * silnia(n-1);
        }
    }

    public static void main(String[] args) {

        System.out.println(silnia(8));

    }
}
