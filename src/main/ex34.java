package main;

public class ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scrieti o clasa ce transforma un String intr-un  array de caractere
		String cuvant = "Particip la acest curs de Java";
		int len = cuvant.length();
		char[] charArray = new char[len];
		for(int i = 0; i < len; i++) {
			charArray[i]=cuvant.charAt(i);
			System.out.println("charArray["+i+"]= "+charArray[i]);
		}	

	}

}
