package videotheque;

public class Dictionnaire {
	static String titre_dico;
	String langue;
	String id_dico;
	public static int tarif_dico =15;
	static int quantite; 
	
public static int getQuantite() {
		return quantite;
	}

	public static void setQuantite(int quantite) {
		Dictionnaire.quantite = quantite;
	}

public Dictionnaire (String titre_dico, String langue, String id_dico, int tarif_dico) {
	Dictionnaire.titre_dico = titre_dico;
	this.langue = langue;
	this.id_dico = id_dico;
	this.tarif_dico = tarif_dico;
}

public Dictionnaire(String ch)
{
    String mot[];
    mot=ch.split("\\,"); //permet de dire quest ce qui va séparer chaque attribut (ici un espace et une virgule) ;)
    titre_dico=mot[0];
    langue=mot[1];
    id_dico=mot[2];

}

public String getTitre_dico() {
	return titre_dico;
}

public void setTitre_dico(String titre_dico) {
	Dictionnaire.titre_dico = titre_dico;
}

public String getLangue() {
	return langue;
}

public void setLangue(String langue) {
	this.langue = langue;
}

public String getId_dico() {
	return id_dico;
}

public void setId_dico(String id_dico) {
	this.id_dico = id_dico;
}

public int getTarif_dico() {
	return tarif_dico;
}

public void setTarif_dico(int tarif_dico) {
	this.tarif_dico = tarif_dico;
}
@Override 
public String toString() {
	return "Dictionnaire [ titre dictionnaire = " + titre_dico + ", langue = " + langue + ", id_dico = " + id_dico + ", tarif dictionnaire = " + tarif_dico +" ]";
}
@Override 
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (!(obj instanceof Dictionnaire))
        return false;
    Dictionnaire other = (Dictionnaire) obj;
    if (titre_dico == null) {
        if (Dictionnaire.titre_dico != null)
            return false;
    } else if (!titre_dico.equals(Dictionnaire.titre_dico))
        return false;
    if (langue != other.langue)
        return false;
    if (id_dico != other.id_dico)
        return false;
        return false;
}
}
