package main;

public class ex31 {

	public static void main(String[] args) {
		// scrieti un program care stocheaza intr-un vector 3 variabile de tip double declarate de voi si le afiseaza parcurgand vectorul
		double[] vectorDouble = new double[3];

		vectorDouble[0]= 4.39;
		vectorDouble[1]= 8.74;
		vectorDouble[2]= 242.15;

		for(int i=0; i<vectorDouble.length; i++) {
			System.out.println("Element on index " + i + " is: " + vectorDouble[i]);
		}// TODO Auto-generated method stub

	}

}
