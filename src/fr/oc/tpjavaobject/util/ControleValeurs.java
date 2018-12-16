package fr.oc.tpjavaobject.util;

/**
 * Class util de vérification des valeures saisies
 * @author Gabriel
 *
 */
public abstract class ControleValeurs {
	
	
	/**
	 * Verfifie que la valeur est bien comprise entre 1 et 100
	 * @param valeur
	 * @return
	 */
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
	
	/**
	 * Verfifie que la valeur est bien comprise entre 0 et 100
	 * @param valeur
	 * @return
	 */
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
	
	/**
	 * 	 * Verfifie que la valeur est bien comprise entre 1 et 3

	 * @param valeur
	 * @return
	 */
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
	
	
	/**
	 * 	 * Verfifie que la somme des valeur est bien egale au niveau

	 * @param force
	 * @param agilite
	 * @param intelligence
	 * @param niveau
	 * @return
	 */
	
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
	

