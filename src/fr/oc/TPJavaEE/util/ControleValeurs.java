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
	
	public static Boolean verifStat(Integer force, Integer agilite,Integer intelligence,Integer niveau){
		Boolean test = true;
		int somme = force+ agilite+ intelligence ; 
		if(somme != niveau){
			System.out.println("La somme de la force, agilite et intelligence n'est pas égale à votre niveau");
			test = false;
		}
			
		return test;
		}
	}
	

