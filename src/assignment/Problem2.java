package assignment;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		// Write a program of string manipulation for removing extra spaces from the string
		// “This   is    a   practice     question”

		Scanner scn = new Scanner(System.in);
		String str2 = scn.nextLine();
		String str3 = str2.replaceAll("\\s+", " ").trim();
		System.out.println(str3);
		
		String str = "This   is    a   practice     question   .";
		String str1 = str.replaceAll("\\s+"," ");
		System.out.println(str1);

	}


}
