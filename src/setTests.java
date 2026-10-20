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

		Set expected = new Set(10);
		expected.add(1);
		expected.add(3);

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

	// test bits

	// -------multiset---------
	Multiset b = new Multiset(10);

	// -------fuzzyset---------
	FuzzySet c = new FuzzySet(10);

	// test super small numbers

}
