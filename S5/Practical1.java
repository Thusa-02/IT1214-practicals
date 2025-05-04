class Paper{
	int length;
	int width;
	String text;
	
}

class Document{
	String name;
	Paper p;
	
	public static void main(String[] args){
		Document d=new Document();
		System.out.println("Created a Document Object d ");
		d.name="My First Document";
		System.out.println("Name of the Document d is "+d.name);
		d.p=new Paper();
		d.p.text="";
		d.p.length=10;
		d.p.width=5;
		System.out.println("Size (l*w) of the paper of the Document d is "+d.p.length+"*"+d.p.width+"="+d.p.length*d.p.width);
		
		System.out.println("Created a Document Object d2 ");
		Document d2=new Document();
		d2.name="My Second Document";
		System.out.println("Name of the Document d2 is "+d2.name);
		
		
		
	}
	
	
}
