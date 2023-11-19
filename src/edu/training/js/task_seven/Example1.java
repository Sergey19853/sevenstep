package edu.training.js.task_seven;

public class Example1 {

	public static void main(String[] args) {
		
		double[] x = new double[5];

		ArrayMethods.initArrayWithRandom(x);
		ArrayMethods.printArray("Массив X:", x);
		
		newArray(x);

	}
	
	public static void newArray (double[] array) {
		
		double[] y = new double[array.length];
		
		for (int i = 0; i < y.length; i++) {
			y[i] = array[i] / i;
		}
		
		ArrayMethods.printArray("Массив Y:", y);
		
	}
	
}
