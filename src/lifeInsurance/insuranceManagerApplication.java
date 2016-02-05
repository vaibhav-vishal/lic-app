package lifeInsurance;

public class insuranceManagerApplication {

	public static void main(String[] args) {
		
		lic ins1 = new lic(101, "aman", "yearly", 10000);
		lic ins2 = new lic(102, "cman", "yearly", 5000);
		lic ins3 = new lic(103, "bman", "yearly", 1000);
		lic ins4 = new lic(104, "naman", "yearly", 2000);

	lic[] list= new lic[4];
	list[0]=ins1;
	list[1]=ins2;
	list[2]=ins3;
	list[3]=ins4;

//	insuranceManager pol =new insuranceManager();
	//pol.printPremium(list);
	insuranceManager.printPremium(list);
	}
}
