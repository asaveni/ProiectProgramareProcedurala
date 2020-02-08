package main;

public class ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[] {8, 7, 9, 6, 2, 5, 3, 4};
		double[] doubleArray = new double[intArray.length];
		int[] intArray2 = new int[intArray.length];

		double nr = 2.5;

		for(int i=0; i<intArray.length; i++) {
			doubleArray[i] = intArray[i] + nr;
		}

		for(int i=0; i<intArray.length; i++) { 
			System.out.println(intArray[i]);
		}

		System.out.println();
		for(int i=0; i<doubleArray.length; i++) { 
			System.out.println(doubleArray[i]);
		}

		for(int i=0; i<intArray.length; i++) {
			intArray2[i] = intArray[i] + (int)nr;
		}

		System.out.println();
		for(int i=0; i<intArray2.length; i++) { 
			System.out.println(intArray2[i]);
		}

	}

}
