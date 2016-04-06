
/*
 * [B]80
 * [TA's Advise]
 * 1.題目並沒有要求要寫Scanner, 請依照題目要求作撰寫, 若之後作業若想以Scanner進行撰寫請務必寫例外處理, 產生例外未處理將以程式錯誤進行扣分.
 * 2.並未產生javadoc, 此部分扣5分.
 * 3.實作的演算法錯誤(題目要求為Gauss, 此演算法為Anonymous Gregorian, 等級從B開始計算.
 */
import java.util.Scanner;

public class easter {

	public static void main(String arg[])

	{
		int aYear;
		Scanner Scanner = new Scanner(System.in);
		System.out.print("輸入你想知道的復活節月份(2001 or 2012)");
		aYear = Scanner.nextInt();

		// 本次題目不需要使用new object, 僅須透過static去呼叫method, 回傳值再印出.
		eastertest myeastertest = new eastertest();
		eastertest.calculateEaster(aYear);

	}

}
