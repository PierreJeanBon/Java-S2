package videotheque;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDictionnaire {
	 private ArrayList <Dictionnaire> tab ;

	    public void add(Dictionnaire d)
	    {
	        tab.add(d);
	    }
	    public CollectionDictionnaire(ArrayList<Dictionnaire> tab) {
	        this.tab = tab;
	    }

	    public CollectionDictionnaire() {
	        this.tab = new ArrayList <Dictionnaire>();
	    }


	    public void afficher()
	    {
	        Iterator<Dictionnaire> it=tab.iterator();
	        while(it.hasNext())
	        {
	            System.out.println(it.next());
	        }
	    }
}
