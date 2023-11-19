package edu.training.js.task_seven;

public class Example5 {

	public static void main(String[] args) {
		
		int n = 5;
		
		double[] a = new double[n];
		double[] b = new double[n];
		
		ArrayMethods.initArrayWithRandom(a);
		ArrayMethods.initArrayWithRandom(b);
		
		ArrayMethods.printArray("Массив A:", a);
		ArrayMethods.printArray("Массив B:", b);
		
		arrayT(a, b);

	}
			
	public static void arrayT(double[] a, double[] b) {
		
		double[] t = new double[a.length];
		
        for (int i = 0; i < t.length; i++) {
            if (i < 2) {
                t[i] = a[i] / b[i];
            } else {
                t[i] = Math.pow(a[i] / b[i], 1.0 / i);
            }
        }
		
		ArrayMethods.printArray("Массив T:", t);
		
	}

}
