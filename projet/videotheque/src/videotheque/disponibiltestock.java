package videotheque;

import videotheque.Cd;
import videotheque.Dvd;
import videotheque.Livre;
import videotheque.Dictionnaire;


public class disponibiltestock {
	{
	
	if(Cd.quantite == 0)
{ System.out.println("Ce produit n'est plus disponible");
}
	if(Dvd.quantite == 0)
{ System.out.println("Ce produit n'est plus disponible");
}	
	if(Livre.quantite == 0)
{ System.out.println("Ce produit n'est plus disponible");
}
	if(Dictionnaire.quantite == 0)
{ System.out.println("Ce produit n'est plus disponible");
}
}
}