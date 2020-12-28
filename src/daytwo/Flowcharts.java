package daytwo;

public class Flowcharts {
	public static void flowchart_method(int a, int b, boolean bool) {
		if(bool=true) {
			int c = a + b;
			System.out.println(c);
		}else {
			int d = a * b;
			System.out.println(d);
		}
	}
	
	public static void flowchart_project(int a) {
		if(a>2000) {
			System.out.println("a");
			if(a>6000) {
				System.out.println("c");
			}else {
				System.out.println("b");
				if(a>4000) {
					System.out.println("d");
				}else {
					System.out.println("e");
				}
			}
		}if(a<2000) {
			System.out.println(1);
			if(a>100) {
				System.out.println(3);
				if(a>600) {
					System.out.println(5);
				}if(a<600) {
					System.out.println(4);
					if(a>500) {
						System.out.println(6);
					}else {
						System.out.println(7);
					}
				}
			}else {
				System.out.println(2);
			}
		}
	}
}
