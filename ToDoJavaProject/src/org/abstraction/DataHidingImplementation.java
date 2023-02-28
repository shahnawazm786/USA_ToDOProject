package org.abstraction;

public class DataHidingImplementation {
	static PublicModifierAccessibleExample p;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableModifierExample vme=new VariableModifierExample();
		vme.showSalary();
		p=new PublicModifierAccessibleExample();
		p.accountNo=20000;
		p.showAccountNo();
		p=new PublicModifierAccessibleExample();
		abc();
		ProtectedVariableExample pr=new ProtectedVariableExample();
		pr.otp=9000;
		pr.showOTP();
		PackageLevelOrDefaultVariable pck=new PackageLevelOrDefaultVariable();
		pck.curBalance=900;
		pck.showCurrentBalance();
	}
	// ABC -> OnlinePurchase.com
	// Zomato / Swiggy - online food  delivery (Restaurant) // application
	// Customer Info - Contract 
	// SHAH5 
	public static void abc() {
		System.out.println(p.accountNo);
	}
	
}
