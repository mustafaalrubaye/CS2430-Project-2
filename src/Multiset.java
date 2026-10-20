/**
 * Creates a set of numbers with number duplicates and counts the number of times
 * an element appears in the set.
 */


public class Multiset implements SetInterface{


	int[] a;// array to store the count for the numbers 
	int n;
	
	Multiset(int num){
		n = num;
		a = new int[num];// makes a new integer array
	}
	
	
	/*
	 * this is for if you want to copy a number then you can use this method
	 * to make 1 copy of it
	 */
	@Override
	public void add(int num) {
		add(num, 1);
		
	}
	/*
	 * This checks if the numbers are in the target range
	 * and also checks if the element is more than 0
	 * it'll go to the index of a and adds ele to the count
	 */
	public void add(int num, int ele) {
		if( num >= 0 && num < n && ele > 0)
			a[num] = a[num] + ele;
	
	}
	/*
	 * This will take one away from the count if it's > 0
	 */
	public void take(int num) {
		if (get(num) > 0 ) {
			a[num]--;
		}
	}
	/*
	 * checks each number if one is out of range return a 0
	 * if not return the stored num
	 */
		 int get(int num) {
			if(num < 0 || num >= n) {
				return 0;
				}
		return a[num];
	}
		 
		 /*
		  * this finds the integer count
		  * and makes it into a decimal because of the double
		  */

	@Override
	public double counts(int num) {
		double d = get(num);
		return d;
		

	}
	/*
	 * this looks through and sees if the count is greater then 0
	 * then it'll return true and if not then return false
	 */

	@Override
	public boolean has(int num) {
		if (get(num) > 0) {
			return true;
		} else {
		return false;
		}
	}
	
	/*
	 * Creates a new Multiset
	 * loops through the Universe 
	 * we compare the count between this and array and another array
	 * if one is higher, it puts it into the new set
	 */
	
	public Multiset union(Multiset y) {
		Multiset msu = new Multiset(n);
		for(int i = 0; i < n; i++) {// runs through the universe 
			if(get(i) > y.get(i)) {
				msu.a[i] = get(i);
			}else msu.a[i] = y.get(i);
			
		}
			return msu;
		}
	/*
	 * makes a new set, loops through the universe and then compares 2 arrays 
	 * it picks whichever count is lower and then puts it into the new set 
	 */
	public Multiset inter(Multiset y) {
		Multiset msi = new Multiset(n);
			for(int i = 0; i < n; i++) {
				if(get(i) < y.get(i)) {
					msi.a[i] = get(i);
			}else {
				msi.a[i] = y.get(i);
			}
			}
			
			return msi;
	}
	/*
	 * makes a new set that loops through the universe 
	 * we subtract array 1 from array 2, and we put that into our new set
	 */
	
	
	public Multiset diff(Multiset y) {
		Multiset msd = new Multiset(n);
			for (int i = 0; i < n; i++) {
				int min = get(i) - y.get(i);
				if(min < 0)
					min = 0;
					msd.a[i] = min;
			}
			
			return msd;
	}
	
	/*
	 * it's the same as the difference
	 * it just adds and doesn't subtract; it also loops through 
	 * then we add it to a new set
	 */
	
	public Multiset sum(Multiset y) {
		Multiset msum = new Multiset(n);
		for (int i = 0; i < n; i++) {
			msum.a[i] = get(i) + y.get(i);
		}
			
			return msum;
	}
	//For printing, this was not my work, and I did look up the inspiration for how to use this
	public String toString() {
		String s = "{ ";
		for(int i = 0; i < n; i++) {
			if(a[i] > 0) {
				s = s + i + "x" + a[i] + " ";
			}
		}
		s = s + "}";
		return s;
	}
}





