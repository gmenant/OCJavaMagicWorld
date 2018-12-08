package fr.oc.TPJavaEE.bo;

public class Rodeur extends Personnage{

	public Rodeur(int niveau, int force, int agilite, int intelligence, int numPersonnage) {
		super(niveau, force, agilite, intelligence, numPersonnage);
		// TODO Auto-generated constructor stub
	}
	
	//Attaque Basique - Tir à l’Arc : Effectue des dommages égaux à l’agilité du joueur sur l’adversaire.
	public String attaqueBasique(Personnage joueurPassif){

		Integer agilite = this.getAgilite();
		joueurPassif.setVie(joueurPassif.getVie()-agilite);
		
		String attaque = "Joueur "+this.getNumPersonnage();
		attaque =  attaque +"Tir à l’Arc et inflige "+agilite+" dommages\n";
		attaque =  attaque +"Joueur "+joueurPassif.getNumPersonnage()+ " perd "+agilite+" points de vie";
		
		return attaque;
		
	}
	
	//Attaque Spéciale - Concentration : Le joueur gagne son niveau divisé par 2 en agilité.
	public String attaqueSpeciale(Personnage joueurPassif){
		
		int gain = getNiveau()/2;
		this.setAgilite(gain);
		
		String attaque = "Joueur "+this.getNumPersonnage();
		attaque =  attaque +"Concentration et gagne "+gain+"";
		return attaque;
	}

	@Override
	public String toString() {
		return String.format(
				"Niarkniark je suis le Rodeur joueur a definir "+super.toString());
	}

	
	
}
