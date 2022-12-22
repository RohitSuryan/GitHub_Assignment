package assignment;

public class Problem3 {
	public static void main (String[] args) {

		String [] VIBGYOR = {"Violet","Indigo","Blue","Green","Yellow","Orange","Red"};

		try {
			System.out.println("Access element at position 8:" + VIBGYOR[8]);
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Exception thrown :" + e);

		}finally {
			System.out.println("The element at 5 position is " + VIBGYOR[4]);
			System.out.println("The finally Statement  is executed");
		}


		//		for(int i = 0 ; i < 9; i++) {
		//			
		//			try {
		//				System.out.println(VIBGYOR[i]);
		//			} catch (Exception e) {
		//				System.out.println("Please don't try to access "  + " index");
		//			}finally {
		//				System.out.println("Loop has been finished");
		//			}
		//			



	}
}
