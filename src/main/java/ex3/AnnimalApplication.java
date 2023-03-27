package ex3;

public class AnnimalApplication {

	public static void main(String[] args) {
		Annimal annimal = new Annimal("Thoiry");
		
		annimal.addAnimal("Gazelle", "MAMMIFERE", "HERBIVORE");
		annimal.addAnimal("Zèbre", "MAMIFERE", "HERBIVORE");
		annimal.addAnimal("Lion", "MAMMIFERE", "HERBIVORE");
		annimal.addAnimal("Panthère", "MAMMIFERE", "CARNIVORE");
		annimal.addAnimal("Requin blanc", "POISSON", "HERBIVORE");
		annimal.addAnimal("Truite dorée", "POISSON", "HERBIVORE");
		annimal.addAnimal("Boa constrictor", "SERPENT", "CARNIVORE");
		annimal.addAnimal("Python", "SERPENT", "CARNIVORE");
	}

}
