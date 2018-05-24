
public class Oiseau extends Animal {

	protected String nid;
	
	public Oiseau (String tmpNom, String tmpEspece, int tmpAge, String tmpNid) {
		super (tmpNom, tmpEspece, tmpAge);
		nid = tmpNid;
	}

	//Override de la m�thode pr�sentation de la classe m�re Animal
	//Permet de modifier cette m�thode et de lui ajouter la description du nid
	@Override
	public String presentation() {
		String messageOiseau = super.presentation();
		messageOiseau += "\n Je vis dans un nid " + nid + " !";
		return messageOiseau;
	}
	
	//Methode voler
	public String voler() {
		String s = presentation();
		s+= "Je vole !";
		return s;
	}
	

}
