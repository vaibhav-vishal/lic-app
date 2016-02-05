package lifeInsurance;

public class insuranceManager {

	public static void printPremium(lic[] policies) {
		
		for(lic ins: policies){
			System.out.println(ins);
			System.out.println("Premium :"+ins.licapp());
		}
		
	}
	
}
