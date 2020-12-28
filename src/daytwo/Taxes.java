package daytwo;

public class Taxes {
	public static void salary_tax(int salary) {
		if(salary<=14999) {
			int tax_percent = 0;
			System.out.println(tax_percent);
		}
		if(salary>=15000 & salary<=19999) {
			int tax_percent = 10;
			System.out.println(tax_percent);
		}
		if(salary>=20000 & salary<=29999) {
			int tax_percent = 15;
			System.out.println(tax_percent);
		}
		if(salary>=30000 & salary<=44999) {
			int tax_percent = 20;
			System.out.println(tax_percent);
		}
		if(salary>=45000) {
			int tax_percent = 25;
			System.out.println(tax_percent);
		}
	}
	
	public static void amount_taxed(double salary) {
		if(salary<=14999) {
			double taxamount = 0;
			System.out.println(taxamount);
		}
		if(salary>=15000 & salary<=19999) {
			double taxamount = salary*0.1;
			System.out.println(taxamount);
		}
		if(salary>=20000 & salary<=29999) {
			double taxamount = salary*0.15;
			System.out.println(taxamount);
		}
		if (salary>=30000 & salary<=44999) {
			double taxamount = salary*0.2;
			System.out.println(taxamount);
		}
		if(salary>=45000) {
			double taxamount = salary*0.25;
			System.out.println(taxamount);
		}
	}
	
}
