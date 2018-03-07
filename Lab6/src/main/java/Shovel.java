public class Shovel extends Tool {
    private Instrument INSTRUMENT_TYPE = Instrument.SHOVEL;

    public Shovel(final Work work) {
        super(work);
    }

    @Override
    public Instrument getInstrumentType() {
        return INSTRUMENT_TYPE;
    }
}
