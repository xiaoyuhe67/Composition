
public class Education {
	
	private String name;
	private int id;
	
	Education[] educations=new Education[10];
	
	
	public Education()
	{
		
	}
	@Override
	public String toString()
	{
		return "School name is: "+this.name+", school id is: "+this.id;
	}
	
	public Education(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public void educationList()
	{
		Education edu1=new Education("GWU",1);
		Education edu2=new Education("GMU",2);
		Education edu3=new Education("GU",3);
		Education edu4=new Education("JHU",4);
		Education edu5=new Education("AU",5);
		Education edu6=new Education("UVA",6);
		Education edu7=new Education("UCLA",7);
		Education edu8=new Education("BU",8);
		Education edu9=new Education("UIC",9);
		Education edu10=new Education("Penn",9);
		
		educations[0]=edu1;
		educations[1]=edu2;
		educations[2]=edu3;
		educations[3]=edu4;
		educations[4]=edu5;
		educations[5]=edu6;
		educations[6]=edu7;
		educations[7]=edu8;
		educations[8]=edu9;
		educations[9]=edu10;
		
		
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
	

}
