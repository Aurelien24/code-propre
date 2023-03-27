package ex2;

/** Le compte bancaire n'as pas a avoir de taux de rénumération, il seras donc crée et utilisé uniquement dans LivretA */
public class LivretA extends CompteBancaire {

	/** Permet d'avoir le taux de rémunération */
	private double tauxRemuneration;

	/** L'objet Livret A demande
	 * @param solde
	 */
	public LivretA(double solde) {

		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	/** La rénumération annuel d'un Livret A se calcule ici */
	public double appliquerRemuAnnuelle(double solde){

		solde = solde + solde*tauxRemuneration/100;
		return solde;
	}

	/** Permet de récupérer le taux de rémunération d'un livret A */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Permet de maudifier le taux de rémunération */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	/** Le to String demande le solde actuel du compte pour en donnée toute les informations. */
	@Override
	public String toString(double solde) {
		return "LivretA{" +
				"tauxRemuneration=" + tauxRemuneration +
				"solde= " + solde +
				'}';
	}
}
