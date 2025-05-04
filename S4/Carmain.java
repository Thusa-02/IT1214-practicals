class Car{

private String model;

//getter

public String getModel(){
	return model;
}

//setter

public void setModel(String newModel){
	this.model=newModel;
	
}
}
public class Carmain
{
	public static void main(String args[])
	{
		Car c1=new Car();
		c1.setModel("Toyota");
		System.out.println(c1.getModel());
	}
}
