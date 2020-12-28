package daytwo;

public class UniqueSum {
	public static void uniquesum_method(int a, int b, int c) {
		if((a!=b) & (a!=c) & (b!=c)) {
			System.out.println(a+b+c);	
		}
		if((a!=b) & (a!=c) & (b==c)) {
			System.out.println(a+b);	
		}
		if((a!=b) & (b!=c) & (a==b)) {
			System.out.println(b+c);
		}
		if((a!=b) & (b!=c) & (a==c)) {
			System.out.println(b+c);
		}
		if((a==b) & (b==c)) {
			System.out.println(a);
		}
	}
}
