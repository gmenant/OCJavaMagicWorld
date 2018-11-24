package fr.oc.TPJavaEE.bo;

public class Mage extends Personnage{

	public Mage(int niveau, int force, int agilite, int intelligence, int numPersonnage) {
		super(niveau, force, agilite, intelligence, numPersonnage);
		// TODO Auto-generated constructor stub
	}
	
	//Attaque Basique - Boule de Feu : Effectue des dommages égaux à l’intelligence du joueur sur l’adversaire.
	public void attaqueBasique(){
		
	}
	
	//Attaque Spéciale - Soin : Le joueur soigne sa vie et regagne sa quantité d’intelligence fois 2 en points de vie.
	//Attention, il ne peut pas avoir plus de vie qu’il n’en avait au départ.
	public void attaqueSpeciale(){
	}

	@Override
	public String toString() {
		return String.format(
				"Abracadabra je suis le Mage joueur a definir "+super.toString());
	}
	
	
	

}
