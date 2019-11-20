/*
 Create an application which generates 20 random numbers between 1 and 100 and writes them to a text file on separate lines. 
 Then the program should read the numbers from the file, calculate the average of the numbers, and display this to the screen.
*/

 /*
 Write a recursive method which takes an integer number and returns the sum of the numbers from 1 to that number.
 The method must solve the problem recursively. Then write an application which calls the method with a few different numbers and displays the return value of the method.
 */

 import java.util.Scanner;
 import java.lang.Math;
 import java.util.Random;

 public class Lab9{
 	public static void main(String[] args){

 		double randArray[] = new double[20];
 		

 		for(int i = 0; i < 20; i++){
 			double randomNum = (Math.random() * ((100- 1) + 1)) + 1;
 			randArray[i] = randomNum;
 			System.out.println(randArray[i]);

 			//for file reading and writing
 			//https://www.codejava.net/java-se/file-io/how-to-read-and-write-text-file-in-java
 		}
 	}
 }