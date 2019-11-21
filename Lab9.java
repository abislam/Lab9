/*
 Create an application which generates 20 random numbers between 1 and 100 and writes them to a text file on separate lines. 
 Then the program should read the numbers from the file, calculate the average of the numbers, and display this to the screen.
*/

 /*
 Write a recursive method which takes an integer number and returns the sum of the numbers from 1 to that number.
 The method must solve the problem recursively. Then write an application which calls the method with a few different numbers and displays the return value of the method.
 */

 import java.util.*;
 import java.lang.*;
 import java.io.*;

 public class Lab9{
 	public static void main(String[] args){

 		//Random randomNum = new Random();
 		int randArray[] = new int[20];
 		randArray[i] = RandNum(1,100);
 		System.out.println(randArray[i]);
 		
 		

 	}

 	private static int RandNum(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

 }

