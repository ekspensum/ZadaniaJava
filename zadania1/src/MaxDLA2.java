public class MaxDLA2 {
    public static void main(String[] args) {
        System.out.println(max(-3, 4, 7, -9, -19, -99));
    }

    static int max(int... tab) {
        int temp = 0;
        for (int i = 0; i < tab.length; i++)
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    temp = tab[j + 1];
                    tab[j + 1] = tab[j];
                    tab[j] = temp;
                }
            }
        return tab[tab.length - 1];
    }
}
