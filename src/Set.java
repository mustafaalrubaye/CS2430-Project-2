

public class Set implements SetInterface{

	/*
	 * This is used for remembering the target size
	 * as well as just to have it remember and store true/false statements 
	 */
	boolean[] a;
	int n;
	Set(int num){
		n = num;
		a = new boolean[num];
	}
	
	/*
	 * and implemented method to check if it is within the universe 
	 * if yes then a= true 
	 * if no then a= false 
	 */
	@Override
	public void add(int num) {
		if (num >= 0 && num < n)
			a[num] = true;
		
	}
	public void remove(int num) {// this is to remove them if its false 
		if(num >=0 && num < n)// checks if its between the size we gave it if not it'll be false 
			a[num] = false;
	}

	
/*
 * this checks if the first or whichever number is in the targeted boundary 
 * if its not then return false 
 * then you check a at its index if its true return true if not then return false
 */

	@Override
	public boolean has(int num) {
		if(num < 0 || num >= n) {
			return false;
		}
		if(a[num] == true) {
			return true;
		} else {
			return false;
		}
	}
	
	
		/*
		 * counts method checks the has method 
		 * if its true then it'll give a 1
		 * if not then 0
		 * this only works if its in the set boundaries 
		 */
		@Override
		public double counts(int num) {
			
			if (has(num) == true) {// checks if its true
				return 1.0;
			} else {
			return 0.0;
			}
		}
		
		/*
		 * complement method is looping through the universe/boundaries we have
		 * and checks everything that is not in the current set 
		 */
	
	public Set complement() {
		Set s = new Set(n);
		for(int i = 0; i < n; i++)// loop to checks the universe 
			if(a[i] == false) {// if false 
				s.add(i);// add it
			}
		return s;// then return until true
	}
	/*
	 * should create a new set 
	 * and count from 0 to whatever the max number(n=10)
	 */
	public Set union(Set x) {
		Set su = new Set(n);
		for(int i = 0; i < n; i++)
			if(has(i) || x.has(i))
				su.add(i);
		return su;
	}
	
	/*
	 * This only checks if both arrays have them
	 *if it'll make a new set
	 * if not, skip
	 */
	
	public Set inter(Set x) {
		Set si = new Set(n);
		for(int i = 0; i < n; i++)
			if (has(i) && x.has(i)) // checks if the first array has it and the 2nd one have it
				si.add(i);
			
		return si;
	}
	
	/*
	 * the last 2 methods are similar in that they both check if 
	 * one of the arrays has it but the other does not
	 * then you add it
	 * if the both do then skip to the next 
	 */
	
	public Set diff(Set x) {
		Set sd = new Set(n);
		for(int i = 0; i < n; i++)
			if(has(i) && x.has(i) == false)
				sd.add(i);
			
		return sd;
	}
	/*
	 * this is similar but what it does is check the universe 
	 * if the current set has it but the other one does not then keep the set
	 */
	public Set symmetric(Set x) {
		Set sy = new Set(n);
		for(int i = 0; i < n; i++)
			if(has(i) != x.has(i))// checks if there are differences with the set we have
				sy.add(i);
			
		return sy;
	}
	
	// looked up this method its just for the printing but what it does is loop through and should print 
	public String toString() {
		String s = "{ ";// creates this for the out put 
		for(int i = 0; i < n; i++) {// this loops through the universe 
			if(a[i] == true) {
				s = s + i + " ";
			}
		}
		s = s + "}";
		return s;
	}
	
	/*
	 * this bits is basically the printing but adding an if else to check if there are 
	 * elements present and gives them a 1 and if there isn't an element then we get a 0
	 * the if else statement do most of the work 
	 */
	public String bits() {
		String s = "[";// this just to make it look nicer 
		for (int i = 0; i < n; i++) {//this loops through the universe 
			if(a[i] == true) {// if its true we add 1
				s = s + " 1 ";
			}else {
				s = s +" 0 ";// if not true put a 0 
			}
		}
		s = s + "]";
		return s;// return it till we are done 
	}
	

}
