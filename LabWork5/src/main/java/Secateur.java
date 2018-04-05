public class Secateur {
    private Instrument INSTRUMENT_TYPE = Instrument.SECATEUR;
    private double massOfSecateur;
    private double numberOfCutters;
    private int id;

    public Secateur() {
        super();
    }

    public Secateur(Work work) {
    }

    public double getMassOfSecateur() {
        return massOfSecateur;
    }

    public void setMassOfSecateur(double massOfSecateur) {
        this.massOfSecateur = massOfSecateur;
    }

    public double getNumberOfCutters() {
        return numberOfCutters;
    }

    public void setNumberOfCutters(double numberOfCutters) {
        this.numberOfCutters = numberOfCutters;
    }

    public Instrument getInstrumentType() {
        return INSTRUMENT_TYPE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


