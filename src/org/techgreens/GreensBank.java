package org.techgreens;

public class GreensBank implements IcIcBank{

	@Override
	public void deposite() {
		System.out.println("10%");
	}

	@Override
	public void savings() {
System.out.println("15%");		
	}

	@Override
	public void fixed() {
System.out.println("20%");		
	}

	public static void main(String[] args) {
		GreensBank od = new GreensBank();
		od.deposite();
		od.fixed();
		od.savings();
	}
}
