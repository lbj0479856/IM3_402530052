/*
 * [A]100
 * [TA's Advise]
 * 1. ����ɮ׳����h�l�ޥ�library�����p, Line 21�]�|�X�{�h�l��method�B��, �Ъ`�N.
 * 2. ��ı�o�S����Ӥj���D, �u�O���ɭԷ|�֤F�@�I�F�讼�i����, ���[���ݰ_���٤���, �]���Ψ쪫��}�C����k!
 * */


//�h�limport
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GradeAnalyzertester {
	public static void main(String args[]) {
		int a = 0;
		GradeAnalyzer myGradeAnalyzer = new GradeAnalyzer();
		while (true) {
			String input = JOptionPane.showInputDialog(null, "�п�J���Z(��JQ�|�����{��)");

			// �A�g�F��ӧ����ۦP��method�P�_.
			if (input.equalsIgnoreCase("Q") || input.equalsIgnoreCase("Q"))
				break;

			else
				// �ϥΪ̤��@�w���|�ĨĦa��J, �O���O�n���@�Ǩҥ~�B�z�O? -2
				a = Integer.parseInt(input);

			myGradeAnalyzer.addGrade(a);
		}
		// �S���ˬd�ӼƬO�_<2, -2
		myGradeAnalyzer.analyzeGrades(a);
		System.out.println("You entered " + myGradeAnalyzer.CntUserinput
				+ " You entered valid grades from 0 to 110. Invalid grades are ignored!");
		System.out.println("The average = " + myGradeAnalyzer.AVG + "with a standard deviation =" + myGradeAnalyzer.SD);
		System.out.println(myGradeAnalyzer.toString());

	}

}
