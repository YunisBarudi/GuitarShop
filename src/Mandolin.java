public class Mandolin extends Instrument {


    private MandolinSpec spec;


    public Mandolin(String serialNumber, double price,MandolinSpec spec) {
        super(serialNumber, price);
        this.spec = spec;
    }
}
