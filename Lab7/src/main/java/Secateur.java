public class Secateur extends Tool {
    private Instrument INSTRUMENT_TYPE = Instrument.SECATEUR;

    public Secateur(final Work work) {
        super(work);
    }

    public String toCSV() {
        return super.toCSV() + COMA + getInstrumentType();
    }

    public String getHeaders() {
        return super.getHeaders() + COMA + "Instrument_type";
    }

    @Override
    public Instrument getInstrumentType() {
        return INSTRUMENT_TYPE;
    }
}


