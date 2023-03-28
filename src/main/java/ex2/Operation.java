package ex2;

/** Les opérations aurons lieu dans cette classe dédier */

public class Operation {

    /** Pour effectuer un dépot : */
    public static double ajouterMontant(double montant, double solde){
        solde += montant;
        return solde;
    }

    /** Pour effectuer un retrait : */
    public static String retraitMontant(double montant, double solde, int decouvert){
        if ((solde + decouvert) >= montant){
            solde -= montant;
            return String.valueOf(solde);
        } else {
            System.out.println(solde+decouvert);
            System.out.println(montant);
            return "Vous n'avez pas les moyens pour réalisé ce retrait";
        }
    }
}
