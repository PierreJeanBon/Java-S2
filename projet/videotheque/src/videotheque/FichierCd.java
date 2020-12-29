package videotheque;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FichierCd {
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


	    public static CollectionCd get_collection_cd(File f)
	     throws FileNotFoundException {
	         ArrayList<String> l= get_arraylist_from_file(f); 
	         CollectionCd ccd = new  CollectionCd();
	         Iterator<String> it=l.iterator();
	         while(it.hasNext())
	         {
	           Cd c=new Cd(it.next());
	           ccd.add(c);
	         }
	         return ccd;
	    }
}
