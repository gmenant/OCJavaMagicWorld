package fr.oc.TPJavaEE.bo;

public class Rodeur extends Personnage{

	public Rodeur(int niveau, int force, int agilite, int intelligence, int numPersonnage) {
		super(niveau, force, agilite, intelligence, numPersonnage);
		// TODO Auto-generated constructor stub
	}
	
	//Attaque Basique - Tir à l’Arc : Effectue des dommages égaux à l’agilité du joueur sur l’adversaire.
	public String attaqueBasique(){
		String attaque =  Tir à l’Arc et inflige "+getAgilite()+" dommages";
		
		return attaque;
		
	}
	
	//Attaque Spéciale - Concentration : Le joueur gagne son niveau divisé par 2 en agilité.

	public String attaqueSpeciale(){
		int gain = getNiveau()/2;
		String attaque =  Concentration et gagne "+gain+"";
		this.setAgilite(gain);
		
		return attaque;
	}

	@Override
	public String toString() {
		return String.format(
				"Niarkniark je suis le Rodeur joueur a definir "+super.toString());
	}

	
	
}
