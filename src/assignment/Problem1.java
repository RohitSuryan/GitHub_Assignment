package assignment;

import java.util.HashMap;
import java.util.Scanner;

public class Problem1 {


	public static void main(String[] args) {

		double f,c;

		HashMap<Double, Double> map = new HashMap<>();
		try (Scanner scn = new Scanner(System.in)) {
			int i = 0;
			while(i<5) {
				
				System.out.println("Enter  Fahrenheit temperature");
				f = scn.nextDouble(); 
				c = celsius(f);
				map.put(f, c);
				i++;
				
			}
		}
		
		System.out.println("The value of Fahrenheit to Celsius are ");
		System.out.println(map);
				  	  	     
	} 
	
	
	static double celsius(double f)
	{	
		return  (f-32)*5/9;
	}
	
}
