package edu.training.js.task_seven;

public class Example2 {

	public static void main(String[] args) {
		
		int n = 5;

		double[] c = new double[n];
		double[] b = new double[n];

		ArrayMethods.initArrayWithRandom(c);
		ArrayMethods.initArrayWithRandom(b);

		ArrayMethods.printArray("Массив C:", c);
		ArrayMethods.printArray("Массив B:", b);
		
		System.out.println();

		double result = calc(c, b);
		
		System.out.println("R = " + result);
		
	}

	public static double calc(double[] c, double[] b) {
		double tmp = 0;

		for (int i = 0; i < c.length; i++) {
			tmp = tmp + Math.pow((c[i] - b[i]), 2);
		}

		double r = Math.sqrt(tmp);

		return r;
	}


}
