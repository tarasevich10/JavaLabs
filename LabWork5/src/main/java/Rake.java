public class Rake extends Tool {
    private Instrument INSTRUMENT_TYPE = Instrument.RAKE;
    private double massOfRake = 400;
    private int numberOfCutters = 4;


    public Rake(Work work) {
        super(work);
    }

    public double getMassOfRake() {
        return massOfRake;
    }

    public int getNumberOfCutters() {
        return numberOfCutters;
    }

    public void setNumberOfCutters(int numberOfCutters) {
        this.numberOfCutters = numberOfCutters;
    }

    public void setMassOfRake(double massOfRake) {
        this.massOfRake = massOfRake;
    }

  /*  @Override
    public Instrument getInstrumentType() {
        return INSTRUMENT_TYPE;
    }*/
}
