package videotheque;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.Scanner;

	public class FichierClient{


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


	    public static CollectionClient get_collection_client(File f)
	     throws FileNotFoundException {
	         ArrayList<String> l= get_arraylist_from_file(f); 
	         CollectionClient cc = new  CollectionClient();
	         Iterator<String> it=l.iterator();
	         while(it.hasNext())
	         {
	           Client o=new Client(it.next());
	           cc.add(o);
	         }
	         return cc;
	    }

	    }

