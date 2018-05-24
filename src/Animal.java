
public abstract class Animal {

	// Attributs
	protected String nom;
	protected String espece;
	protected int age;
	protected Territoire ter;

	// Constructeur (obligé de renseigner des Nom/espece/etc tmp pour temporaire)
	public Animal(String tmpNom, String tmpEspece, int tmpAge) {
		nom = tmpNom;
		espece = tmpEspece;
		age = tmpAge;
	}
	
	// Methode présentation
	public String presentation() {
		String message = "Bonjour je suis " + nom + ", je suis un " + espece + " et j'ai " + age + " ans !";
		if (ter!=null) {
			message+= "Et mon territoire est une " + ter.description();
		}
		else { message += "Je n'ai pas de territoire !";
		}
		return message;
	}
	
	//Methode setTerritoire
	public Territoire getTerritoire() {
		return ter;
	}
	public void setTerritoire (Territoire newTer) {
		ter = newTer;
	}
}
