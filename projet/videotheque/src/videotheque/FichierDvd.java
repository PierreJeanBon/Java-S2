package videotheque;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FichierDvd {


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


    public static CollectionDvd get_collection_dvd(File f)
     throws FileNotFoundException {
         ArrayList<String> l= get_arraylist_from_file(f); 
         CollectionDvd cdv = new  CollectionDvd();
         Iterator<String> it=l.iterator();
         while(it.hasNext())
         {
           Dvd w=new Dvd(it.next());
           cdv.add(w);
         }
         return cdv;
    }
}
