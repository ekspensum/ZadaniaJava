public interface Figure {
    public double getPerimeter();

    public double getArea();
}

class Circle implements Figure {
    double promien;

    public Circle() {
    }

    public Circle(double promien) {
        this.promien = promien;
    }

    @Override
    public double getPerimeter() {
        return promien * 2 * 3.14;
    }

    @Override
    public double getArea() {
        return promien * promien * 3.14;
    }
}

class Triangle implements Figure {
    double bokA, bokB, bokC;

    public Triangle() {
    }

    public Triangle(double bokA, double bokB, double bokC) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
    }

    @Override
    public double getPerimeter() {
        return bokA + bokB + bokC;
    }

    @Override
    public double getArea() {
        return 0.5 * bokA * bokB;
    }
}

class Rectangle implements Figure {
    double bokA, bokB;

    public Rectangle() {
    }

    public Rectangle(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public double getPerimeter() {
        return 2 * (bokA + bokB);
    }

    @Override
    public double getArea() {
        return bokA * bokB;
    }
}

class Main {
    Figure[] figury;
    static int ileFigur = 0;


    public Main() {
        figury = new Figure[10];
    }

    public static void main(String[] args) {
        Main m = new Main();
        Circle kolo = new Circle(3);
        Triangle trojkat = new Triangle(10, 2, 3);
        Rectangle prostokat = new Rectangle(33, 44);

        m.dodajFigure(kolo);
        m.dodajFigure(trojkat);
        m.dodajFigure(prostokat);
        m.wyswietlPoleObwod();
    }

    void dodajFigure(Figure f) {
        figury[ileFigur] = f;
        ileFigur++;
    }

    void wyswietlPoleObwod() {
        for (int i = 0; i < ileFigur; i++)
            System.out.println("Pole powierzchni: "+figury[i].getArea()+" Obwod: "+figury[i].getPerimeter());
    }
}