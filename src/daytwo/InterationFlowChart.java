package daytwo;

public class InterationFlowChart {
	public static void flowchart() {
		for(int a=100;a>200;a++) {
			System.out.println(a);
		}
	}
//	public static void flowchart2() {
//		int a = 100;
//		while(a<=200) {
//			for(;a%2==0;a++) {
//				System.out.println("-");
//			}for(;a%2==1;a++) {
//				System.out.println("*");
//		}
//		}
//	}
	public static void flowchart2() {
		for(int a=100;a<=200;a++) {
			if(a%2==0) {
				System.out.println("-");
			}else {
				System.out.println("*");
				}
				
		}
	}
	
	public static void method3() {
		int a=1;
		int b=0;
		while(b!=10) {
			if(a!=10) {
				System.out.println(a);
			}else {
				System.out.println(a);
				a=0;
				b++;
			}
			a++;
	
		}
	
		}
	public static void question5() {
		int a = 1;
		int b = 0;
		do {
			System.out.println(a);
			b++;
			if(b==a) {
				a++;
				b = 0;
			}
		
		}while(a<=10);
	}
	
	
	
}
