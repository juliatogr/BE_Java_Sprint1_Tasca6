package n2exercici1;

public class N2_E1_main {

	public static void main(String[] args) {
		
		System.out.println("****Creating 3 different objects of different types****");
		System.out.println();
		
		Persona p = new Persona("Maria", "Pons", 30);
		String txt = "Hola";
		int num = 2;
			
		System.out.println("Object of type Persona: p = " + p);
		System.out.println("Object of type String: txt = " + txt);
		System.out.println("Object of type Integer: num = " + num);
		
		System.out.println();
		
		System.out.println("****Calling printArgs() method of GenericMethods class"
				+ " with different order on the parameters****");
		System.out.println();
		
		// Necessito posar un string sempre al principi, sino dona error. 
		// Els altres paràmetres poden passar-se en qualsevol ordre.
		GenericMethods.printArgs(txt, p, num);
		System.out.println();
		GenericMethods.printArgs(txt, num, p);
		System.out.println();
		GenericMethods.printArgs(txt, txt, num);
	}

}
