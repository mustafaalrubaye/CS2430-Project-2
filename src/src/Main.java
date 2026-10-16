
public class Main {
    public static void main(String[] args) {
        
    	
    	int size = 10;// our universe 
    	System.out.println("\n======basic Sets======");
    	Set a = new Set(10);
    	Set b = new Set(10);
    	
    	
    	// this is just the printing part we are basically doing the same thing adding/putting in numbers to print them into a set
    	a.add(0);
    	a.add(1);
    	a.add(3);
    	a.add(4);
    	a.add(8);
    	b.add(1);
    	b.add(2);
    	b.add(5);
    	b.add(6);
    	b.add(9);

        
    	System.out.println("A = " + a);
    	System.out.println("B = " + a);
    	System.out.println("A bits = " + a.bits());
    	System.out.println("B  bits = " + b.bits());
    	System.out.println("A ∪ B " + a.union(b));
    	System.out.println("A ∩ B " + a.inter(b));
    	System.out.println("A − B " + a.diff(b));
    	System.out.println("A ⊕ B " + a.symmetric(b));

    	System.out.println("\n======Multiset Sets======");
    	Multiset ma = new Multiset(size);
    	Multiset mb = new Multiset(size);
    	ma.add(2,3);
    	ma.add(8,9);
    	ma.add(5,4);
    	ma.add(1,2);
    	mb.add(1, 3); 
        mb.add(2, 1); 
        mb.add(7, 6);
        
        System.out.println("First Multiset = " + ma);
        System.out.println("Second Multiset = " + mb);
    	System.out.println("M1 ∪ M2 " + ma.union(mb));
       	System.out.println("M1 ∩ M2 " + ma.inter(mb));
    	System.out.println("M1 + M2 " + ma.sum(mb));
    	System.out.println("M1 − M2 " + ma.diff(mb));
    }
}

