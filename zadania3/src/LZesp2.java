public class LZesp2 extends LZesp {
    public LZesp2() {
        super();
    }

    public LZesp2(double are, double aim) {
        super(are, aim);
    }

    public LZesp2(LZesp l) {
        super(l.getRe(), l.getIm());
    }

    public String jakoLancuch() {
        if (getRe() == 0 && getIm() == 0)
            return new String("0");
        else if (getIm() == 0)
            return new String(getRe() + " ");
        else if (getRe() == 0)
            return new String(getIm() + "i");
        else if (getIm() < 0 && getRe() != 0)
            return new String(getRe() + " - " + getIm() + "i");
        else if (getIm() < 0 && getRe() == 0)
            return new String(getIm() + "i");
        return new String(getRe() + " + " + getIm() + "i");
    }

//    @Override
//    public void pisz() {
//        super.pisz();
//    }
}
