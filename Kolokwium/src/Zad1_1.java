import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Zad1_1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(46, 83, -36, 64, 2, -67);
        for(Integer n: list) {
//            System.out.println(n);
        }
// interface funkcyjny Consumer - http://zacznijprogramowac.net/omowienie-interfejsow-consumer-function-unaryoperator-7/
        Consumer<Integer> consumerInt = (liczby) -> System.out.println(liczby);
        list.forEach(consumerInt);
    }
}
