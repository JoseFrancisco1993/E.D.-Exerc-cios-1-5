package ex1;

public class somacontroller {
    public somacontroller() {
    	super();
    	
    }
    public int soma (int sum) {
    	//condi��o de parada
    	if (sum <= 0) {
    		return 0;
    	} else {
    	return sum + soma(sum - 1);
    	}
    }
}