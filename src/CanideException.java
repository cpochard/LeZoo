
public class CanideException extends Canide {

	public CanideException(String tmpNom, String tmpEspece, int tmpAge, String tmpMeute) 
	throws AgeNegatifException {
		super(tmpNom, tmpEspece,tmpAge, tmpMeute);
		if (tmpAge>0) {
			age = tmpAge;
		}
		else throw new AgeNegatifException();
		}
		
	public void setAge(int tmpAge) 
	throws AgeNegatifException {
		if (tmpAge>0) {
			age = tmpAge;
		}
		else throw new AgeNegatifException();
		
	}
		
	}


