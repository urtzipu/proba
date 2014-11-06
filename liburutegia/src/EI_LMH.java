import java.util.Scanner;

public class EI_LMH {


  private Liburutegi liburutegia = new Liburutegi();
  private int bazkide;
  private String liburu;

  public static void main(String[] args){
	  EI_LMH lmh = new EI_LMH();
	  lmh.maileguanHartu();
  }

	private void maileguanHartu() {
	  	Scanner s = new Scanner(System.in);
		System.out.println("Sartu zure IDa:");
		bazkide = s.nextInt();
		System.out.println("Sartu zure liburuaren kodea:");
		liburu = s.next();

		System.out.println(bazkide + " " + liburu);
		
		liburutegia.liburuaMaileguanHartu(liburu, bazkide);
				
	}

}
