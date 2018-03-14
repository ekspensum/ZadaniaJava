public class SumaDLA2 {
    public static void main(String[] args) {

        System.out.println(suma(1,5,6,8,9,1,-311,-8,4,-23,123));

    }

    static int suma(int... tab){
        int sum=0;
        for (int i=0; i<tab.length; i++){
            sum+=tab[i];
        }
        return sum;
    }
}