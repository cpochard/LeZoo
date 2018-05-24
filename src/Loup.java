
public class Loup extends Canide {

	public Loup(String tmpNom, String tmpEspece, int tmpAge, String tmpMeute) {
		super(tmpNom, tmpEspece, tmpAge, tmpMeute);
	}

	@Override
	public String rassemblerMeute() {
		String l = super.rassemblerMeute();
		l+="\nJe hurle a la Lune pour rassembler la meute !";
		return l;
	}

}
