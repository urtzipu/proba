import java.util.ArrayList;


public class LiburuZerrenda {

	private ArrayList<Liburu> liburuak = new ArrayList<>();
	
	public Kopia kopiaLibreBilatu(String kodea){
		for (Liburu l : liburuak) {
			if (kodea.equals(l.getKodea()))
				return l.kopiaLibreaLortu();
		}
		return null;
	}
}
