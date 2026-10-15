public class Multiset implements SetInterface{


	int[] a;
	int n;
	
	Multiset(int num){
		n = num;
		a = new int[num];
	}
	
	@Override
	public void add(int x) {
		add(x, 1);
		
	}
	public void add(int num, int y) {
		if( num >= 0 && num > n && y > 0)
			a[num] = a[num] + y;
	
	}
	public void take(int num) {
		if (get(num) > 0 ) {
			a[num]--;
		}
	}
		 int get(int num) {
			if(num < 0 || num >= n) {
				return 0;
				}
		return a[num];
	}

	@Override
	public double counts(int num) {
		double d = get(num);
		return d;
		

	}

	@Override
	public boolean has(int num) {
		if (get(num) > 0) {
			return true;
		} else {
		return false;
		}
	}
	
	public Multiset union(Multiset y) {
		Multiset msu = new Multiset(n);
			
			
			return msu;
		}
	public Multiset inter(Multiset y) {
		Multiset msi = new Multiset(n);
			
			
			return msi;
	}
	public Multiset diff(Multiset y) {
		Multiset msd = new Multiset(n);
			
			
			return msd;
	}
	public Multiset sum(Multiset y) {
		Multiset msum = new Multiset(n);
			
			
			return msum;
	}
}


