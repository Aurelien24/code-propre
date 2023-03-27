package ex2;

/** Compte bancaire ne gère plus qu'une base de compte bancaire les opération courante sont dans opération,
 * Les compte courant sont a présent séparer dans CompteCourants
 * Les LivretA sont conservé */

public abstract class CompteBancaire {

	private double solde;

	public CompteBancaire(double solde) {
		this.solde = solde;
	}

	/** Permet d'obtenir le solde du compte */
	public double getSolde(String nomDuCompte) {
		return solde;
	}
	
	/** Permet de modifier le solde d'un compte */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	public abstract String toString(double solde);
}
