/*
 * [A]96
 * [TA's]
 * 1.下次作業請依照要求格式印出.
 * 2.並未實作toString()的override, 此部分扣2分.
 * 3.getHeight(),getWidth()概念錯誤, 此部分扣2分.
 * */

//建議自己寫的類別放前面.
class Rectangle {
	int height, width, Y, X;

	//Rectangle(){this(-1,-1,-1,-1);}//建議加上空白建構子讓你的程式更好.
	
	Rectangle(int x, int y, int w, int h) {
		this.X = x;
		this.Y = y;
		
		//下方是否多餘? 你傳而 method結束傳回來,之中都沒有進行任何運算?
		this.height = getHeight(w);
		this.width = getWidth(h);
	}

	//實作public String toString(){return ....;}
	
	public void work() {
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
		System.out.println(width * height);
		System.out.print("Perimeter=");
		System.out.println((width + height) * 2);
	}

	//修改成(getHeight()相同意思.)
	/*
	 * public int getWidth(){
		return this.width;
	}
	*/
	
	public int getWidth(int w) {
		return w;
	}

	public int getHeight(int h) {
		return h;
	}
}

public class rentengletester {

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(4, 3, 2, 1);
		
		//toString會回傳一字串, 而這字串去哪了?
		R1.toString();
		
		R1.work();
		Rectangle R2 = new Rectangle(5, 4, 3, 2);
		R2.toString();
		R2.work();
	}
}

