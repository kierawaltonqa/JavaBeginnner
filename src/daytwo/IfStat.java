package daytwo;

public class IfStat {
	
public static void temp(int temp) {
		
		if(temp>24) {
			System.out.println("hot");
			if(temp>30) {
				System.out.println("super hot");
			}
			
		}else {
			System.out.println("cold");
		}
	}

	public static void andOr(int num1, int num2) {
		if(num1>50 & num2>100) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

	public static void switchcase(int month) {
	
		switch(month) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}
