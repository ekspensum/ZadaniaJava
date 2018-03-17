public class Kot extends Zwierz {
    public Kot() {
    }

    public Kot(String name) {
        super(name);
    }

    @Override
    String getType() {
        return "Kot ";
    }

    @Override
    String getVoice() {
        return "Miauuuu";
    }
}
