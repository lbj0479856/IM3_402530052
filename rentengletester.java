public class rentengletester {

	
	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(4,3,2,1);
		R1.toString();
		R1.work();
		Rectangle R2 = new Rectangle(5,4,3,2);
		R2.toString();
		R2.work();
	}
	

}


class Rectangle
	{
		int height, width, Y, X;

		Rectangle(int x, int y,int w,int h)
		{
			this.X = x;
			this.Y = y;
			this.height = getHeight(w);
			this.width = getWidth(h);
		}
      
		
		public   void work()
		{
			System.out.println("java.Rectangle");
	        System.out.print("x=");
			System.out.println(X);
			System.out.print("y=");
			System.out.println(Y);
			System.out.print("width=");
			System.out.println(width);
			System.out.print("height=");
			System.out.println(height);
			System.out.print("Area=");
			System.out.println(width*height);
			System.out.print("Perimeter=");
			System.out.println((width+height)*2);
		}
		
		public int getWidth(int w)
		{
			return w;
		}
		public int  getHeight(int h)
		{
			return h;
		}
	}
	

