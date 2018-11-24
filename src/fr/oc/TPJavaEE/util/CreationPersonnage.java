package fr.oc.TPJavaEE.util;

import java.util.Scanner;

import fr.oc.TPJavaEE.bo.Personnage;
import fr.oc.TPJavaEE.impl.PersonnageFactory;

public class CreationPersonnage {

	
	public static Personnage creation(Integer numPersonnage){
		
		Scanner sc = new Scanner(System.in);

		Integer choixClassePersonnage= sc.nextInt();

		//Choix ClassePersonnage		
		while(choixClassePersonnage == null || choixClassePersonnage > 3 || choixClassePersonnage < 0){
			System.out.println("La valeure que vous avez saisi n'est pas conforme");
			choixClassePersonnage = sc.nextInt();
		}
		
		Boolean test = true;
		Integer niveau = 0;
		Integer force= 0;
		Integer agilite = 0;
		Integer intelligence = 0;
		
		do{
			//Choix Niveau Personnage
			do{	System.out.println("Niveau du personnage ?");
			niveau= sc.nextInt();
			test = ControleValeurs.verif1A100(niveau);
			}while(!test);
			
			
			//Choix Force Personnage
			do{System.out.println("Force du personnage ?");
			force= sc.nextInt();
			test = ControleValeurs.verif0A100(force);
			}while(!test);
			
			//Choix Agilite Personnage
			do{System.out.println("Agilité du personnage ?");
			agilite= sc.nextInt();
			test = ControleValeurs.verif0A100(agilite); 
			}while(!test);
			
			//Choix Intelligence Personnage
			do{System.out.println("Intelligence du personnage ?");
			intelligence= sc.nextInt();
			test= ControleValeurs.verif0A100(intelligence);
			}while(!test);
			
			//Force Agilite Intelligence == Niveau
			test = ControleValeurs.verifStat(force, agilite, intelligence, niveau);
		}while(!test);
		
		//Generation du personnage
		Personnage personnage = PersonnageFactory.setPersonnage(choixClassePersonnage, niveau, force, agilite, intelligence, numPersonnage);
		System.out.println(personnage.toString());
		
		sc.close();
		
		return personnage;
	}
}
