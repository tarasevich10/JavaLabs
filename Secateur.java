public class Secateur extends Tool {
    private Instrument INSTRUMENT_TYPE = Instrument.SECATEUR;
    private double massOfSecateur;
    private double numberOfCutters;

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
}

