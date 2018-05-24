
public abstract class Canide extends Animal implements Carnivore {
	
	protected String meute;

	public Canide(String tmpNom, String tmpEspece, int tmpAge, String tmpMeute) {
		super(tmpNom, tmpEspece, tmpAge);
		meute = tmpMeute;
	}

	//Override de la méthode présentation de la classe mère Animal pour la modifier
	//Ici pour rajouter rassembler la meute
	@Override
	public String presentation() {
		String str = super.presentation();
		str += "Le nom de ma meute est " + meute + " !";
		return str;
	}

	//Methode rassembler la meute
	public String rassemblerMeute() {
		String st = presentation();
		st+="\nJe fais du bruit pour rassembler la meute !";
		return st;
	}
	
	@Override
	public String chasser() {
String s = "Je chasse en meute.";
return s;
	}
}
