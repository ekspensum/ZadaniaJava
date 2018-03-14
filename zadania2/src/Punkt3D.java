public class Punkt3D extends Punkt2D {
    private int z;

    public Punkt3D(){
        super.setX(555);
        super.setY(666);
        this.z=0;
    }
    public Punkt3D(int pz, int px){
        super.setX(px);
        this.z=pz;
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

    public int getZ() {
        return z;
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }

    public void setZ(int z) {
        this.z = z;
    }
}
