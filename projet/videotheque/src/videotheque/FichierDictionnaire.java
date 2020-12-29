package videotheque;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FichierDictionnaire {
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


	    public static CollectionDictionnaire get_collection_dictionnaire(File f)
	     throws FileNotFoundException {
	         ArrayList<String> l= get_arraylist_from_file(f); 
	         CollectionDictionnaire cd = new  CollectionDictionnaire();
	         Iterator<String> it=l.iterator();
	         while(it.hasNext())
	         {
	           Dictionnaire c=new Dictionnaire(it.next());
	           cd.add(c);
	         }
	         return cd;
}
}
