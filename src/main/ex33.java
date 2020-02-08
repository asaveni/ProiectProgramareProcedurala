package main;

public class ex33 {

	public static void main(String[] args) {
		// afisati pozitia valorii negative din array
		int[] array = new int[] {9,5,-8,3,7,4,};
		for(int i = 0; i < array.length; i++) {
			if(array[i]<0)
				System.out.print("Valoarea negativa se afla pe pozitia "+(i+1)+" in array.");
		}
		
	}

}
