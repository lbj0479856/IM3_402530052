public class rentengletester {

	
	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(15,25,18,57);
		R1.toString();

		Rectangle R2 = new Rectangle(0,12,60,47);
		R2.toString();
		
		R1.end();

	}
	

}


class Rectangle
	{
		int  Y, X;
        double height, width;
		
		Rectangle(int x, int y,double w,double h)
		{
			this.X = x;
			this.Y = y;
			this.height = h;
			this.width = w;
			
		}
      
		
		public   String  toString()
		{
			
			System.out.print("java.Rectangle");
	        System.out.print("{x=");
			System.out.print(X);
			System.out.print(",y=");
			System.out.print(Y);
			System.out.print(",width=");
			System.out.print(getWidth());
			System.out.print(",height=");
			System.out.print(getHeight());
			System.out.println("}");
			System.out.print("Area=");
			System.out.println(getWidth()*getHeight());
			System.out.print("Perimeter=");
			System.out.println((getWidth()+getHeight())*2);
			return null;
		}
		public void end()
		{
			System.out.print("End of Output!");
		}
		public double getWidth()
		{
			return width;
		}
		public double  getHeight()
		{
			return height;
		}

	}
	

