public class Rake extends Tool {
    private Instrument INSTRUMENT_TYPE = Instrument.RAKE;



    public Rake(final Work work) {
        super(work);
    }

    @Override
    public final Instrument getInstrumentType() {
        return INSTRUMENT_TYPE;
    }
}
