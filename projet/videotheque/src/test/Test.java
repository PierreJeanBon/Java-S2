package test;

import java.io.File;
import java.util.Scanner;

import videotheque.FichierClient;
import videotheque.FichierCommande;
import videotheque.FichierDictionnaire;
import videotheque.FichierDvd;
import videotheque.FichierLivre;
import videotheque.CalculSomme;
import videotheque.CollectionCd;
import videotheque.CollectionClient;
import videotheque.CollectionCommande;
import videotheque.CollectionDictionnaire;
import videotheque.CollectionDvd;
import videotheque.CollectionLivre;
import videotheque.Dictionnaire;
import videotheque.FichierCd;


		public class Test  {

		    public static void main(String[] args) {

		        File f = new File("C:\\Users\\Elève\\Desktop\\BONAZZI PierreJean et FRITSCH Matthieu Projet Java\\projet\\videotheque\\src\\ressource\\listeClient.txt");
		        CollectionClient cc=new CollectionClient();
		            try{
		                cc= FichierClient.get_collection_client(f);
		               }

		            catch(Exception e){
		                e.printStackTrace(); 
		            }
		            System.out.println("------------------------------------------------------------------------------------");


		           // J'affiche les clients

		            cc.afficher();
		            
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		            File r = new File("C:\\Users\\Elève\\Desktop\\BONAZZI PierreJean et FRITSCH Matthieu Projet Java\\projet\\videotheque\\src\\ressource\\listeCommande.txt");
			        CollectionCommande cco=new CollectionCommande();
			            try{
			                cco= FichierCommande.get_collection_commande(r);
			               }

			            catch(Exception e){
			                e.printStackTrace(); 
			            }
			            System.out.println("-------------------------------------------------------------------------------------");


			           // J'affiche les commandes

			            cco.afficher();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			            File p = new File("C:\\Users\\Elève\\Desktop\\BONAZZI PierreJean et FRITSCH Matthieu Projet Java\\projet\\videotheque\\src\\ressource\\listeLivre.txt");
				        CollectionLivre cl=new CollectionLivre();
				            try{
				                cl= FichierLivre.get_collection_livre(p);
				               }

				            catch(Exception e){
				                e.printStackTrace(); 
				            }
				            System.out.println("-------------------------------------------------------------------------------------");


				           // J'affiche les livres

				            cl.afficher();			            
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				            File c = new File("C:\\Users\\Elève\\Desktop\\BONAZZI PierreJean et FRITSCH Matthieu Projet Java\\projet\\videotheque\\src\\ressource\\listeDictionnaire.txt");
					        CollectionDictionnaire cd=new CollectionDictionnaire();
					            try{
					                cd= FichierDictionnaire.get_collection_dictionnaire(c);
					               }

					            catch(Exception e){
					                e.printStackTrace(); 
					            }
					            System.out.println("-------------------------------------------------------------------------------------");


					           // J'affiche les dictionnaires

					            cd.afficher();			            
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
					          File d = new File("C:\\Users\\Elève\\Desktop\\BONAZZI PierreJean et FRITSCH Matthieu Projet Java\\projet\\videotheque\\src\\ressource\\listeCd.txt");
					          CollectionCd ccd=new CollectionCd();
					          try{
					        	  ccd= FichierCd.get_collection_cd(d);
					             }

					          catch(Exception e){
					        	  e.printStackTrace(); 
					          }
					          System.out.println("-------------------------------------------------------------------------------------");


					          // J'affiche les cd

					          ccd.afficher();			            
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			            
					          File w = new File("C:\\Users\\Elève\\Desktop\\BONAZZI PierreJean et FRITSCH Matthieu Projet Java\\projet\\videotheque\\src\\ressource\\listeDvd.txt");
					          CollectionDvd cdv=new CollectionDvd();
					          try{
					        	  cdv= FichierDvd.get_collection_dvd(w);
					             }

					          catch(Exception e){
					        	  e.printStackTrace(); 
					          }
					          System.out.println("-------------------------------------------------------------------------------------");


					          // J'affiche les cd

					          cdv.afficher();			         
		    }
		}
		
	

