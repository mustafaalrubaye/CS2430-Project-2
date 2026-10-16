
public class FuzzySet implements SetInterface {

	double[] a;
	int n;
	
	FuzzySet(int num){
		n = num;
		a = new double[num];
	}
	
	
	@Override
	public void add(int num) {
		add(num, 1.0);
		
	}

	public void add(int num, double ele) {
		if( ele < 0 || ele > 1) {
			System.out.println("the degree has to be in between 0.0 and 1.0 only");
			return;
		}
		else if(num>= 0 && num < n) {
			a[num] = ele;
		}
	}
	@Override
	public double counts(int num) {
		if(num <0 || num>= n) {
		return 0.0;
		}else {
		return a[num];
		}
	}

	@Override
	public boolean has(int num) {
		if (counts(num) > 0) {
		return true;
	} else {
		return false;
	 }
	}

	public FuzzySet Complement() {
		FuzzySet fsc = new FuzzySet(n);
		for(int i = 0; i < n; i++) {
			fsc.a[i] = 1.0 - counts(i);
		}
		return fsc;
	}
	
	
	
	public FuzzySet union(FuzzySet z) {
		FuzzySet fsu = new FuzzySet(n);
		for(int i = 0; i < n; i++) {
			if(counts (i) > z.counts(i))
				fsu.a[i] = counts(i);
		else fsu.a[i] = z.counts(i);
			
			
		}
		return fsu;
	}
	
	
	
	public FuzzySet inter(FuzzySet z) {
		FuzzySet fsi = new FuzzySet(n);
		for(int i = 0; i < n; i++) {
			if(counts(i) < z.counts(i))
				fsi.a[i] = counts(i);
			else fsi.a[i] = z.counts(i);
			
		}
		return fsi;
	}
	
	
	
	public String toString() {
		String s = "{";

		for(int i = 0; i < n; i++) {
			if(a[i] > 0.0) {
				s = s + i + "/" + a[i] + " ";
			}
		}
		s = s + "}";
		return s;
	}
	
}
	
