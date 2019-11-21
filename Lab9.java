/*
 Create an application which generates 20 random numbers between 1 and 100 and writes them to a text file on separate lines. 
 Then the program should read the numbers from the file, calculate the average of the numbers, and display this to the screen.
 DONE
*/

 /*
 Write a recursive method which takes an integer number and returns the sum of the numbers from 1 to that number.
 The method must solve the problem recursively. Then write an application which calls the method with a few different numbers and displays the return value of the method.
 */


 import java.util.*;
 import java.lang.*;
 import java.io.*;

 public class Lab9{
 	public static void main(String[] args) throws IOException{

 		Scanner scan = new Scanner(System.in);
 		int userInt;
 		int randArray[] = new int[20];
 		int sum = 0;
 		BufferedWriter fWriter = null;
 		fWriter = new BufferedWriter(new FileWriter("randNum.txt"));

 		for(int i = 0; i < 20; i++){
 			randArray[i] = RandNum(1,100);
 			System.out.println(randArray[i]);
 			fWriter.write(Integer.toString(randArray[i]));
 			fWriter.newLine();
 		}
 		fWriter.flush();
 		fWriter.close();
 		//Random randomNum = new Random();
 		BufferedReader fReader = null;
 		fReader = new BufferedReader(new FileReader("randNum.txt"));

 		String line = fReader.readLine();
 		while(line != null){

 			//System.out.println(line);
 			sum += Integer.parseInt(line);
 			line = fReader.readLine();

 		}
 		System.out.println("Average = " + sum/20);
 		fReader.close();

 		System.out.println("Enter an integer: ");
 		userInt = scan.nextInt();
 		System.out.println("Sum of integer with all previous numbers: " + sumOfAllBefore(userInt));



 	}

 	private static int RandNum(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	private static int sumOfAllBefore(int n){
       int output;
       if(n==1){
         return 1;
       }
       //Recursion: Function calling itself!!
       output = sumOfAllBefore(n-1)+ n;
       return output;
   }
}





