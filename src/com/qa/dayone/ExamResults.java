package com.qa.dayone;

public class ExamResults {

	public static int Result(int chemistry, int physics, int biology) {
		
		int total = chemistry + physics + biology;
		int percentage = total*100/450;
		return percentage;
		}
	
	public static void results(int chem, int phy, int bio) {
		int total = chem + phy + bio;
		int percentage = total*100/450;
		int totalchem = chem*100/150;
		int totalphy = phy*100/150;
		int totalbio = bio*100/150;
		
		if(percentage<60) {
			System.out.println("Sorry, you have failed");
		}
		if(totalchem<60) {
			System.out.println("you failed chemisty");
		}
		if(totalphy<60) {
			System.out.println("you failed physics");
		}
		if(totalbio<60) {
			System.out.println("you failed biology");
		}
		if((totalchem<60) | (totalphy<60) | (totalbio<60)) {
			int a1 = 0;
			int a2 = 0;
			int a3 = 0;
			if(totalchem<60) {
				a1 = 1;
			}if(totalphy<60) {
				a2 = 1;
			}if(totalbio<60) {
				a3 = 1;
			}System.out.println("you have failed " + (a1 + a2 + a3) + "exams");
		
		}
		else {
			System.out.println("Well done, you passed");
		}
	}
}
