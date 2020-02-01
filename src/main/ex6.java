package main;

public class ex6 {

	public static void main(String[] args) {
		int a=2, b=4, c=6, minim;
		minim = a;
		if (b < minim) 
			minim = b;
		if (c < minim)
			minim = c;
		System.out.println(minim);

	}

} //afiseaza minimul dintre 3 numere
