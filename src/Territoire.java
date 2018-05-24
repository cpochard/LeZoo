
public class Territoire {
	
	//Attributs
	protected String type;
	protected int superficie;
	
	//Constructeur
	public Territoire(String tmpType, int tmpSuperficie) {
		type = tmpType;
		superficie = tmpSuperficie;
	}
		
	//Methode description
	public String description () {
		return (type + " qui a une superficie de " + superficie + " m²");
	}
	
	

}
