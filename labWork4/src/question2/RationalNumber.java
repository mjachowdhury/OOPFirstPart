package question2;

public class RationalNumber {
	int numerator;
	int denominator;

	public RationalNumber(){
		numerator = 1;
		denominator = 1;
	}
	
	public RationalNumber(int x, int y) {
		numerator = x; // The numerator
		denominator = y; // The denominator
	}

	public String toString() {
		return "(" + numerator + "/" + denominator + ")";
	}

	/*
	 * public RatNumber add(RatNumber a) { RatNumber result; result = new
	 * RatNumber(0,0); result.num = num * a.den + a.num * den; result.den = den
	 * * a.den; return result; }
	 */

	/*
	 * public RatNumber add(RatNumber a) { RatNumber result; result = new
	 * RatNumber( num * a.den + a.num * den, den * a.den ); return result; }
	 */

	public RationalNumber add(RationalNumber a) {
		return new RationalNumber(numerator * a.denominator + a.numerator * denominator, denominator * a.denominator);
	}

	public RationalNumber substract(RationalNumber a) {
		return new RationalNumber(numerator * a.denominator - a.numerator * denominator, denominator * a.denominator);
	}

	public RationalNumber multiply(RationalNumber a) {
		return new RationalNumber(numerator * a.numerator, denominator * a.denominator);
	}

	public RationalNumber division(RationalNumber a) {
		return multiply(a.reciprocal());
	}

	public RationalNumber reciprocal() {
		return new RationalNumber(denominator, numerator);
	}
}