public class Punkt2D {
    private int x, y;

    public Punkt2D(){
        this.x=0;
        this.y=0;
    }
    public Punkt2D(int px, int py){
        this.x=px;
        this.y=py;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
