
public class Liburutegi {


	private LiburuZerrenda lz = new LiburuZerrenda();
	private MaileguZerrenda mz = new MaileguZerrenda();
	private BazkideZerrenda bz = new BazkideZerrenda();
	
	public Liburutegi(){
		
	}
	
	public void liburuaMaileguanHartu(String kodea, int bazkideID)
	{
		Kopia kopiaLibre = lz.kopiaLibreBilatu(kodea);
		Bazkide bazkidea = bz.bazkideaBilatu(bazkideID);
		if (bz.maileguKopuruaEgiaztatu(bazkidea)){
			mz.maileguaGorde(bazkidea, kopiaLibre);
			int kopiaZenbakia = mz.getKopiaZenbakia(kopiaLibre);
			System.out.println(kopiaZenbakia);
		} else {
			System.out.println("Bazkideak ezin ditu mailegu gehiago hartu");
		}
	}
	
}
