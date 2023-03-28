package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets", 0, 5));
		caisses.add(new Caisse("Moyens objets", 5, 20));
		caisses.add(new Caisse("Grands objets", 20, 2147483647));
	}

	public void addItem(Item item) {

		//TODO Faites évoluer ce code (idée: c'est le caisse qui doit "savoir" si elle peut accepter un objet ou non)
		/** Je laisse un if pour savoir si il y as besoin de continuer la boucle.
		 * Il n'y as acctuellement que 3 Caisse mais, peut il y en avoir 10 ? 1000 ? 100 000?
		 */
		for (Caisse caisse : caisses){
			if (caisse.addItem(item)){
				break;
			}
		}
	}

	public int taille() {
		
		//TODO faites évoluer ce code.
		/** Le code s'adapte au nombre de caisses pour renvoyé le résultat total d'objet. */
		int taille = 0;
		for (int i = 0; i < caisses.size() ; i++){
			taille = taille + caisses.get(i).getItems().size();
		}
		return taille;
	}
}
