/**
 * @author: Mustafa Alrubaye, Owen Francy, Helen Le.
 * Course: CS 2430
 * Term: Fall 2026
 * Instructor: Jon McGowan
 * Programming Project 2: Set Operations
 */

public class FuzzySet implements SetInterface {

	double[] a;// this is for having and storing decimal numbers between 0.0 and 1.0
	int n;// the size or range

	FuzzySet(int num) {
		n = num;
		a = new double[num];
	}

	@Override
	public void add(int num) {
		add(num, 1.0);// if you have a number that isn't a decimal, we make a degree and have it set
						// to 1.0

	}

	/*
	 * we are checking if the number is valid it checks it by seeing is it in
	 * between 0 and 1.0 if it is, we save it if not, we give out a message saying
	 * the number is either too high or too low and not within our degree range and
	 * we also have to check if it is within our universe/size if both are true,
	 * then we save them
	 */
	public void add(int num, double ele) {
		if (ele < 0 || ele > 1) {
			return;
		} else if (num >= 0 && num < n) {
			a[num] = ele;
		}
	}

	/*
	 * checking if the number is within the range we gave it, so 0 and the universe
	 * if it is, we give it a number we have in our index if not, we give it a 0.0
	 */
	@Override
	public double counts(int num) {
		if (num < 0 || num >= n) {
			return 0.0;
		} else {
			return a[num];
		}
	}

	/*
	 * all we are doing is checking if count is 0 or not if it's more than 0 we say
	 * true if it's 0 we give a false
	 */
	@Override
	public boolean has(int num) {
		if (counts(num) > 0) {
			return true;
		} else {
			return false;
		}
	}

	public FuzzySet complement() {
		FuzzySet fsc = new FuzzySet(n);
		for (int i = 0; i < n; i++) {// looping through the universe
			fsc.a[i] = 1.0 - counts(i);
		}
		return fsc;
	}

	/*
	 * we loop through the universe and compare the degrees of 2 sets, whichever is
	 * higher we add it to the new set
	 */
	public FuzzySet union(FuzzySet z) {
		FuzzySet fsu = new FuzzySet(n);
		for (int i = 0; i < n; i++) {
			if (counts(i) > z.counts(i))
				fsu.a[i] = counts(i);
			else
				fsu.a[i] = z.counts(i);

		}
		return fsu;
	}

	/*
	 * this one we compare the 2 sets, and we say which one is lower; the one that's
	 * lower goes to the new set
	 */

	public FuzzySet inter(FuzzySet z) {
		FuzzySet fsi = new FuzzySet(n);
		for (int i = 0; i < n; i++) {
			if (counts(i) < z.counts(i))
				fsi.a[i] = counts(i);
			else
				fsi.a[i] = z.counts(i);

		}
		return fsi;
	}

	/*
	 * we first loop through the universe any degree that is higher than 0.0 we have
	 * it print with its decimal point
	 */

	public String toString() {
		String s = "{ ";

		for (int i = 0; i < n; i++) {
			if (a[i] > 0.0) {
				s = s + i + "/" + a[i] + " ";
			}
		}
		s = s + "}";
		return s;
	}

}
