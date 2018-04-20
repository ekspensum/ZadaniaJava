public enum Computation {
    MULTIPY, DIVIDE, ADD, SUBTRACT;

    public double perform(double x, double y){
        if (MULTIPY.equals(this)){
            System.out.println(x*y);
            return x*y;
        }
        else if (DIVIDE.equals(this)) {
            if (y != 0){
                System.out.println(x/y);
                return x/y;
            } else System.out.println("Nie można dzielić przez 0");
        }
        else if (ADD.equals(this)){
            System.out.println(x+y);
            return x+y;
        }
        else if (SUBTRACT.equals(this)){
            System.out.println(x-y);
            return x-y;
        }
        return -0.0;
    }

    public static void main(String[] args) {
        Computation.DIVIDE.perform(2,3);
        Computation.DIVIDE.perform(3,0);
        Computation.SUBTRACT.perform(10,33.9);
        Computation.ADD.perform(2.55,4.45);
        Computation.MULTIPY.perform(10,100.1);
    }
}
