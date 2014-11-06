import java.util.ArrayList;

public class Liburu {
 
  private ArrayList<Kopia> kopiak = new ArrayList<Kopia>();
  private String kodea;
  
  public Liburu(String kodea){
     this.kodea = kodea;
  }

  public String getKodea() {
	return kodea;	
  }

  public Kopia kopiaLibreaLortu(){
	for(Kopia k : kopiak)
		if (k.getLibre())
			return k;
        
	return null;
  }

}
