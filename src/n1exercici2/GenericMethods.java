package n1exercici2;

public class GenericMethods<T,S,U> {
	
	
	public static <T,S,U> void printArgs(T t, S s, U u) {
		System.out.println("First arg: " + t);
		System.out.println("Second arg: " + s);
		System.out.println("Third arg: " + u);
	}
}
