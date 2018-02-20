
public class Main {
	public static void main(String[] args) {
                Computer dell = new Computer();
                Computer asus = new Computer(true,16000,2,"Rog" );
                Computer macbook = new Computer(true,32000,1,"Pro","Taras Chornyi");

                System.out.println(dell.toString());
                System.out.println(asus.toString());
                System.out.println(macbook.toString());
    
                Computer.printStaticSum();
                dell.printStaticSum();
                asus.printStaticSum();
                macbook.printStaticSum();
    
                dell.resetValues(false,16000,2,"Inspirion","Petia Poroh");
                asus.resetValues(false,32000,1,"Dream","John Cena");
                macbook.resetValues(true,16000,4,"Air","Pope John");
                
                System.out.println(dell.toString());
                System.out.println(asus.toString());
                System.out.println(macbook.toString());
                Computer.printStaticSum();
	}

  }
