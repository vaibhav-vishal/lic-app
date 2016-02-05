package lifeInsurance;

public class lic {
private long policyNumber;
private String policyHolderName;
private String paymentMode;
private long policyAmount;

static{
	//System.out.println("Static block called");
}
{
//System.out.println("initializatiopn block called");	
}



public long getPolicyNumber() {
	return policyNumber;
}
public void setPolicyNumber(long policyNumber) {
	this.policyNumber = policyNumber;
}
public String getPolicyHolderName() {
	return policyHolderName;
}
public void setPolicyHolderName(String policyHolderName) {
	this.policyHolderName = policyHolderName;
}
public String getPaymentMode() {
	return paymentMode;
}
public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}
public long getPolicyAmount() {
	return policyAmount;
}
public void setPolicyAmount(long policyAmount) {
	this.policyAmount = policyAmount;
}
public lic() {
	super();
	System.out.println("constructor called");
	// TODO Auto-generated constructor stub
}

public lic(long policyNumber, String policyHolderName, String paymentMode, long policyAmount) {
	super();
	//System.out.println("constructor with args called");
	this.policyNumber = policyNumber;
	this.policyHolderName = policyHolderName;
	this.paymentMode = paymentMode;
	this.policyAmount = policyAmount;
	
	
}

public double licapp(){
return .1*policyAmount;
}
public double licapp(double policyAmt){
	double amount= policyAmt*.1;
	double discount = amount*.5;
	double netAmount=amount-discount;
	return netAmount;
}
@Override
public String toString() {
	return this.policyNumber+" : "+this.policyHolderName;
}

@Override
public int hashCode() {
	long code=this.policyNumber +7*policyNumber;
	return (int)code;
	
}
@Override
public boolean equals(Object obj) {
	if(this==obj)return true;
		
if(obj==null)return false;

if(this.getClass()!=obj.getClass()) return false;

//casting
lic ins = (lic)obj;

//checking the condition
return policyNumber==ins.policyNumber  && policyHolderName==ins.policyHolderName;

	}
}

