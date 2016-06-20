
public class CompositionApp {

	public static void main(String[] args)
	{
		Education edu=new Education("Penn State",12);
		Person bobby = new Person("bobby");	

		System.out.println(bobby.toString());
		System.out.println(edu.toString());
		
	}
}
