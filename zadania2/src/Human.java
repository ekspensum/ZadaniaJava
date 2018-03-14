public class Human {
    private int wiek, waga, wzrost;
    private String imie, plec;

    public Human(int wiek, int waga, int wzrost, String imie, String plec){
        this.imie=imie;
        this.plec=plec;
        this.waga=waga;
        this.wiek=wiek;
        this.wzrost=wzrost;
    }

    public int getWiek(){
        return wiek;
    }

    public int getWaga(){
        return waga;
    }

    public int getWzrost() {
        return wzrost;
    }

    public String getImie() {
        return imie;
    }

    public String getPlec() {
        return plec;
    }

    public void setWiek(int wiek){
        this.wiek=wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
}
