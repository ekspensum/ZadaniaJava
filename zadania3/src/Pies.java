public class Pies extends Zwierz {
    public Pies() {
    }

    public Pies(String name) {
        super(name);
    }

    @Override
    String getType() {
        return "Pies ";
    }

    @Override
    String getVoice() {
        return "Hau Hau";
    }
    @Override
    public String toString(){
        return "Klasa: "+getClass().getName()+" zwierze: "+getType()+" daje głos: "+getVoice();
    }
}
