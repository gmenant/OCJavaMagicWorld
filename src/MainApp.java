import java.util.Scanner;

import fr.oc.TPJavaEE.bo.Personnage;
import fr.oc.TPJavaEE.impl.PersonnageFactory;
import fr.oc.TPJavaEE.util.ControleValeurs;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Création du personnage du Joueur 1");
		System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
		
		Scanner sc = new Scanner(System.in);
		
		Integer choixClassePersonnage= sc.nextInt();
		
		while(choixClassePersonnage == null || choixClassePersonnage > 3 || choixClassePersonnage < 0){
			System.out.println("La valeure que vous avez saisi n'est pas conforme");
			choixClassePersonnage = sc.nextInt();
		}
		
		System.out.println("Niveau du personnage ?");
		Integer niveau= sc.nextInt();
		while(ControleValeurs.verif1A3(niveau))
		
		System.out.println("Force du personnage ?");
		Integer force= sc.nextInt();
		while(ControleValeurs.verif0A100(force));
		
		System.out.println("Agilité du personnage ?");
		Integer agilite= sc.nextInt();
		while(ControleValeurs.verif0A100(agilite));
		
		System.out.println("Intelligence du personnage ?");
		Integer intelligence= sc.nextInt();
		while(ControleValeurs.verif0A100(intelligence));
			
		
		Personnage personnage1 = PersonnageFactory.setPersonnage(choixClassePersonnage, niveau, force, agilite, intelligence);
				
	}
	}


