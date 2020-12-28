package daytwo;

public class Loop {
	
	public static void forloop(int i) {
		for(;i>0;i++) {
			// i++ = i+1, i-- = i-1
			System.out.println(i);
		}
	}
	
	public static void whileloop() {
		int count=2;
		System.out.println("---- while ----");
		while(count<2) {
			count++;
			System.out.println(count);
		}
	}
	
	
	public static void doWhileloop() {
		int a = 2;
		System.out.println("---- do while ----");
		do {
			a++;
			System.out.println(a);
		}while(a<3);
	}
}
