package videotheque;

import java.util.Scanner;

import videotheque.Cd;
import videotheque.Dvd;
import videotheque.Livre;
import videotheque.Dictionnaire;
import videotheque.Emprunt;

@SuppressWarnings("unused")
public class CalculSomme {

	public static int prixtot;
	public static int nbjours=1;
	public static int prixemprunt;
	
	public void Calcul() {
		CalculSomme.prixemprunt=Dictionnaire.tarif_dico;
		CalculSomme.prixtot=CalculSomme.prixemprunt*CalculSomme.nbjours;
		System.out.println(CalculSomme.prixtot);
	}
}
