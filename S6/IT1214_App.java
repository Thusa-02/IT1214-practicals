class Student{
	int marks;
	String name;
	
	Student(){//constructor
		System.out.println("Creating a student object");
		name="Default name";
	}
	
	Student(String n,int m)
	{
		System.out.println("Creating a student object with name "+n+" and marks "+m);
	}
	
}


class App{
	
	public static void main(String[] args){
		
		System.out.println("Welcome to Demo Class App");
		
		Student s1=new Student();//call here so do  print 
		s1.marks=90;
		System.out.println("The marks of the student "+s1.name+" is "+s1.marks);
		s1.name="Thusa";
		
		System.out.println("The marks of the student "+s1.name+" is "+s1.marks);
		
		Student s2=new Student("Bob",100);
		
		System.out.println("The marks of the student "+s2.name+" is "+s2.marks);
	}
}
