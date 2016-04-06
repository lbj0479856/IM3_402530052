
public class eastertest {
	public static String calculateEaster(int aYear) {
		int a = aYear % 19;
		int b = aYear / 100;// Math.floor(), -2
		int c = aYear % 100;
		int d = b / 4;// Math.floor()
		int e = b % 4;
		int f = (b + 8) / 25;// Math.floor()
		int g = (b - f + 1) / 3;// Math.floor()
		int h = (19 * a + b - d - g + 15) % 30;
		int i = c / 4;// Math.floor()
		int k = c % 4;
		int l = (32 + 2 * e + 2 * i - h - k) % 7;
		int m = (a + 11 * h + 22 * l) / 451;// Math.floor()
		int aMonth = ((h + l - 7 * m + 114) / 31);// Math.floor()
		int aDay = ((h + l - 7 * m + 114) % 31) + 1;

		// String MethodName(parameter)
		// 在這邊雖然結果是正確的, 但概念錯誤, -3
		System.out.printf("In%d, Easter Sunday is: month =%d and day =%d  ", aYear, aMonth, aDay);
		return null;
	}

}
