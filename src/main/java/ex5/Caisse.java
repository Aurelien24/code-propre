package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

	private String nom;
	private List<Item> items;
	private int poidsMin;
	private int poidsMax;

	/** Constructeur
	 * @param nom
	 */
	public Caisse(String nom, int poidsMin, int poidsMax) {
		this.nom = nom;
		this.poidsMin = poidsMin;
		this.poidsMax = poidsMax;
		this.items = new ArrayList<>();
	}

	/** L'ajout de nouveau objets se fait selon leur volume réel afin de savoir si il y as ou non la place de fair entrer
	 * l'objet.
	 * @param item
	 * @return résultat
	 */
	public boolean addItem(Item item){
		if (item.getPoids() < poidsMin && item.getPoids() > poidsMax ){
			items.add(item);
			return true;
		} else {
			return false;
		}
	}

	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}


	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	public int getPoidsMin() {
		return poidsMin;
	}

	public void setPoidsMin(int poidsMin) {
		this.poidsMin = poidsMin;
	}

	public int getPoidsMax() {
		return poidsMax;
	}

	public void setPoidsMax(int poidsMax) {
		this.poidsMax = poidsMax;
	}
}
