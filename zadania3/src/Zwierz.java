public abstract class Zwierz {
    private String name = "bez imienia";

    public Zwierz(){

    }
    public Zwierz(String name) {
        this.name = name;
    }
    abstract String getType();
    abstract String getVoice();

    public String getName() {
        return name;
    }
    public void speak(){
        System.out.println(getType()+getName()+" mówi: "+getVoice());
    }
}

//class Pies extends Zwierz{
//    public Pies(){
//
//    }
//
//    public Pies(String name) {
//        super(name);
//    }
//
//    @Override
//    String getType() {
//        return "Pies";
//    }
//
//    @Override
//    String getVoice() {
//        return "Hau Hau";
//    }
//}

