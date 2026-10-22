import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class setTests {

	// -------core set---------

	@Test
	void setAddValidNumber() {
		Set a = new Set(10);
		a.add(3);
		assertTrue(a.has(3));
	}

	@Test
	void setAddInvalidNumber() {
		Set a = new Set(10);

		a.add(1);
		assertTrue(a.has(1));

		a.add(-1);
		a.add(10);

		assertFalse(a.has(-1));
		assertFalse(a.has(10));
	}

	@Test
	void setRemoveNumber() {
		Set a = new Set(10);
		a.add(1);
		a.add(2);
		a.add(3);

		a.remove(2);
		assertTrue(a.has(1));
		assertFalse(a.has(2));
		assertTrue(a.has(3));
	}

	@Test
	void setHasReturnsTrue() {
		Set a = new Set(10);
		a.add(3);
		assertTrue(a.has(3));
	}

	@Test
	void setHasReturnsFalse() {
		Set a = new Set(10);
		a.add(3);
		assertFalse(a.has(4));
	}

	@Test
	void setCounts() {
		Set a = new Set(10);

		a.add(3);

		assertEquals(1.0, a.counts(3));
		assertEquals(0.0, a.counts(4));
	}

	@Test
	void setComplement() {
		Set a = new Set(10);

		a.add(0);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);

		Set result = a.complement();
		assertTrue(result.has(5));
		assertTrue(result.has(6));
		assertTrue(result.has(7));
		assertTrue(result.has(8));
		assertTrue(result.has(9));

		assertFalse(result.has(0));
		assertFalse(result.has(1));
		assertFalse(result.has(2));
		assertFalse(result.has(3));
		assertFalse(result.has(4));
	}

	@Test
	void setUnion() {
		Set a = new Set(10);
		Set ab = new Set(10);

		a.add(0);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);

		ab.add(1);
		ab.add(3);
		ab.add(4);
		ab.add(5);

		Set result = a.union(ab);
		assertTrue(result.has(0));
		assertTrue(result.has(1));
		assertTrue(result.has(2));
		assertTrue(result.has(3));
		assertTrue(result.has(4));
		assertTrue(result.has(5));
	}

	@Test
	void setIntersection() {
		Set a = new Set(10);
		Set ab = new Set(10);

		a.add(0);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);

		ab.add(1);
		ab.add(3);
		ab.add(4);
		ab.add(5);

		Set result = a.inter(ab);
		assertTrue(result.has(1));
		assertTrue(result.has(3));
		assertTrue(result.has(4));

		assertFalse(result.has(0));
		assertFalse(result.has(2));
		assertFalse(result.has(5));
	}

	@Test
	void setDifference() {
		Set a = new Set(10);
		Set ab = new Set(10);

		a.add(0);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);

		ab.add(1);
		ab.add(3);
		ab.add(4);
		ab.add(5);

		Set result = a.diff(ab);
		assertFalse(result.has(1));
		assertFalse(result.has(3));
		assertFalse(result.has(4));
		assertFalse(result.has(5));

		assertTrue(result.has(0));
		assertTrue(result.has(2));
	}

	@Test
	void setSymmetric() {
		Set a = new Set(10);
		Set ab = new Set(10);

		a.add(0);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);

		ab.add(1);
		ab.add(3);
		ab.add(4);
		ab.add(5);

		Set result = a.symmetric(ab);
		assertFalse(result.has(1));
		assertFalse(result.has(3));
		assertFalse(result.has(4));

		assertTrue(result.has(0));
		assertTrue(result.has(2));
		assertTrue(result.has(5));
	}

	@Test
	void setBits() {
		Set a = new Set(10);

		a.add(1);
		a.add(3);
		a.add(5);

		assertEquals("[ 0  1  0  1  0  1  0  0  0  0 ]", a.bits());
	}

	// -------multiset--------------------------
	@Test
	void multisetWithDuplicates() {
		Multiset a = new Multiset(10);

		a.add(3);
		a.add(3);
		a.add(3);

		assertEquals(3, a.counts(3));
	}

	@Test
	void multisetAddValidNumber() {
		Multiset a = new Multiset(10);
		a.add(3);
		assertTrue(a.has(3));
	}

	@Test
	void multisetAddInvalidNumber() {
		Multiset a = new Multiset(10);

		a.add(1);
		assertTrue(a.has(1));

		a.add(-1);
		a.add(10);

		assertFalse(a.has(-1));
		assertFalse(a.has(10));
	}

	@Test
	void multisetTakeNumber() {
		Multiset a = new Multiset(10);
		a.add(2);
		a.add(2);
		a.add(2);

		a.take(2);

		assertEquals(2.0, a.counts(2));
	}
	
	@Test
	void multisetTakeUntilEmpty() {
	    Multiset a = new Multiset(10);

	    a.add(2);
	    a.add(2);

	    a.take(2);
	    assertEquals(1.0, a.counts(2));

	    a.take(2);
	    assertEquals(0.0, a.counts(2));
	}

	@Test
	void multisetHasReturnsTrue() {
		Multiset a = new Multiset(10);
		a.add(3);
		assertTrue(a.has(3));
	}

	@Test
	void multisetHasReturnsFalse() {
		Multiset a = new Multiset(10);
		a.add(3);
		assertFalse(a.has(4));
	}

	@Test
	void multisetCounts() {
		Multiset a = new Multiset(10);

		a.add(3);

		assertEquals(1.0, a.counts(3));
		assertEquals(0.0, a.counts(4));
	}

	@Test
	void multisetUnion() {
		Multiset a = new Multiset(10);
		Multiset ab = new Multiset(10);

		a.add(1);
		a.add(1);
		a.add(1);

		ab.add(1);
		ab.add(1);

		Multiset result = a.union(ab);

		assertEquals(3, result.counts(1));
	}

	@Test
	void multisetIntersection() {
		Multiset a = new Multiset(10);
		Multiset b = new Multiset(10);

		a.add(1);
		a.add(1);
		a.add(1);

		b.add(1);
		b.add(1);

		Multiset result = a.inter(b);

		assertEquals(2, result.counts(1));
	}

	@Test
	void multisetDifference() {
		Multiset a = new Multiset(10);
		Multiset ab = new Multiset(10);

		a.add(1);
		a.add(1);
		a.add(1);

		ab.add(1);

		Multiset result = a.diff(ab);

		assertEquals(2, result.counts(1));
	}

	@Test
	void multisetSum() {
		Multiset a = new Multiset(10);
		Multiset ab = new Multiset(10);

		a.add(1);
		a.add(1);
		a.add(1);

		ab.add(1);
		ab.add(1);

		Multiset result = a.sum(ab);

		assertEquals(5, result.counts(1));

	}

	// -------fuzzyset---------
	@Test
	void fuzzysetComplement() {
		FuzzySet a = new FuzzySet(10);

		a.add(3, 0.7);
		a.add(1, 1.0);

		FuzzySet result = a.complement();

		assertEquals(0.3, result.counts(3), 0.000001);
		assertEquals(0.0, result.counts(1), 0.000001);
		assertEquals(1.0, result.counts(9), 0.000001);
	}

	@Test
	void fuzzysetDefaultCount() {
		FuzzySet a = new FuzzySet(10);

		assertEquals(0.0, a.counts(3));
	}

	@Test
	void fuzzysetAddDegreeNumber() {
		FuzzySet a = new FuzzySet(10);
		a.add(3, 0.7);
		assertEquals(0.7, a.counts(3));
	}

	@Test
	void fuzzysetInvalidNegativeDegree() {
	    FuzzySet a = new FuzzySet(10);

	    a.add(3, -0.5);

	    assertEquals(0.0, a.counts(3));
	}
	
	@Test
	void fuzzysetInvalidNumber() {
		FuzzySet a = new FuzzySet(10);

		a.add(1);
		assertTrue(a.has(1));

		a.add(-1);
		a.add(10);

		assertFalse(a.has(-1));
		assertFalse(a.has(10));
	}
	
	@Test
	void fuzzysetInvalidDegree() {
	    FuzzySet a = new FuzzySet(10);

	    a.add(3, 1.5);

	    assertEquals(0.0, a.counts(3));
	}

	@Test
	void fuzzysetHasReturnsTrue() {
		FuzzySet a = new FuzzySet(10);
		a.add(3);
		assertTrue(a.has(3));
	}

	@Test
	void fuzzysetHasReturnsFalse() {
		FuzzySet a = new FuzzySet(10);
		a.add(3);
		assertFalse(a.has(4));
	}
	
	@Test
	void fuzzysetZeroDegreeHasFalse() {
	    FuzzySet a = new FuzzySet(10);

	    a.add(3, 0.0);

	    assertFalse(a.has(3));
	}

	@Test
	void fuzzysetCounts() {
		FuzzySet a = new FuzzySet(10);

		a.add(3);

		assertEquals(1.0, a.counts(3));
		assertEquals(0.0, a.counts(4));
	}

	@Test
	void fuzzysetUnion() {
		FuzzySet a = new FuzzySet(10);
	    FuzzySet ab = new FuzzySet(10);

	    a.add(3, 0.4);
	    ab.add(3, 0.8);

	    FuzzySet result = a.union(ab);

	    assertEquals(0.8, result.counts(3));
	}

	@Test
	void fuzzysetIntersection() {
		FuzzySet a = new FuzzySet(10);
		FuzzySet ab = new FuzzySet(10);

		a.add(3, 0.4);
	    ab.add(3, 0.8);

	    FuzzySet result = a.inter(ab);

	    assertEquals(0.4, result.counts(3));
	}

	@Test
	void fuzzysetVerySmallDegree() {
	    FuzzySet a = new FuzzySet(10);

	    a.add(3, 0.0001);

	    assertEquals(0.0001, a.counts(3), 0.000001);
	}
}
