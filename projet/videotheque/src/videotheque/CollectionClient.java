package videotheque;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionClient {
	 private ArrayList <Client> tab ;

	    public void add(Client d)
	    {
	        tab.add(d);
	    }
	    public CollectionClient(ArrayList<Client> tab) {
	        this.tab = tab;
	    }

	    public CollectionClient() {
	        this.tab = new ArrayList <Client>();
	    }


	    public void afficher()
	    {
	        Iterator<Client> it=tab.iterator();
	        while(it.hasNext())
	        {
	            System.out.println(it.next());
	        }
	    }

}
