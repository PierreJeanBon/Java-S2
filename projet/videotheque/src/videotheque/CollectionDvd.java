package videotheque;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDvd {
	 private ArrayList <Dvd> tab ;

	    public void add(Dvd d)
	    {
	        tab.add(d);
	    }
	    public CollectionDvd(ArrayList<Dvd> tab) {
	        this.tab = tab;
	    }

	    public CollectionDvd() {
	        this.tab = new ArrayList <Dvd>();
	    }


	    public void afficher()
	    {
	        Iterator<Dvd> it=tab.iterator();
	        while(it.hasNext())
	        {
	            System.out.println(it.next());
	        }
	    }
}
