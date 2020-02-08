package main;

public class ex32 {

	public static void main(String[] args) {
		// afisarea minimului si a maximului dintr-un array de lungime predefinita
		int[] givenArray = new int[] {33, 16, 91, 8, 21, 64, 37, 6, 5, 77};


		int min = givenArray[0];  
		for (int i=0; i<givenArray.length; i++) {
			if (givenArray[i]<min)
				min=givenArray[i];
		}
		System.out.println("Min form array is : "+ min);

		int max = givenArray[0];  
		for (int j=0; j<givenArray.length; j++) {
			if (givenArray[j]>max)
				max=givenArray[j];
		}
		System.out.println("Max from array is: "+ max);

	}

}
