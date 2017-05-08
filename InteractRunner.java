import java.util.Scanner;
/**
Класс для запуска калькулятора с поддержкой ввода от пользователя
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
				System.out.println("Введите первое число: ");
				String S1 = reader.next();
				System.out.println("Введите второе число: ");
				String S2 = reader.next();
				calc.add(Integer.valueOf(S1), Integer.valueOf(S2));
				System.out.println("Сумма " + calc.getResult());
				calc.cleanResult();
				System.out.println("Выход: yes/no");
				exit = reader.next();
			}

		}
		
		finally
		{
			reader.close();
		}
	}
}