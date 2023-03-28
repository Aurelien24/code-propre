package ex2;

/** Le compteCourant possède un découvert que n'as pas le LivretA. La variabel decouvert permet de s'assurer de ne pas laisser
 * le client dépassé son découvert autorisé. */
public class CompteCourants extends CompteBancaire{
    private double decouvert;

    public CompteCourants(double solde, int decouvert) {

        super(solde);
        this.decouvert = decouvert;
    }

    /** Permet de connaitre votre découvert autorisé */
    public double getDecouvert() {
        return decouvert;
    }

    /** Permet de modifier le découvert autorisé */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    /** Permet de renvoyé les informations du compte. Il y as cependant besoin d'indiquer le solde */
    @Override
    public String toString(double solde) {
        return "CompteCourants{" +
                "decouvert = " + decouvert +
                "solde = " + solde +
                '}';
    }
}
