package lifeInsurance;

public class Over_Riding_Application {

	public final static void main(String[] args) {
		lic ins1 = new lic(101, "abc", "qtt", 9000);
		lic ins2 = new lic(101, "abc", "qtt", 9000);
lic ins3=null;
		System.out.println(ins1.equals(ins2));
		System.out.println(ins1.equals(ins3));
		
	}

}
