public abstract class Tool  {
    private double price = 100 ;

         private Work work;
         public abstract Instrument getInstrumentType();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    public Instrument getInstrument() {
//        return instrument;
//    }
//
//    public void setInstrument(Instrument instrument) {
//        this.instrument = instrument;
//    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
}
