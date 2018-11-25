package fr.oc.TPJavaEE.bo;

public class Mage extends Personnage{

	public Mage(int niveau, int force, int agilite, int intelligence, int numPersonnage) {
		super(niveau, force, agilite, intelligence, numPersonnage);
		// TODO Auto-generated constructor stub
	}
	
	//Attaque Basique - Boule de Feu : Effectue des dommages égaux à l’intelligence du joueur sur l’adversaire.
	public String attaqueBasique(){
		String attaque = "Joueur "+this.getNumPersonnage()+" utilise Boule de Feu et inflige "+getIntelligence()+" dommages";
		
		return attaque;
		
	}
	
	//Attaque Spéciale - Soin : Le joueur soigne sa vie et regagne sa quantité d’intelligence fois 2 en points de vie.
	//Attention, il ne peut pas avoir plus de vie qu’il n’en avait au départ.
	public String attaqueSpeciale(){
		int gain = getIntelligence()*2;
		String attaque = "Joueur "+this.getNumPersonnage()+" utilise Soin et gagne "+gain+"";
		this.setVie(gain);
		//TODO
		
		return attaque;
	}

	@Override
	public String toString() {
		return String.format(
				"Abracadabra je suis le Mage joueur a definir "+super.toString());
	}
	
	
	

}
