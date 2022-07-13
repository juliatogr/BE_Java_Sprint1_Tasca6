package n1exercici1;

public class N1_E1_main {

	public static void main(String[] args){
		System.out.println("****Declaration & initialization of 3 integer variables.****");
		int num1 = 34;
		int num2 = 5;
		int num3 = 21;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		
		System.out.println();
		
		System.out.println("****Instantiation of 3 NoGenericMethods objects "
				+ "changing the order of the parameters on the constructor****");
		
		NoGenericMethods ngm1 = new NoGenericMethods(num1, num2, num3);
		NoGenericMethods ngm2 = new NoGenericMethods(num1, num3, num2);
		NoGenericMethods ngm3 = new NoGenericMethods(num3, num1, num2);
		
		System.out.println(ngm1);
		System.out.println(ngm2);
		System.out.println(ngm3);
	}

}
