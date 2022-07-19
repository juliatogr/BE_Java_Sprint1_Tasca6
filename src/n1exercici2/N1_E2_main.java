package n1exercici2;

public class N1_E2_main {

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
		
		GenericMethods.printArgs(p, txt, num);
		System.out.println();
		GenericMethods.printArgs(txt, num, p);
		System.out.println();
		GenericMethods.printArgs(num, p, txt);
	}

}
