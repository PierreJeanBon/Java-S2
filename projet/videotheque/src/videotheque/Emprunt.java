package videotheque;

import videotheque.AjouterEmprunt;

public class Emprunt {

	String Date;
	String idprod;
	String idemprunt;
	static Double tarif;
	
	public void TarifEmprunt(double tarif) {
		tarif = AjouterEmprunt.prixemprunt;
	}
	
	public String empruntdef;
	{
	empruntdef=AjouterEmprunt.emprunt;
	System.out.println(empruntdef);
	

}
}
