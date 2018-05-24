import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
	
		//Instanciation des instances
		Territoire maPlaine = new Territoire ("savane", 60000);
		Oiseau monPigeon = new Oiseau ("PiouPiou", "pigeon", 2, "douillet");
		Chien monToutou  = new Chien ("Pimprenelle", "caniche",10, "memere");
		Loup monLoup = new Loup ("Wolfie", "loup blanc", 9, "dents longues");
		Felin monChat = new Felin ("Miou", "siamois", 6);
		
		//Utilisation de la méthode présentation
		System.out.println(monPigeon.presentation());
		
		//Utilisation de la méthode description
		System.out.println(maPlaine.description());
		
		//Oiseau avec Territoire et nid !
		monPigeon.setTerritoire(maPlaine);
		System.out.println(monPigeon.presentation());
		
		//Oiseau avec méthode voler
		System.out.println(monPigeon.voler());
		
		//Chien avec présentation (Override Canidé) + rassembler la meute + rassembler la meute spécifique
		System.out.println(monToutou.rassemblerMeute());
		
		//Loup avec présentation (Override Canidé) + rassembler la meute spécifique
		System.out.println(monLoup.rassemblerMeute());
		
		//Créer une liste à partir classe animal
		List<Animal> list1 = new ArrayList<Animal>();
		//Ajouter dans la liste toutes les classes filles
		list1.add(monPigeon);
		list1.add(monToutou);
		list1.add(monLoup);
		//Lire la liste (+présentation) avec for each
		for (Animal a : list1) 
			System.out.println(a.presentation());
		
		//Afficher uniqutement la liste des Canidés avec leur méthode spécifique
		List<Canide> list2 = new ArrayList <Canide>();
		list2.add(monToutou);
		list2.add(monLoup);
		for (Canide c : list2)
			System.out.println(c.rassemblerMeute());
	
		//Utiliser la méthode chasser de l'interface carnivore
		List<Carnivore> list3 = new ArrayList <Carnivore>();
		list3.add(monLoup);
		list3.add(monChat);
		for (Carnivore c : list3) {
			System.out.println(c.chasser());
		}
		
		//Appel à la classe Exercices Collections
		ExercicesCollections.start();
		
		//Appel à la classe Exercices Exceptions
		ExercicesExceptions.start();
		
		//Essayer d'instancier un CanideException avec un age négatif
		CanideException loulou = null;
		try {
			loulou = new CanideException ("loulou", "toutou", -3, "petits poils");
		} catch (AgeNegatifException e) {
			System.out.println(e.getMessage());
		}
		//Ou essayer de changer son age avec un age negatif
		try {
			loulou = new CanideException ("loulou", "toutou", 3, "petits poils");
			loulou.setAge(-5);
		} catch (AgeNegatifException e) {
			System.out.println(e.getMessage());
		}
	
		ExercicesExceptions.start2();
	}
}
