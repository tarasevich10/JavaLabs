
public class Computer {
	 private static int totalNumberOfUsers;
	 private boolean isLaptop;
	 private int memoryCapicity;
	 private int numberOfUsers;
	 private String computerName;
	 private String nameOfOwner;
	 

//********************Building constructors********************
public Computer() {
	isLaptop = false;
	memoryCapicity = 8000;
	numberOfUsers = 3;
	computerName = "Not mentioned";
	nameOfOwner = "No name";
	
	
	totalNumberOfUsers += numberOfUsers;
}
public Computer(boolean isLaptop, int memoryCapicity, int numberOfUsers, String computerName ) {
	this.isLaptop = isLaptop;
	this.memoryCapicity = memoryCapicity;
	this.numberOfUsers = numberOfUsers;
	this.computerName = computerName;
	
	totalNumberOfUsers += numberOfUsers;
}
public Computer(boolean isLaptop, int memoryCapicity, int numberOfUsers, String computerName, String nameOfOwner ) {
	this.isLaptop = isLaptop;
	this.memoryCapicity = memoryCapicity;
	this.numberOfUsers = numberOfUsers;
	this.computerName = computerName;
	this.nameOfOwner = nameOfOwner;
	
	totalNumberOfUsers += numberOfUsers;
}
//********************METHODS********************


public String toString() {
	return ("Name of computer -> " +computerName +"\nName of owner -> " + nameOfOwner + "\nCapicity -> " +memoryCapicity +"\nNumberOfUsers -> " +numberOfUsers +"\nLaptop -> " + isLaptop + "\n\n***************" );                                   
}

public static void printStaticSum() {
	System.out.println("Total number of users equals: " + totalNumberOfUsers);
}
public void printSum() {
	System.out.println("Total number of users equals: " + totalNumberOfUsers + "\n******************");
}
public void resetValues(boolean IsLaptop, int memoryCapicity, int numberOfUsers, String computerName, String nameOfOwner ) {
	totalNumberOfUsers -= this.numberOfUsers;
	totalNumberOfUsers += numberOfUsers;
	
	this.isLaptop = IsLaptop;
	this.memoryCapicity = memoryCapicity;
	this.numberOfUsers = numberOfUsers;
	this.computerName = computerName;
	this.nameOfOwner = nameOfOwner;
	
	
}
//********************Getters and Setters (for access to private types)********************
public boolean getisLaptop() {
	return 	isLaptop;
}
public void setisLaptop(boolean isLaptop) {
	this.isLaptop = isLaptop;
}


public int getmemoryCapicity() {
	return memoryCapicity;
}
public void setmemoryCapicity(int memoryCapicity) {
	this.memoryCapicity=memoryCapicity;
}


public int getnumberOfUsers() {
	return numberOfUsers;
}
public void setnumberOfUsers(int numberOfUsers) {
	totalNumberOfUsers -=this.numberOfUsers;
	totalNumberOfUsers += numberOfUsers;
	this.numberOfUsers = numberOfUsers;	
}


public String getcomputerName() {
	return computerName;
}
public void setcomputerName(String computerName) {
	this.computerName=computerName;
}


public String getnameOfOwner() {
	return nameOfOwner;
}
public void setnameOfOwner(String nameOfOwner) {
	this.nameOfOwner=nameOfOwner;
}


}






