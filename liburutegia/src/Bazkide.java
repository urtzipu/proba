public class Bazkide {

	private int ID;
	private final int MAILEGU_MAX = 3; 
	private int maileguan = 0;
	
	public int getBazkideID() {
		return ID;
	}

	public boolean hartuDezake() {
		if ( maileguan < MAILEGU_MAX ) 
		{
			maileguan++;
			return true;
		} else{
			return false;
		}
	}

}
