package videotheque;

public class Client {
	String nom;
	String prenom; 
	String id_client;
	static String categorie;
	

public Client (String nom, String prenom, String id_client, String categorie) {
	this.nom = nom;
	this.prenom = prenom;
	this.id_client = id_client;
	Client.categorie = categorie;
}
public Client(String ch)
{
    String mot[];
    mot=ch.split("\\,"); //permet de dire quest ce qui va séparer chaque attribut (ici un espace et une virgule) ;)
    nom=mot[0];
    prenom=mot[1];
    id_client=mot[2];
    categorie=mot[3];
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getId_client() {
	return id_client;
}
public void setId_client(String id_client) {
	this.id_client = id_client;
}
public String getCategorie() {
	return categorie;
}
public void setCategorie(String categorie) {
	Client.categorie = categorie;
}
@Override
public String toString() {
	return "Client [ nom = " + nom + ", prenom = " + prenom + ", id_client = " + id_client + ", categorie = " + categorie + " ]";	
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (!(obj instanceof Client))
        return false;
    Client other = (Client) obj;
    if (nom == null) {
        if (other.nom != null)
            return false;
    } else if (!nom.equals(other.nom))
        return false;
    if (id_client != other.id_client)
        return false;
    if (prenom == null) {
        if (other.prenom != null)
            return false;
    } else if (!prenom.equals(other.prenom))
        return false;
    return true;
}

}
