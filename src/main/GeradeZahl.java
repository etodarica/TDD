
public class GeradeZahl {

	public GeradeZahl() {
		super();
	}
	
	public boolean testeZahl(int i) {
		if(i < 0) { return false; }
		
		else if(i%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
