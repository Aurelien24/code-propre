package ex2;

/** Les opérations aurons lieu dans cette classe dédier */

public class Operation{

    /** Pour effectuer un dépot : */
    public double ajouterMontant(double montant, double solde){
        solde += montant;
        return solde;
    }

    /** Pour effectuer un retrait : */
    public String retraitMontant(double montant, double solde, double decouvert){
        if (solde + decouvert > montant){
            solde -= montant;
            return String.valueOf(solde);
        } else {
            return "Vous n'avez pas les moyens pour réalisé ce retrait";
        }
    }
}
