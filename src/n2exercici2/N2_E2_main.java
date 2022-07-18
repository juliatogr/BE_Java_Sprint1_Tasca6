package n2exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N2_E2_main {

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
		
		// Creem 3 llistes amb els parametres en diferent ordre, generalitzant a tipus Object.
		
		List<Object> l1 = new ArrayList<Object>(Arrays.asList(txt, p, num));
		List<Object> l2 = new ArrayList<Object>(Arrays.asList(p, txt,num));
		List<Object> l3 = new ArrayList<Object>(Arrays.asList(num, p, txt));
		
		// Imprimim totes les llistes
		GenericMethods.printArgs(l1);
		System.out.println();
		GenericMethods.printArgs(l2);
		System.out.println();
		GenericMethods.printArgs(l3);
		System.out.println();

	}

}
