
public class Felin extends Animal implements Carnivore {

	public Felin(String tmpNom, String tmpEspece, int tmpAge) {
		super(tmpNom, tmpEspece, tmpAge);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String chasser() {
String s = "Je chasse seul.";
		return s;
	}
	
	
}
