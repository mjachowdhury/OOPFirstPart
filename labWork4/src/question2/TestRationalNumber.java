package question2;

public class TestRationalNumber {
	static public void main(String args[]) {
		System.out.println("==========Addition===============");
		RationalNumber a, b, c;

		a = new RationalNumber(2, 2);
		b = new RationalNumber(2, 3);

		c = a.add(b);
		System.out.println(a + " + " + b + " = " + c);
		System.out.println();

		System.out.println("==========Substraction============");
		RationalNumber d, e, f;

		d = new RationalNumber(2, 3);
		e = new RationalNumber(1, 8);

		f = d.substract(e);

		System.out.println(d + " - " + e + " = " + f);
		System.out.println();

		System.out.println("=========Multiplication============");
		RationalNumber g, h, i;

		g = new RationalNumber(5, 11);
		h = new RationalNumber(2, 7);

		i = g.multiply(h);

		System.out.println(g + " * " + h + " = " + i);
		System.out.println();

		System.out.println("=========Division==================");
		RationalNumber j, k, l;

		j = new RationalNumber(9, 13);
		k = new RationalNumber(3, 12);

		l = j.division(k);

		System.out.println(j + " / " + k + " = " + l);
	}
}