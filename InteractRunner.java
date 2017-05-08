import java.util.Scanner;
/**
����� ��� ������� ������������ � ���������� ����� �� ������������
*/
public class InteractRunner
{
	public static void main(String [] arg)
	{
		Scanner reader = new Scanner(System.in);
		try
		{
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes"))
			{
				System.out.println("������� ������ �����: ");
				String S1 = reader.next();
				System.out.println("������� ������ �����: ");
				String S2 = reader.next();
				calc.add(Integer.valueOf(S1), Integer.valueOf(S2));
				System.out.println("����� " + calc.getResult());
				calc.cleanResult();
				System.out.println("�����: yes/no");
				exit = reader.next();
			}

		}
		
		finally
		{
			reader.close();
		}
	}
}