public class Secateur extends Tool {
    private Instrument INSTRUMENT_TYPE = Instrument.SECATEUR;

    public Secateur(final Work work) {
        super(work);
    }

    @Override
    public Instrument getInstrumentType() {
        return INSTRUMENT_TYPE;
    }
}


