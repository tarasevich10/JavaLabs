import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Tool {
  //  private double price = 100;

  //  private Work work;
    Instrument instrumentType;
    public Tool(Work work) {
        this.work = work;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name ="price")
    private double price;

    @Column(name ="work")
    private Work work;

    //public abstract Instrument getInstrumentType();

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

    public Instrument getInstrumentType() {
        return instrumentType;
    }
}
