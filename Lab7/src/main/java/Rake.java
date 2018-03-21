public class Rake extends Tool {
    private Instrument INSTRUMENT_TYPE = Instrument.RAKE;



    public Rake(final Work work) {
        super(work);
    }

    public String toCSV() {
        return super.toCSV() + COMA + getInstrumentType();
    }

    public String getHeaders() {
        return super.getHeaders() + COMA + "Instrument_type";
    }


    @Override
    public final Instrument getInstrumentType() {
        return INSTRUMENT_TYPE;
    }
}
