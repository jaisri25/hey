package org.add;

public class GreensTech {
	
	private void greensOmr(int a) {
System.out.println("order is "+a);
	}
	
	private void greensOmr(String a,int b) {
System.out.println("type is "+a+"\n"+"number is "+b);
System.out.println("jaya");

	}
	public static void main(String[] args) {
		GreensTech g=new GreensTech();
		g.greensOmr(25);
		g.greensOmr("Software", 259);
	}

}
