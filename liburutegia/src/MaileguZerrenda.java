import java.util.ArrayList;

public class MaileguZerrenda {

	private ArrayList<Mailegu> maileguak = new  ArrayList<Mailegu>(); 
	
	public void maileguaGorde(Bazkide b, Kopia kopiaLibre) {
		maileguak.add( new Mailegu(b, kopiaLibre) );
		kopiaLibre.setLibre(false);
	}

	public int getKopiaZenbakia(Kopia kopiaLibre) {
		
		return kopiaLibre.getZenb();
	}
	
}
