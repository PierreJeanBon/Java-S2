package videotheque;

public class Dvd {
	String titre_dvd;
	String realisateur;
	String id_dvd;
	int tarif_dvd;
	static int quantite;
	

public Dvd (String titre_dvd, String realisateur, String id_dvd, int tarif_dvd) {
	this.titre_dvd = titre_dvd;
	this.realisateur = realisateur;
	this.id_dvd = id_dvd;
	this.tarif_dvd = tarif_dvd;
}
public Dvd(String ch)
{
    String mot[];
    mot=ch.split("\\,"); //permet de dire quest ce qui va séparer chaque attribut (ici un espace et une virgule) ;)
    titre_dvd=mot[0];
    realisateur=mot[1];
    id_dvd=mot[2];
    @SuppressWarnings("deprecation")
	Integer I=new Integer(mot[3]);
    tarif_dvd=I.intValue();
}
public String getTitre_dvd() {
	return titre_dvd;
}
public void setTitre_dvd(String titre_dvd) {
	this.titre_dvd = titre_dvd;
}
public String getRealisateur() {
	return realisateur;
}
public void setRealisateur(String realisateur) {
	this.realisateur = realisateur;
}
public String getId_dvd() {
	return id_dvd;
}
public void setId_dvd(String id_dvd) {
	this.id_dvd = id_dvd;
}
public int getTarif_dvd() {
	return tarif_dvd;
}
public void setTarif_dvd(int tarif_dvd) {
	this.tarif_dvd = tarif_dvd;
}
@Override
public String toString() {
	return "DVD [ titre dvd = " + titre_dvd + ", réalisateur = " + realisateur + ", id dvd = " + id_dvd + ", tarif dvd = " + tarif_dvd + " ]";
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (!(obj instanceof Dvd))
        return false;
    Dvd other = (Dvd) obj;
    if (titre_dvd == null) {
        if (other.titre_dvd != null)
            return false;
    } else if (!titre_dvd.equals(other.titre_dvd))
        return false;
    if (realisateur != other.realisateur)
        return false;
    if (tarif_dvd != other.tarif_dvd)
        return false;
    if (id_dvd == null) {
        if (other.id_dvd != null)
            return false;
    } else if (!id_dvd.equals(other.id_dvd))
        return false;
    return true;
}
}