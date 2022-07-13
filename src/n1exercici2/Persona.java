package n1exercici2;

public class Persona{
	private String nom;
	private String cognom;
	private int age;
	
	public Persona(String nom, String cognom, int age){
		this.nom = nom;
		this.cognom = cognom;
		this.age = age;
	}
	
	public String getName() {
		return this.nom;
	}
	
	public String getCognom() {
		return this.cognom;
	}
	
	public int getAge() {
		return this.age;
	}

	@Override
	public String toString() {
		return nom +" " + cognom + ", " + age + " years old";
	}
	
	
}
