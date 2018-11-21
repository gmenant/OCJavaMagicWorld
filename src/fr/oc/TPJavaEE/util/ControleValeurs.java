package fr.oc.TPJavaEE.util;

public class ControleValeurs {
	
	public static Boolean verif1A100(Integer valeur){
		Boolean test = true;
		
			if(valeur == null ){
				System.out.println("La valeur saisie est null");
				test = false;
			}		
			if(valeur <1){
				System.out.println("La valeur saisie inférieure à 1");
				test = false;
			}
			if(valeur >100){
				System.out.println("La valeur saisie supérieur à 100");
				test = false;
			}
		return test;
		}
	
	public static Boolean verif0A100(Integer valeur){
		Boolean test = true;
		
			if(valeur == null ){
				System.out.println("La valeur saisie est null");
				test = false;
			}		
			if(valeur <0){
				System.out.println("La valeur saisie inférieure à 0");
				test = false;
			}
			if(valeur >100){
				System.out.println("La valeur saisie supérieur à 100");
				test = false;
			}
		return test;
		}
	
	public static Boolean verif1A3(Integer valeur){
		Boolean test = true;
		
			if(valeur == null ){
				System.out.println("La valeur saisie est null");
				test = false;
			}		
			if(valeur <1){
				System.out.println("La valeur saisie inférieure à 1");
				test = false;
			}
			if(valeur >3){
				System.out.println("La valeur saisie supérieur à 3");
				test = false;
			}
		return test;
		}
	}
	

