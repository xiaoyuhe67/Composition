
public class Person {
	
    private String name;
    private int id;
	private Education education;
	
	
	public Person(String name)
	{
		this.education=new Education();	
		education.setName("NYU");
		education.setId(11);
		this.name=name;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public String getEduName()
	{
		return education.getName();
	}
	public int getEduId()
	{
		return education.getId();
	}
	
	
	
	
	public String toString()
	{
		return "The person's name is: "+name+"\n"+"The person's school is: "+getEduName();
	}
}
