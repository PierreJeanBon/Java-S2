package videotheque;


import videotheque.Emprunt;

public class Commande {
	String id_commande;
	String date_creation;
	static double somme_commande=200;


public Commande (String id_commande, String date_creation, int somme_commande) {
	this.id_commande = id_commande;
	this.date_creation = date_creation;
	Commande.somme_commande = somme_commande;
}

public void Somme(Double somme_commande) {
	somme_commande=Emprunt.tarif;
}

public Commande(String ch)
{
    String mot[];
    mot=ch.split("\\,"); //permet de dire qu'est ce qui va séparer chaque attribut (ici un espace et une virgule) ;)
    id_commande=mot[0];
    date_creation=mot[1];
}

public String getId_commande() {
	return id_commande;
}

public void setId_commande(String id_commande) {
	this.id_commande = id_commande;
}

public String getDate_creation() {
	return date_creation;
}

public void setDate_creation(String date_creation) {
	this.date_creation = date_creation;
}

public Double getSomme_commande() {
	return somme_commande;
}

public void setSomme_commande(Double somme_commande) {
	Commande.somme_commande = somme_commande;
}

@Override
public String toString() {
	return "Commande : [ id_commande = " + id_commande + ",date création = " + date_creation + " ]";
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (!(obj instanceof Commande))
        return false;
    Commande other = (Commande) obj;
    if (id_commande == null) {
        if (other.id_commande != null)
            return false;
    } else if (!id_commande.equals(other.id_commande))
        return false;
       return true;
}
}