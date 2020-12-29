package videotheque;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FichierLivre {
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


	    public static CollectionLivre get_collection_livre(File f)
	     throws FileNotFoundException {
	         ArrayList<String> l= get_arraylist_from_file(f); 
	         CollectionLivre cl = new  CollectionLivre();
	         Iterator<String> it=l.iterator();
	         while(it.hasNext())
	         {
	           Livre b =new Livre(it.next());
	           cl.add(b);
	         }
	         return cl;
}
}
