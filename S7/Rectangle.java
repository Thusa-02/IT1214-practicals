class Rectangle{
	
	int height;
	int width;
	
	Rectangle(int height,int width){
		this.height=height;
		this.width=width;
		System.out.println("Just created rectangle object with(h*w)"+height+"*"+width);
		print(width,height);
	}
	
	void print(int width,int height){
		for(int i=0 ; i<height ; i++)
		{
			for(int j=0 ;j<width ; j++)
			{
			System.out.print("*");
			}
		System.out.println();//break line
	}
}
}

class Main{
	public static void main(String[] args){
		
		Rectangle r1=new Rectangle(10,3);
		Rectangle r2=new Rectangle(5,2);
		
		//r1.print(10,3);
		//r2.print(5,2);
		
		
		Rectangle r3=r1;
		System.out.println("height "+r1.height+" width "+r1.width);
		System.out.println("height "+r2.height+" width "+r2.width);
		System.out.println("height "+r3.height+" width "+r3.width);
	}
}
