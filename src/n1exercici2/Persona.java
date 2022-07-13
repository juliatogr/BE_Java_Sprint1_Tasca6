package n1exercici2;

public class Persona{
	private String nom;
	private String cognom;
	private int edat;
	
	public Persona(String nom, String cognom, int edat){
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getCognom() {
		return this.cognom;
	}
	
	public int getEdat() {
		return this.edat;
	}

	@Override
	public String toString() {
		return nom + " " + cognom + ", " + edat + " anys.";
	}
	
	
}
