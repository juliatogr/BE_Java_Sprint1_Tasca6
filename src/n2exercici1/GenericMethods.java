package n2exercici1;

public class GenericMethods<S,U> {
	
	
	public static <S,U> void printArgs(String str, S s, U u) {
		System.out.println("First arg: " + str);
		System.out.println("Second arg: " + s);
		System.out.println("Third arg: " + u);
	}
}
