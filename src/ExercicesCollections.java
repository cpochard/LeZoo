import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ExercicesCollections {
	// Simuli de "main"
	public static void start() {

		// Utiliser une ArrayList..
		List<Integer> listArray = new ArrayList<Integer>();
		listArray.add(20);
		listArray.add(13);
		// ..et la parcourir avec for each
		for (int i : listArray) {
			System.out.println(i);
		}
		// ..ou avec for classique
		for (int i = 0; i <= listArray.size() - 1; i++) {
			System.out.println(listArray.get(i));
		}
		// ..ou avec un itérateur
		Iterator<Integer> it = listArray.iterator();
		while (it.hasNext())
			System.out.println(it.next());

		// Créer une TreeSet
		Set<String> listTreeSet = new TreeSet<String>();
		listTreeSet.add("coucou");
		listTreeSet.add("bonjour");
		listTreeSet.add("coucou");
		listTreeSet.add("hello");
		listTreeSet.add("salut");
		listTreeSet.add("hi");
		for (String s : listTreeSet) {
			System.out.println(s);
		}

		// Créer une HashMap
		HashMap<String, Canide> listHash = new HashMap<String, Canide>();
		Chien monChien = new Chien("Medor", "labrador", 4, "nonos");
		Loup monLoup = new Loup("Karl", "loup géant", 5, "neige blanche");
		listHash.put("niche", monChien);
		// on pourrait aussi faire listHash.put ("niche", new Chien ("Medor",
		// "labrador", 4, "nonos"));
		listHash.put("forêt sombre", monLoup);
		for (Map.Entry<String, Canide> paire : listHash.entrySet()) {
			System.out.println("Dans l'enclos " + paire.getKey() + " se trouve " + paire.getValue().presentation());
		}
		
	parcoursEnclos(listHash);
	
	List<String> listArray2 = new ArrayList<String> ();
	listArray2.add("chat");
	listArray2.add("bichon");
	miseEnMajuscules(listArray2);
	
	List<String> listLiee = new LinkedList<String>();
	listLiee.add("chat");
	listLiee.add("bichon");
	miseEnMajuscules(listLiee);
	
	List<Chien> maListeChien = new ArrayList<Chien>();
	Chien chien1 = new Chien("kiki", "loulou", 3, "fifi");
	Chien chien2 = new Chien ("koko", "lolo", 4, "fafa");
	maListeChien.add(chien1);
	maListeChien.add(chien2);
	collectionGenerique(maListeChien);

	}

	public static void parcoursEnclos(HashMap<String, Canide> listCanide) {
		for (Map.Entry<String, Canide> paire : listCanide.entrySet()) {
			System.out.println("Dans l'enclos " + paire.getKey() + " se trouve " + paire.getValue().presentation());
		}
	}
	
	public static void miseEnMajuscules (List<String> listMaj) {
		for (String s : listMaj) {
			System.out.println(s.toUpperCase());
		}	
	}
	
	//Utiliser généricité pour appeller cette méthode avec n'importe quel Animal qui en découle (polymorphisme)
	public static void collectionGenerique (List<?extends Animal> listGenerique) {
		for (Animal a : listGenerique) {
			System.out.println(a.presentation());
		}
		//On pourrait aussi utiliser la méthode iterateur comme suit :
		// Iterator<?extends Animal> it = listGenerique.iterator();
		// while (it.hasNext()){
		// it.next().presentation();
		// }
	}

}