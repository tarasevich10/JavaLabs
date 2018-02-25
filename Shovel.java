public class Shovel extends Tool {
    public Instrument INSTRUMENT_TYPE = Instrument.SHOVEL;
            private double massOfShovel;
            private double lengthOfShovel;

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
}
