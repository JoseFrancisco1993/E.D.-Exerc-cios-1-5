package ex2;

public class converterParaBinario {
	
	public converterParaBinario () {
		super ();
		}
	
	public String num (int bin) {
		if(bin / 2 == 0) {
			return String.valueOf(bin%2);
			
		}
		    return  num (bin / 2) + String.valueOf(bin%2) ;
		    
	}
 
}