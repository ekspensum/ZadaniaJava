import java.io.ObjectOutputStream;
import java.util.Objects;

public class Human {
    String imie, nazwisko;
    int wiek;

    public Human(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Human(String imie) {
        this.imie = imie;
    }

    public Human(int wiek) {
        this.wiek = wiek;
    }

    public static void main(String[] args) {
        Human h1 = new Human("Adam", "Kowalski", 20);
        Human h2 = new Human("Ewa", "Nowak", 20);
        Human h3 = new Human("Adam", "Kowalski", 20);
        System.out.println(h1+" "+h2+" "+h3);
        System.out.println(h1.imie.hashCode()+" "+h2.imie.hashCode()+" "+h3.imie.hashCode());
        System.out.println(h1.hashCode()+" "+h2.hashCode()+" "+h3.hashCode());
        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
//        System.out.println(new Human("Adam").equals(new Human("Adam")));
//        System.out.println(new Human("Adam").hashCode()+" "+ new Human("Adam").hashCode());
        System.out.println(Objects.hash(h1.wiek));
        System.out.println(Objects.hash(h1.imie) + " "+ Objects.hash(h3.imie));
    }

//    // Metoda uzyskana z IntelliJ
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Human human = (Human) o;
//        return wiek == human.wiek &&
//                Objects.equals(imie, human.imie) &&
//                Objects.equals(nazwisko, human.nazwisko);
//    }

//    // Metoda uzyskana z IntelliJ
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(imie, nazwisko, wiek);
//    }

    //Własna metoda dla tej klasy
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        System.out.println("pierwszy obiekt - this: "+this+" porównanie: "+(this == o));
        if (o == null) return false;
        if (o instanceof Human){
            return imie.equals(((Human) o).imie) &&
                    nazwisko.equals(((Human) o).nazwisko) &&
                    wiek == ((Human) o).wiek;
        }
        return false;
    }

    //Własna metoda dla tej klasy
    @Override
    public int hashCode(){
        return 7 * Objects.hash(wiek) + 11 * Objects.hash(imie) + 23 * nazwisko.hashCode();
    }
}
