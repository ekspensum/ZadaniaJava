import static java.lang.Math.sqrt;

public class Prostokat {
    private int dl, szer;

    public Prostokat(){
        szer=1;
        dl=1;
    }
    public Prostokat(Prostokat p1){
        this.szer=p1.szer;
        this.dl=p1.dl;
    }
    public int pole(){
        return dl*szer;
    }
    public int obwod(){
        return (szer+dl)*2;
    }
    public double przekatna(){
        return sqrt(dl*dl+szer*szer);
    }

    public void setDl(int dl) {
        this.dl = dl;
    }

    public void setSzer(int szer) {
        this.szer = szer;
    }

    public int getDl() {
        return dl;
    }

    public int getSzer() {
        return szer;
    }
}
