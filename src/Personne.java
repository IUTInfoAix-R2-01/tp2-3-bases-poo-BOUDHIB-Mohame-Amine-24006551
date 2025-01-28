
public class Personne {

	private String nom;
	private String prenom;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public String toString() {
		return "Le nom de la personne est :" + nom + " et son prénom est : " + prenom;
	}
	
}
