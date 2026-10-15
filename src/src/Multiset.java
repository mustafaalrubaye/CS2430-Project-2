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

}