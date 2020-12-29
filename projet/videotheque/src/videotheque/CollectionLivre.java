package videotheque;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionLivre {
	 private ArrayList <Livre> tab ;

	    public void add(Livre d)
	    {
	        tab.add(d);
	    }
	    public CollectionLivre(ArrayList<Livre> tab) {
	        this.tab = tab;
	    }

	    public CollectionLivre() {
	        this.tab = new ArrayList <Livre>();
	    }


	    public void afficher()
	    {
	        Iterator<Livre> it=tab.iterator();
	        while(it.hasNext())
	        {
	            System.out.println(it.next());
	        }
	    }
}
