package videotheque;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FichierCommande {
	 public static ArrayList<String> get_arraylist_from_file(File f) 
	            throws FileNotFoundException {
	            Scanner s;
	            ArrayList<String> list = new ArrayList<String>();
	            s = new Scanner(f);
	            while (s.hasNext()) {
	                list.add(s.next());
	            }
	            s.close();
	            return list;
	        }


	    public static CollectionCommande get_collection_commande(File f)
	     throws FileNotFoundException {
	         ArrayList<String> l= get_arraylist_from_file(f); 
	         CollectionCommande cco = new  CollectionCommande();
	         Iterator<String> it=l.iterator();
	         while(it.hasNext())
	         {
	           Commande o=new Commande(it.next());
	           cco.add(o);
	         }
	         return cco;
	    }
}
