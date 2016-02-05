package lifeInsurance;

import java.util.Scanner;
public class licapp {
	public static void main(String[] args) {
		lic ins1 = new lic();
		System.out.println(ins1.licapp());
		lic ins2 = new lic(90001,"Vaibhav","Cash",100000);
		System.out.println(ins2.licapp());
//wrapper class		
	long policyNumeber=Long.parseLong(args[0]);
	long policyAmount = Long.parseLong(args[3]);
	lic ins3 = new lic(policyNumeber,args[1],args[2],policyAmount);
	System.out.println(ins3.licapp());
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter policy number : ");
	long policynumber1 = sc.nextLong();
	System.out.println("\nEnter policy holder name : ");
	String policyHolderName1 = sc.next();
	System.out.println("\nEnter payment mode : ");
	String paymentMode1 = sc.next();
	System.out.println("\nEnter policy amount : ");
	long policyAmount1 = sc.nextLong();
	lic ins4 = new lic(policynumber1,policyHolderName1,paymentMode1,policyAmount1);
	System.out.println(ins4.licapp(policyAmount1));
	System.out.println(ins4.licapp());
	sc.close();
	}
}
