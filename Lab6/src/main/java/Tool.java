public abstract class Tool {


    private Work work;

    public Tool(final Work work) {
        this.work = work;
    }

    public abstract Instrument getInstrumentType();


    public Work getWork() {
        return work;
    }

}
