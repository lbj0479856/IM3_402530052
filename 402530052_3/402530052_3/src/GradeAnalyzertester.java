/*
 * [A]100
 * [TA's Advise]
 * 1. 兩個檔案都有多餘引用library的狀況, Line 21也會出現多餘的method運用, 請注意.
 * 2. 我覺得沒什麼太大問題, 只是有時候會少了一點東西挺可惜的, 但觀念看起來還不錯, 也有用到物件陣列的方法!
 * */


//多餘import
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GradeAnalyzertester {
	public static void main(String args[]) {
		int a = 0;
		GradeAnalyzer myGradeAnalyzer = new GradeAnalyzer();
		while (true) {
			String input = JOptionPane.showInputDialog(null, "請輸入成績(輸入Q會結束程式)");

			// 你寫了兩個完全相同的method判斷.
			if (input.equalsIgnoreCase("Q") || input.equalsIgnoreCase("Q"))
				break;

			else
				// 使用者不一定都會乖乖地輸入, 是不是要做一些例外處理呢? -2
				a = Integer.parseInt(input);

			myGradeAnalyzer.addGrade(a);
		}
		// 沒有檢查個數是否<2, -2
		myGradeAnalyzer.analyzeGrades(a);
		System.out.println("You entered " + myGradeAnalyzer.CntUserinput
				+ " You entered valid grades from 0 to 110. Invalid grades are ignored!");
		System.out.println("The average = " + myGradeAnalyzer.AVG + "with a standard deviation =" + myGradeAnalyzer.SD);
		System.out.println(myGradeAnalyzer.toString());

	}

}
