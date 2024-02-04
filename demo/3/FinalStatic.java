final class Constant{
	double PI=3.1416;
}

public class FinalStatic{
	public static void main(String[] args){
		Constant obj=new Constant();
		System.out.println("The value of final class : "+obj.PI);
		obj.PI=3.14159;
		System.out.println("The value after changing : "+obj.PI);
	}
}
