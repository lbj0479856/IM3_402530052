/*
 * [A]99
 * [TA's]
 * 1.�U���@�~�Ш̷ӭn�D�榡�L�X.
 * 2.toString()��override�������I�_��, ��������1��.
 * */

//��ĳ�ۤv�g�����O��e��.
class Rectangle {
	int Y, X;
	double height, width;

	//Rectangle(){this(-1,-1,-1,-1);}//��ĳ�[�W�ťիغc�l���A���{����n.
	
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
		
		//���omethod���ӭn��W��r��걵�_�Ӧ^�ǦA�L�X
		//���ѵ��A�@�Ӥ�k�g�b�U��.
	
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

	//�omethod���I����, �󤣴N�����L�F�O?
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
