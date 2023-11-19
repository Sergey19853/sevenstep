package edu.training.js.task_seven;

public class Example6 {

	public static void main(String[] args) {
		
		int n = 5;
		
		double[] x = new double[n];
		double[] y = new double[n];
				
		ArrayMethods.initArrayWithRandom(x);
		ArrayMethods.initArrayWithRandom(y);
		
		ArrayMethods.printArray("Массив X:", x);
		ArrayMethods.printArray("Массив Y:", y);
		
		System.out.println();
		
		calc(x, y);
		
	}	
	
	public static void calc(double[] x, double[] y) {
		
		int count = 0;
		double sum = 0;
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] > y[i] && x[i] > 0 ) {
				sum += x[i];
				count++;
			}
		}
		
		printResult(count, sum);
		
	}
	
    public static void printResult(int count, double sum) {
    	
        System.out.println("Количество элементов = " + count);
    	System.out.printf("Сумма элементов = " + "%.2f",sum);
    	
    }


}
