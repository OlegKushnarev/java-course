/**
����� ��� ������� ������������ � �����������
*/
public class ArgRunner
{
	public static void main(String [] arg)
	{
		System.out.println("calculate...");
		if (arg.length == 2)
		{
			int S1 = Integer.valueOf(arg[0]);
			int S2 = Integer.valueOf(arg[1]);
			Calculator calc = new Calculator();
			calc.add(S1, S2);
			System.out.println("����� " + calc.getResult());
		}
		else
		{
			System.out.println("������� 2 �����");
		}
	}
}