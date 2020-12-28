package daytwo;

public class Blackjack {
	public static void blackjack_game(int a, int b) {
		if((a<=21) | (b<=21)) {
			if((21-a)>(21-b)) {
				System.out.println(b);
			}if((21-b)>(21-a)) {
				System.out.println(a);
			}
		}else {
			System.out.println(0);
		}
	}

}
