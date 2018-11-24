import java.util.Scanner;

import fr.oc.TPJavaEE.bo.Personnage;
import fr.oc.TPJavaEE.util.CreationPersonnage;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Création du personnage du Joueur 1");
		System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
		
		Integer numPersonnage;
		
		numPersonnage = 1;
		Personnage personnage1 = CreationPersonnage.creation(numPersonnage);
		
		numPersonnage = 2;
		Personnage personnage2 = CreationPersonnage.creation(numPersonnage);
		
		Scanner sc = new Scanner(System.in);
		
		}
	}


