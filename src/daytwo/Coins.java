package daytwo;

public class Coins {
	public static void coinChange(double cost, double amount_given) {
		
		int n10 = 0;
		int n5 = 0;
		int n2 = 0;
		int n1 = 0;
		int c50 = 0;
		int c20 = 0;
		int c10 = 0;
		int c5 = 0;
		int c2 = 0;
		int c1 = 0;
		
		double change = amount_given - cost;
		System.out.println("Change Expected is " + change);
		
		while(change>=10) {
			change -= 10; // change = change - 10
			n10++;
		}
		System.out.println(n10 + " : £10 note");
		
		while(change>=5) {
			change -= 5;
			n5++;
		}
		System.out.println(n5 + " : £5 note");
		
		while(change>=2) {
			change -= 2;
			n2++;
		}
		System.out.println(n2 + " : £2 coin");
		
		while(change>=1) {
			change -= 1;
			n1++;
		}
		System.out.println(n1 + " : £1 coin");
		
		while(change>=0.5) {
			change -= 0.5;
			c50++;
		}System.out.println(c50 + ": 50 p's");
		while(change<=0.2) {
			change -= 0.2;
			c20++;
		}
		System.out.println(c20 + ": 20 p's");
		
		while(change>=0.1) {
			change -= 0.1;
			c10++;
		}
		System.out.println(c10 + ": 10 p's");
		
		while(change>=0.049) {
			change -= 0.05;
			c5++;
		}
		System.out.println(c5 + ": 5 p's");
		
		while(change>=0.019) {
			change -= 0.02;
			c2++;
		}
		System.out.println(c2 + ": 2 p's");
		
		while(change>=0.0099) {
			change -= 0.01;
			c1++;
		}
		System.out.println(c1 + ": 1 p's");
	}
	
}
