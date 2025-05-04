class Student{
	String name="Pakee";
	int marks=10000;
	Student(){
		name="NoName";
	}
	
	Student(String n){
	 name=n;
	 }
		
	Student(String n,int m){
	 name=n;
	 marks=m;
	 }	
 
}
class StudentDemo{
	 public static void main(String[] args){
		System.out.println("Hi from student demo class");
		System.out.println("Creating an object of student class");
		
		Student s1=new Student("Nice name",85);//constructor
		System.out.println("Creating an object of student class");
		
		System.out.println("Name value of the object is "+s1.name);
		System.out.println("Name value of the object is "+s1.marks);
		
		s1.name="Thusa";//setting thae variable value
		s1.marks=1000;
		
		System.out.println("After Name value of the object is "+s1.name);//getting the variable value
		System.out.println("After Name value of the object is "+s1.marks);
	}
}