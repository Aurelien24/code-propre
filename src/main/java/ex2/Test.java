package ex2;

public class Test {
    public static void main(String[] args) {
        LivretA livretA = new LivretA(100.0, 5.0);

        System.out.println(livretA.getSolde());
        System.out.println(livretA.appliquerRemuAnnuelle(livretA.getSolde()));
        livretA.setSolde(livretA.appliquerRemuAnnuelle(livretA.getSolde()));
        System.out.println(livretA.toString(livretA.getSolde()));

        CompteCourants compteCourants = new CompteCourants(1000.0, 20);

        System.out.println(compteCourants.getSolde());
        System.out.println(compteCourants.toString(compteCourants.getSolde()));

        //Operation operation = new Operation();
        System.out.println(Operation.ajouterMontant(500.0, livretA.getSolde()));
        livretA.setSolde(Operation.ajouterMontant(500.0, livretA.getSolde()));
        System.out.println(Operation.retraitMontant(500.0, livretA.getSolde(), livretA.getDecouvert()));
    }
}
