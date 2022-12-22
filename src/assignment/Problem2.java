package assignment;

public class Problem2 {

	public static void main(String[] args) {

		// Write a program of string manipulation for removing extra spaces from the string
		// “This   is    a   practice     question”


		String str = "This   is    a   practice     question   .";

		String str1 = str.replaceAll("\\s+"," ");
		System.out.println(str1);

	}


}
