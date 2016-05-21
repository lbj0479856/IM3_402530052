
//多餘import
import javax.swing.JOptionPane;

import java.util.ArrayList;

class MyCount {
	String name;
	int cnt;

	MyCount() {
	}

	MyCount(String _name, int _cnt) {
		this.name = _name;
		this.cnt = _cnt;
	}

	public String toString() {
		return this.name + "=" + this.cnt;
	}
}

public class GradeAnalyzer {
	int CntUserinput = 0;
	double TotalNum = 0, SD = 0, AVG = 0, GetNum = 0, SDtemp = 0;
	ArrayList<Double> NumScore = new ArrayList<Double>();
	boolean Firsttime = true;
	MyCount[] Grade = new MyCount[11];

	public void addGrade(double aGrade)// 判斷等級
	{
		// Good! +2
		if (Firsttime) {
			Grade[0] = new MyCount("A+", 0);
			Grade[1] = new MyCount("A", 0);
			Grade[2] = new MyCount("A-", 0);
			Grade[3] = new MyCount("B+", 0);
			Grade[4] = new MyCount("B", 0);
			Grade[5] = new MyCount("B-", 0);
			Grade[6] = new MyCount("C+", 0);
			Grade[7] = new MyCount("C", 0);
			Grade[8] = new MyCount("C-", 0);
			Grade[9] = new MyCount("D", 0);
			Grade[10] = new MyCount("E", 0);
			Firsttime = false;
		}
		if (!isValidGrade(aGrade)) {
			// 或許可以用throw Exception會更好, 如果你有例外處理的概念的話.
			return;
		}
		NumScore.add(aGrade);
		TotalNum += aGrade;
		CntUserinput++;
		
		//Nest Structure is good!
		if (aGrade > 90) {
			if (aGrade >= 98)
				Grade[0].cnt++;
			else if (aGrade >= 92)
				Grade[1].cnt++;
			else
				Grade[2].cnt++;
		}
		if (aGrade > 80) {
			if (aGrade >= 88)
				Grade[3].cnt++;
			else if (aGrade >= 82)
				Grade[4].cnt++;
			else
				Grade[5].cnt++;
		}
		if (aGrade > 70) {
			if (aGrade >= 78)
				Grade[6].cnt++;
			else if (aGrade >= 72)
				Grade[7].cnt++;
			else
				Grade[8].cnt++;
		} else {
			if (aGrade >= 60)
				Grade[9].cnt++;
			else
				Grade[10].cnt++;
		}

	}

	// 其實我覺得這用static有點沒必要, 想想看為什麼.
	public static boolean isValidGrade(double aGrade)// 判斷給的職是否是可以用的
	{
		if (aGrade <= 110 && aGrade >= 60)
			return true;

		return false;
	}

	public void analyzeGrades(double aGrade)// 計算平均跟變異數
	{
		AVG = TotalNum / CntUserinput;
		for (int i = 0; i < NumScore.size(); i++) {
			SDtemp += (NumScore.get(i) - AVG) * (NumScore.get(i) - AVG);
		}
		SD = Math.round(Math.sqrt(SDtemp / CntUserinput));

	}

	public String toString()// 印出結果
	{
		String a = "";
		for (int i = 0; i < Grade.length; i++) {
			a += Grade[i] + "\n";
		}

		return "the grade distribution is :\n\n" + a;
	}

}
