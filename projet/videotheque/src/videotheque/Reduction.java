package videotheque;

public class Reduction {

	static double prixtot=225;
	static double reduc=-10;

	 public static void main(String[] args) {
		 
	        System.out.println("\nLe prix, apr�s application d'une r�duction de -10%, est �gal � " + f(reduc, prixtot));
	    }
	 
	    public static double f(double reduc, double prixtot){
	        return (1 + reduc/100)*prixtot;
	    }
}