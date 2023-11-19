package edu.training.js.task_seven;

import java.util.Random;

public class ArrayMethods {

	public static void initArrayWithRandom(double[] array) {
		
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextDouble(100);
		}
		
	}
	
	public static void printArray(String message, double[] array) {
		
		System.out.println("--------------" + message + "--------------");
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%.2f]", array[i]);
		}
		
		System.out.println();
		
	}
	
}
