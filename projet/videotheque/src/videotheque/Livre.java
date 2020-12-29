package videotheque;

public class Livre {
	String titre_livre;
	String auteur;
	String categorie_livre;
	String id_livre;
	String tarif_livre;
	static int quantite;


public Livre (String titre_livre, String auteur, String categorie_livre, String id_livre, String tarif_livre) {
	this.titre_livre = titre_livre;
	this.auteur = auteur;
	this.categorie_livre = categorie_livre;
	this.id_livre = id_livre;
	this.tarif_livre = tarif_livre;
}
public Livre(String ch)
{
    String mot[];
    mot=ch.split("\\,"); //permet de dire quest ce qui va séparer chaque attribut (ici un espace et une virgule) ;)
    titre_livre=mot[0];
    auteur=mot[1];
    categorie_livre=mot[2];
    id_livre=mot[3];
    tarif_livre=mot[4];
}
public String getTitre_livre() {
	return titre_livre;
}
public void setTitre_livre(String titre_livre) {
	this.titre_livre = titre_livre;
}
public String getAuteur() {
	return auteur;
}
public void setAuteur(String auteur) {
	this.auteur = auteur;
}
public String getId_livre() {
	return id_livre;
}
public String getCategorie_livre() {
	return categorie_livre;
}
public void setCategorie_livre(String categorie_livre) {
	this.categorie_livre = categorie_livre;
}
public void setId_livre(String id_livre) {
	this.id_livre = id_livre;
}
public String getTarif_livre() {
	return tarif_livre;
}
public void setTarif_livre(String tarif_livre) {
	this.tarif_livre = tarif_livre;
}
@Override
public String toString() {
	return "Livre : [ titre_livre = " + titre_livre + ", auteur = " + auteur + ", categorie livre = " + categorie_livre + ", id_livre = " + id_livre + ", tarif_livre = " + tarif_livre + " ]";
}

@Override 
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (!(obj instanceof Livre))
        return false;
    Livre other = (Livre) obj;
    if (titre_livre == null) {
        if (other.titre_livre != null)
            return false;
    } else if (!titre_livre.equals(other.titre_livre))
        return false;
    if (auteur != other.auteur)
        return false;
    if (categorie_livre != other.categorie_livre)
    	return false;
    if (id_livre != other.id_livre)
        return false;
    if (tarif_livre == null) {
        if (other.tarif_livre != null)
            return false;
    } else if (!tarif_livre.equals(other.tarif_livre))
        return false;
    return true;
}
}