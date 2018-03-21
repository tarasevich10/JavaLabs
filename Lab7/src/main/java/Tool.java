public abstract class Tool {
    protected final static String COMA = ",";

    private Work work;

    public Tool(final Work work) {
        this.work = work;
    }

    public abstract Instrument getInstrumentType();

    public String toCSV() {
        return "" + getWork();
    }

    public String getHeaders() {
        return "work";
    }

    public Work getWork() {
        return work;
    }

}
