/*
 * [A]99
 * [TA's]
 * 1.下次作業請依照要求格式印出.
 * 2.toString()的override概念有點奇怪, 此部分扣1分.
 * */

//建議自己寫的類別放前面.
class Rectangle {
	int Y, X;
	double height, width;

	//Rectangle(){this(-1,-1,-1,-1);}//建議加上空白建構子讓你的程式更好.
	
	Rectangle(int x, int y, double w, double h) {
		this.X = x;
		this.Y = y;
		this.height = h;
		this.width = w;
	}

	public String toString() {

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
		System.out.println(getWidth() * getHeight());
		System.out.print("Perimeter=");
		System.out.println((getWidth() + getHeight()) * 2);
		
		//其實這method應該要把上方字串串接起來回傳再印出
		//提供給你一個方法寫在下方.
	
		/*
		 * 	StringBuffer sb=new StringBuffer();
			sb.append("java.Rectangle");
			sb.append("{x=");
			sb.append(X);
			sb.append(",y=");
			sb.append(Y);
			sb.append(",width=");
			sb.append(getWidth());
			sb.append(",height=");
			sb.append(getHeight());
			sb.append("}");
			sb.append("Area=");
			sb.append(getWidth() * getHeight());
			sb.append("Perimeter=");
			sb.append((getWidth() + getHeight()) * 2);
			
			//important!
			return sb.toString();
		 * */
		
		
		
		return null;
	}

	//這method有點雞肋, 何不就直接印了呢?
	public void end() {
		System.out.print("End of Output!");
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

}

public class rentengletester {

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(15, 25, 18, 57);
		R1.toString();
		Rectangle R2 = new Rectangle(0, 12, 60, 47);
		R2.toString();
		R1.end();
	}
}
