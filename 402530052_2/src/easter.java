
/*
 * [B]80
 * [TA's Advise]
 * 1.�D�بèS���n�D�n�gScanner, �Ш̷��D�حn�D�@���g, �Y����@�~�Y�Q�HScanner�i�漶�g�аȥ��g�ҥ~�B�z, ���ͨҥ~���B�z�N�H�{�����~�i�榩��.
 * 2.�å�����javadoc, ��������5��.
 * 3.��@���t��k���~(�D�حn�D��Gauss, ���t��k��Anonymous Gregorian, ���űqB�}�l�p��.
 */
import java.util.Scanner;

public class easter {

	public static void main(String arg[])

	{
		int aYear;
		Scanner Scanner = new Scanner(System.in);
		System.out.print("��J�A�Q���D���_���`���(2001 or 2012)");
		aYear = Scanner.nextInt();

		// �����D�ؤ��ݭn�ϥ�new object, �ȶ��z�Lstatic�h�I�smethod, �^�ǭȦA�L�X.
		eastertest myeastertest = new eastertest();
		eastertest.calculateEaster(aYear);

	}

}
