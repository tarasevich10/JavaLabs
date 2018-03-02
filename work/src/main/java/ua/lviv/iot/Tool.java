package ua.lviv.iot;

public abstract class Tool {
    private double price = 100;

    private Work work;

    public Tool(Work work) {
        this.work = work;
    }

    public abstract Instrument getInstrumentType();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
}
