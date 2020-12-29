package videotheque;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionCommande {
	 private ArrayList <Commande> tab ;

	    public void add(Commande c)
	    {
	        tab.add(c);
	    }
	    public CollectionCommande(ArrayList<Commande> tab) {
	        this.tab = tab;
	    }

	    public CollectionCommande() {
	        this.tab = new ArrayList <Commande>();
	    }


	    public void afficher()
	    {
	        Iterator<Commande> it=tab.iterator();
	        while(it.hasNext())
	        {
	            System.out.println(it.next());
	        }
	    }
}
