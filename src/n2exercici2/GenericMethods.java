package n2exercici2;

import java.util.List;

public class GenericMethods<S> {
	
	
	public static <S> void printArgs(List<S> args) {
		
		int numArgs = args.size();
		for (int i=0; i<numArgs; i++) {
			System.out.println("Argument #" + (i+1) + ": " + args.get(i));
		}
	}
}
