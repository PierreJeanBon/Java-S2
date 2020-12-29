package videotheque;

import java.io.File;
import java.util.Scanner;

import videotheque.CollectionLivre;
import videotheque.CollectionCd;
import videotheque.CollectionDictionnaire;


public class AjouterEmprunt {
	static int prixemprunt;
	
	public static String emprunt;

	 File p = new File("C:\\Users\\Elève\\Desktop\\projet\\projet\\videotheque\\src\\ressource\\listeLivre.txt");
     CollectionLivre cl=new CollectionLivre();{
         try{
             cl= FichierLivre.get_collection_livre(p);
            }

         catch(Exception e){
             e.printStackTrace(); 
         }
         System.out.println("-------------------------------------------------------------------------------------");


         cl.afficher();	
         
         File c = new File("C:\\Users\\Elève\\Desktop\\projet\\projet\\videotheque\\src\\ressource\\listeDictionnaire.txt");
	        CollectionDictionnaire cd=new CollectionDictionnaire();
	            try{
	                cd= FichierDictionnaire.get_collection_dictionnaire(c);
	               }

	            catch(Exception e){
	                e.printStackTrace(); 
	            }
	            System.out.println("-------------------------------------------------------------------------------------");


	            cd.afficher();
	            
	            File d = new File("C:\\Users\\Elève\\Desktop\\projet\\projet\\videotheque\\src\\ressource\\listeCd.txt");
		          CollectionCd ccd=new CollectionCd();
		          try{
		        	  ccd= FichierCd.get_collection_cd(d);
		             }

		          catch(Exception e){
		        	  e.printStackTrace(); 
		          }
		          System.out.println("-------------------------------------------------------------------------------------");
		          
		          ccd.afficher();
		          
		     @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
		     System.out.println("Veuillez saisir le titre du documents qui est emprunter :");
		     String str = sc.nextLine();
		     System.out.println("Vous avez sélectionner : " + str);
		     str=emprunt;
		     
}   
}