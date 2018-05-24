
@SuppressWarnings("serial")
public class AgeNegatifException extends Exception {
	
	public AgeNegatifException(){
		super ("Un animal ne peut avoir un age négatif");
	}

}
