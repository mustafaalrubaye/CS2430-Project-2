public class Set implements SetInterface{

	boolean[] a;
	int n;


	Set(int num){
		n = num;
		a = new boolean[num];
	}
	@Override
	public void add(int num) {
		if (num >= 0 && num < 0)
			a[num] = true;

	}
	public void remo(int num) {
		if(num >=0 && num < n)
			a[num] = false;
	}

	@Override
	public double counts(int num) {

		if (has(num) == true) {
			return 1.0;
		} else {
			return 0.0;
		}
	}

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
	public Set complement() {
		Set s = new Set(n);
		for(int i = 0; i < n; i++)
			if(a[i] == false) {
				s.add(i);
			}
		return s;
	}

	public Set union(Set x) {
		Set sb = new Set(n);

		return sb;
	}

	public Set inter(Set x) {
		Set sc = new Set(n);

		return sc;
	}

	public Set diff(Set x) {
		Set se = new Set(n);

		return se;
	}

	public Set symmetric(Set x) {
		Set sf = new Set(n);

		return sf;
	}


}