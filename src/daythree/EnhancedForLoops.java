package daythree;

public class EnhancedForLoops {
	public static void stringarray() {
		String[] strarr = { "hello", "goodbye", "a", "b", "cde" };
		for (String str : strarr) {
			System.out.println(str);
		}
	}

	public static void intarray() {
		int[] intarr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int k : intarr) {
			System.out.println(k);
		}
		for (int j : intarr) {
			System.out.println(j * j);
		}
	}

	public static void intbool(int a) {
		if (a % 2 == 0) {
			boolean bool = true;
			System.out.println(bool);
		}
		if (a % 2 == 1) {
			boolean bool2 = false;
			System.out.println(bool2);

		}
	}public static void part3() {
		int[] intarr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for(int n : intarr2) {
			if(n%2==0) {
				int m = n*n*n;
				System.out.println(m);
			}if(n%2==1) {
				int l = n*n;
				System.out.println(l);
			}
			
		}
	}
}
