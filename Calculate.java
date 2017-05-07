public class Calculate
{
	public static void main(String[] arg)
	{
		System.out.println("calculate...");

		int S1 = Integer.valueOf(arg[0]);
		int S2 = Integer.valueOf(arg[1]);
		int summ = S1 + S2;
		System.out.println("Сумма " + summ);

		int R1 = Integer.valueOf(arg[2]);
		int R2 = Integer.valueOf(arg[3]);
		int raz = R1 - R2;
		System.out.println("Разность " + raz);

		int U1 = Integer.valueOf(arg[4]);
		int U2 = Integer.valueOf(arg[5]);
		int pro = U1 * U2;
		System.out.println("Произведение " + pro);

		double Ch1 = Double.valueOf(arg[6]);
		double Ch2 = Double.valueOf(arg[7]);
		double ch = Ch1 / Ch2;
		System.out.println("Частное " + ch);

		int Chislo = Integer.valueOf(arg[8]);
		int Stepen = Integer.valueOf(arg[9]);
		int rez = Chislo * Chislo;
		System.out.println("Число " + Chislo + " в степени " + Stepen + " равно " + rez);
	}
}