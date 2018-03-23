

class MyException extends Throwable {
    private int a, b;

    MyException (int x, int y) {
        a = x; b = y;
    }

    public String toString() {
        return "Moj Wyjatek[" + a + "," + b + "]";
    }
}


class Wyjatki2 {
    static int f(int a, int b) throws MyException {
        if (a/b == 2) throw new MyException(a,b);
        return a/b;
    }

    public static void main (String args[]) {
        int a = 7, b = 3;
        try {
            System.out.println("a/b = " + f(a,b));
        } catch (MyException e) {
            System.out.println("w catch " + e);
        }
    }
}

