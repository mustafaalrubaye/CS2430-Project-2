/**
 * 
 */
public class Main {
    public static void main(String[] args) {
        
    	
    	int size = 10;// our universe 
    	System.out.println("\n======basic Sets======");
    	Set a = new Set(10);
    	Set b = new Set(10);
    	
    	
    	// this is just the printing part; we are basically doing the same thing adding/putting numbers into a set to print them
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
    	System.out.println("\nA = " + a);
    	System.out.println("\nB = " + b);
    	System.out.println("\nA bits = " + a.bits());
    	System.out.println("\nB  bits = " + b.bits());
    	System.out.println("\nNot(A) = " + a.complement() + "\nNot(A) bits =" + a.complement().bits());
    	System.out.println("\nA ∪ B = "  + a.union(b) + "\nA ∪ B bits = " + a.union(b).bits());
    	System.out.println("\nA ∩ B = " + a.inter(b) + "\nA ∩ B bits = " + a.inter(b).bits());
    	System.out.println("\nA − B = " + a.diff(b) + "\nA − B bits = " + a.diff(b).bits());
    	System.out.println("\nA ⊕ B = " + a.symmetric(b) + "\nA ⊕ B bits = " + a.symmetric(b).bits());

    	System.out.println("\n\n======Multiset Sets======");
    	Multiset ma = new Multiset(size);
    	Multiset mb = new Multiset(size);
    	ma.add(2,3);
    	ma.add(8,9);
    	ma.add(5,4);
    	ma.add(1,2);
    	
    	mb.add(1, 3); 
        mb.add(2, 1); 
        mb.add(7, 6);
        mb.add(0,7);
        
        System.out.println("\nFirst Multiset = " + ma);
        System.out.println("\nSecond Multiset = " + mb);
    	System.out.println("\nMultiset union (A ∪ B): " + ma.union(mb));
       	System.out.println("\nMultiset intersection (A ∩ B): " + ma.inter(mb));
    	System.out.println("\nMultiset sum (A + B): " + ma.sum(mb));
    	System.out.println("\nMultiset diffrence (A - B): " + ma.diff(mb));
    	
    	System.out.println("\n\n======fuzzy======");
    	FuzzySet f = new FuzzySet(size);
       	FuzzySet g = new FuzzySet(size);
       	f.add(9, 0.10);
       	f.add(2, 0.20);
       	f.add(3, 0.30);
       	f.add(4, 0.40);
       	g.add(5, 0.50);
       	g.add(2, 0.60);
       	g.add(7, 0.70);
       	g.add(4, 0.90);
        System.out.println("\nFirst FuzzySet = " + f);
        System.out.println("\nsecond FuzzySet = " + g);
        System.out.println(" \n1.0 − μA(x)  (Complement or negation) = \n" + f.complement());
        System.out.println(" \nmax(μA(x), μB(x)) (Union) = " + f.union(g));
        System.out.println("\nmin(μA(x), μB(x))  (Intersection) = " + f.inter(g));
    }
}

