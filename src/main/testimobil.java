package main;

public class testimobil {

	public static void main(String[] args) {
		imobil imobil1= new imobil("Garsoniera",7,40000);
		imobil imobil2=new imobil("rulota",4,80000);
		imobil imobil3= new imobil("cocioaba",3,110000);
		
		System.out.println("TipImobil: "+imobil1.getTipCasa()+"\nNrEtaje: "+imobil1.getNrEtaje()+"\nPret: "+imobil1.getPret());
		System.out.println();
		System.out.println("TipImobil: "+imobil2.getTipCasa()+"\nNrEtaje: "+imobil2.getNrEtaje()+"\nPret: "+imobil2.getPret());
		System.out.println();
		System.out.println("TipImobil: "+imobil3.getTipCasa()+"\nNrEtaje: "+imobil3.getNrEtaje()+"\nPret: "+imobil3.getPret());	
		

	}

}