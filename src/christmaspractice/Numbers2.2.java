package christmaspractice;

public class Numbers2 {
	public static int SumDig(int n) {
		int val = 0;
		while (n >= 10 && n <= 99) {
			n = n - 10;
			val++;
		}
		while (n >= 1 && n <= 9) {
			n = n - 1;
			val++;
		}
		return val;
	}

	public static void Num2word(int n) {
		String wordreturned = " ";
		String tensreturned = " ";
		String unitsreturned = " ";

		int val = 0;
		int val2 = 0;

		String[] array1 = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		String[] array2 = { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
				"nineteen" };

		String[] array3 = { "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		if (n < 10) {
			wordreturned = array1[n - 1];
			System.out.println(wordreturned);
		} 
		else if (n > 10 && n < 20) {
			wordreturned = array2[n - 11];
			System.out.println(wordreturned);
		} 
		else if (n % 10 == 0) {
			wordreturned = array3[n / 10 - 1];
			System.out.println(wordreturned);
		} 
		else if (n <= 99) {
			while (n >= 10 && n <= 99) {
				n = n - 10;
				val++;
				tensreturned = array3[val - 1];
			}
			while (n >= 1 && n <= 9) {
				n = n - 1;
				val2++;
				unitsreturned = array1[val2 - 1];
			}
			wordreturned = tensreturned + " " + unitsreturned;
			System.out.println(wordreturned);
		
			
		}
	}
}
