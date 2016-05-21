
//�h�limport
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

	public void addGrade(double aGrade)// �P�_����
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
			// �γ\�i�H��throw Exception�|��n, �p�G�A���ҥ~�B�z����������.
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

	// ����ı�o�o��static���I�S���n, �Q�Q�ݬ�����.
	public static boolean isValidGrade(double aGrade)// �P�_����¾�O�_�O�i�H�Ϊ�
	{
		if (aGrade <= 110 && aGrade >= 60)
			return true;

		return false;
	}

	public void analyzeGrades(double aGrade)// �p�⥭�����ܲ���
	{
		AVG = TotalNum / CntUserinput;
		for (int i = 0; i < NumScore.size(); i++) {
			SDtemp += (NumScore.get(i) - AVG) * (NumScore.get(i) - AVG);
		}
		SD = Math.round(Math.sqrt(SDtemp / CntUserinput));

	}

	public String toString()// �L�X���G
	{
		String a = "";
		for (int i = 0; i < Grade.length; i++) {
			a += Grade[i] + "\n";
		}

		return "the grade distribution is :\n\n" + a;
	}

}
