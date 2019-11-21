/*
 Create an application which generates 20 random numbers between 1 and 100 and writes them to a text file on separate lines. 
 Then the program should read the numbers from the file, calculate the average of the numbers, and display this to the screen.
*/

 /*
 Write a recursive method which takes an integer number and returns the sum of the numbers from 1 to that number.
 The method must solve the problem recursively. Then write an application which calls the method with a few different numbers and displays the return value of the method.
 */

 //https://stackoverflow.com/questions/13707223/how-to-write-an-array-to-a-file-java

 import java.util.*;
 import java.lang.*;
 import java.io.*;

 public class Lab9{
 	public static void main(String[] args) throws IOException{

 		int randArray[] = new int[20];
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
 		





 	}

 	private static int RandNum(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}



 }

