
public class Main {
	public static void main(String[] args) {
Computer Dell = new Computer();
Computer Asus = new Computer(true,16000,2,"Rog" );
Computer MacBook = new Computer(true,32000,1,"Pro","Taras Chornyi");

    System.out.println(Dell.toString());
    System.out.println(Asus.toString());
    System.out.println(MacBook.toString());
    Computer.printStaticSum();
    Dell.printStaticSum();
    Asus.printStaticSum();
    MacBook.printStaticSum();
    
    Dell.resetValues(false,16000,2,"Inspirion","Petia Poroh");
    Asus.resetValues(false,32000,1,"Dream","John Cena");
    MacBook.resetValues(true,16000,4,"Air","Pope John");
    System.out.println(Dell.toString());
    System.out.println(Asus.toString());
    System.out.println(MacBook.toString());
    Computer.printStaticSum();
    
    
	}
}
