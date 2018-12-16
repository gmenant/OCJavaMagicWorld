import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.oc.tpjavaobject.bo.Personnage;
import fr.oc.tpjavaobject.impl.PersonnageFactory;
import fr.oc.tpjavaobject.util.ControleValeurs;

public class MainApp {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Liste de joueurs
		List<Personnage> joueurs = new ArrayList<>();
		
		//Boucle pour créer plusieurs joueurs
		for (int numPersonnage = 1; numPersonnage < 3; numPersonnage++) {
			
			Boolean test = true;
			Integer niveau = 0;
			Integer force= 0;
			Integer agilite = 0;
			Integer intelligence = 0;
			Integer choixClassePersonnage = 0;
			
			do{
				System.out.println("Création du personnage du Joueur "+numPersonnage);
				System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
				choixClassePersonnage = sc.nextInt();
				
				//Choix ClassePersonnage		
				while(choixClassePersonnage == null || choixClassePersonnage > 3 || choixClassePersonnage < 0){
					System.out.println("La valeure que vous avez saisi n'est pas conforme");
					choixClassePersonnage = sc.nextInt();
				}
				
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
		joueurs.add(personnage);
		
		}
		//Debut déroulement du jeu
		Personnage joueurActif;
		Personnage joueurPassif;
		
		//Des numeros pour parcourir le tableau
		int numeJActif = 0;
		int numJPassif = 1;
		int temp = 0;
		String typeAttaque = null;
		
		do{
			joueurActif= joueurs.get(numeJActif);
			joueurPassif= joueurs.get(numJPassif);
			int numeJActifAffichage = numeJActif+1;
			
			System.out.println("\nJoueur "+numeJActifAffichage +" ("+joueurActif.getVie()+") veuillez choisir votre action(1 : Attaque Basique, 2 : Attaque Spéciale)");
			
			int attaque = sc.nextInt();	
			
			if(attaque == 1){
				typeAttaque = joueurActif.attaqueBasique(joueurPassif);
				
			}
			if(attaque == 2){
				typeAttaque = joueurActif.attaqueSpeciale(joueurPassif);
			}
			
		
			System.out.println(typeAttaque);
			
			temp = numeJActif;
			numeJActif = numJPassif ;
			numJPassif = temp;
			
		}
		while(joueurPassif.getVie()>0);
		
		System.out.println(joueurPassif+" a perdu !");
	
		
	}
}


