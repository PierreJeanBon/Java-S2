package videotheque;

public class Cd {
	String titre_cd;
	String annee_sortie;
	String id_cd;
	int tarif_cd;
	static int quantite;
	

public Cd (String titre_cd, String annee_sortie, String id_cd, int tarif_cd) {
	this.titre_cd = titre_cd;
	this.annee_sortie = annee_sortie;
	this.id_cd = id_cd;
	this.tarif_cd = tarif_cd;
}
	
public Cd (String ch)
{
	    String mot[];
	    mot=ch.split("\\,"); //permet de dire quest ce qui va séparer chaque attribut (ici un espace et une virgule) ;)
	    titre_cd=mot[0];
	    annee_sortie=mot[1];
	    id_cd=mot[2];
	    @SuppressWarnings("deprecation")
		Integer I=new Integer(mot[3]);
	    tarif_cd = I.intValue();
	}

public String getTitre_cd() {
	return titre_cd;
}

public void setTitre_cd(String titre_cd) {
	this.titre_cd = titre_cd;
}

public String getAnnee_sortie() {
	return annee_sortie;
}

public void setAnnee_sortie(String annee_sortie) {
	this.annee_sortie = annee_sortie;
}

public String getId_cd() {
	return id_cd;
}

public void setId_cd(String id_cd) {
	this.id_cd = id_cd;
}

public int getTarif_cd() {
	return tarif_cd;
}

public void setTarif_cd(int tarif_cd) {
	this.tarif_cd = tarif_cd;
}
@Override
public String toString() {
	return "Cd [ titre cd = " + titre_cd + ", annee_sortie = " + annee_sortie + ", id_cd = " + id_cd + ", tarif_cd = " + tarif_cd + " ]";
}
@Override 
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (!(obj instanceof Cd))
        return false;
    Cd other = (Cd) obj;
    if (titre_cd == null) {
        if (other.titre_cd != null)
            return false;
    } else if (!titre_cd.equals(other.titre_cd))
        return false;
    if (annee_sortie != other.annee_sortie)
        return false;
    if (tarif_cd != other.tarif_cd)
        return false;
    if (id_cd == null) {
        if (other.id_cd != null)
            return false;
    } else if (!id_cd.equals(other.id_cd))
        return false;
    return true;
}
}

