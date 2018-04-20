public class Wyscig extends Thread {

    private int id;

    public Wyscig(int id) {
        this.id = id;
        try {
            fib(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fib(int id) throws InterruptedException {
        int n = 1000;
        if (id == 0) {
            Long tab[] = new Long[n];
            tab[0] = 1L;
            tab[1] = 1L;
            for (int i = 2; i < n; i++){
                tab[i] = tab[i - 1] + tab[i - 2];
                Thread.sleep(1);
            }
            System.out.println(tab[n - 1]);
        } else if (id == 1) {
            Long fib1 = 1L;
            Long fib2 = 1L;
            Long fib0 = 0L;
            for (int i = 0; i < n - 2; i++) {
                fib0 = fib2 + fib1;
                fib2 = fib1;
                fib1 = fib0;
                Thread.sleep(1);
            }
            System.out.println(fib0);
        }
    }

    public static void main(String[] args) {
        Thread th1 = new Wyscig(0);
        Thread th2 = new Wyscig(1);
        th1.run();
        th2.run();

    }
}
