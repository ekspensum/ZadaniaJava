public class OuterClass {

    private int privInt = 10;

    class InnerClass {
        public void accessOuter() {
            System.out.println("The outer class's privInt is " + privInt);
        }
    }
}

class Zad3 {
    public static void main(String[] args) {
        // tutaj dopisz brakujące polecenia
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.accessOuter();
    }
}