package main;

public class ex5 {

	public static void main(String[] args) {
		int i,fact =1;
		int n=13;
		for(i=1; i<n; i++) { // calcul factorial pentru primele 12 numere
			fact=fact * i;
			
		}
		System.out.println("n!=" + fact);
	}
}

