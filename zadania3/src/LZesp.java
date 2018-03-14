public class LZesp {
    private double re;
    private double im;

    public LZesp() {
        this.re = 0.099;
        this.im = 0.0;
    }

    public LZesp(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public String jakoLancuch() {
        return new String(re + " + " + im + "i");
    }

    public void pisz() {
        System.out.println(jakoLancuch());
    }

    public LZesp plus(LZesp l) {
        return new LZesp(re + l.getRe(), im + l.getIm());
    }

    public LZesp minus(LZesp l) {
        return new LZesp(re - l.getRe(), im - l.getIm());
    }

    public LZesp razy(LZesp l) {
        return new LZesp(re * l.getRe() - im * l.getIm(), re * l.getIm() + im * l.getRe());
    }
}
