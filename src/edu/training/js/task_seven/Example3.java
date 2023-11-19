package edu.training.js.task_seven;

import java.util.Random;

public class Example3 {

	public static void main(String[] args) {
		
		int n = 5;
		
		double[] x = new double[n];
		double[] z = new double[n];
		
		ArrayMethods.initArrayWithRandom(x);
		ArrayMethods.initArrayWithRandom(z);
		
		ArrayMethods.printArray("Массив X:", x);
		ArrayMethods.printArray("Массив Z:", z);
				
		System.out.println();
		
		arrayY(x, z);
		
	}
		
	public static void arrayY(double[] x, double[] z) {
		
		double[] y = new double[x.length];
		
		Random random = new Random();
		
		double a = random.nextDouble(100);
		double b = random.nextDouble(100);
		double c = random.nextDouble(100);
		double d = random.nextDouble(100);
		
		for (int i = 0; i < x.length; i++) {
			y[i] = (a * x[i] + b) / (c * z[i] + d);
		}
		
		ArrayMethods.printArray("Массив Y:", y);
	}

}
