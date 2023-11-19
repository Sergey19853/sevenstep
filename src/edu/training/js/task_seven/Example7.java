package edu.training.js.task_seven;

import java.util.Arrays;

public class Example7 {

    public static void main(String[] args) {
		
		double[] x = new double[10];
		
		ArrayMethods.initArrayWithRandom(x);		
		ArrayMethods.printArray("Массив X:", x);

        createArrayY(x);
        
    }

    public static void createArrayY(double[] x) {
    	
    	double[] y = new double[x.length];
    	
        for (int i = 0; i < x.length; i++) {
           y[i] = x[i];
        }
        
        sortArray(y);
        
    }

    public static void sortArray(double[] y) {
 
        Arrays.sort(y);

        for (int i = 0; i < y.length / 2; i++) {
        	double temp = y[i];
            y[i] = y[y.length - 1 - i];
            y[y.length - 1 - i] = temp;
        }
        
        ArrayMethods.printArray("Массив Y:", y);
    }

}
