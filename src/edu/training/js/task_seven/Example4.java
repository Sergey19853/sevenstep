package edu.training.js.task_seven;

public class Example4 {

	
		
	    public static void main(String[] args) {

	        int[] m = new int[15];

	        createFibonacciArray(m);

	        printArray("Массив: ",m);	      

	    }

	    public static int[] createFibonacciArray(int[] array) {
	    	
	        for (int i = 0; i < array.length; i++) {
	            if (i < 2) {
	            	array[i] = 1;
	            } else {
	            	array[i] = array[i - 1] + array[i - 2];
	            }
	        }
	        
	        return array;
	        
	    }
	    
		public static void printArray(String message, int[] array) {
			
			System.out.println("--------------" + message + "--------------");
			
			for (int i = 0; i < array.length; i++) {
				System.out.print("[" + array[i] + "]");
			}
			
			System.out.println();
			
		}

}
