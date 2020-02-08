package main;

public class ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//uppercase odd letters
					String cuvant = "acesta este un curs de java ";
			for(int i = 0; i < cuvant.length(); i++) {
				if(i%2==1) 
					cuvant = cuvant.substring(0,i) + cuvant.substring(i,i+1).toUpperCase() + cuvant.substring(i+1,cuvant.length());
				else 
					cuvant = cuvant.substring(0,i) + cuvant.substring(i,i+1).toLowerCase() + cuvant.substring(i+1,cuvant.length());
			}
			System.out.println(cuvant);
		}
	}


