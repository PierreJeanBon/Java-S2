package videotheque;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionCd {
	 private ArrayList <Cd> tab ;

	    public void add(Cd d)
	    {
	        tab.add(d);
	    }
	    public CollectionCd(ArrayList<Cd> tab) {
	        this.tab = tab;
	    }

	    public CollectionCd() {
	        this.tab = new ArrayList <Cd>();
	    }


	    public void afficher()
	    {
	        Iterator<Cd> it=tab.iterator();
	        while(it.hasNext())
	        {
	            System.out.println(it.next());
	        }
	    }
}
