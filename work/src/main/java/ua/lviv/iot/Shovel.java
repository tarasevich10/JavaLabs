package ua.lviv.iot;

public class Shovel extends Tool {
    public Instrument INSTRUMENT_TYPE = Instrument.SHOVEL;
    private double massOfShovel;
    private double lengthOfShovel;

    public Shovel(Work work) {
        super(work);
    }

    public double getMassOfShovel() {
        return massOfShovel;
    }

    public void setMassOfShovel(double massOfShovel) {
        this.massOfShovel = massOfShovel;
    }

    public double getLengthOfShovel() {
        return lengthOfShovel;
    }

    public void setLengthOfShovel(double lengthOfShovel) {
        this.lengthOfShovel = lengthOfShovel;
    }

    @Override
    public Instrument getInstrumentType() {
        return INSTRUMENT_TYPE;
    }
}
