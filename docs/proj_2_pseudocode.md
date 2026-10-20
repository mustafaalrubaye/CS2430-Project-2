
INTERFACE SetInterface
	METHODS 
	add(number)
	has(number) 
	counts(number)
=====END====





====Set.java==== 
CLASS Set // sets remove duplicates 

	CONSTRUCTOR 
Check for size.
Creates the array.
	HAS METHOD 
Check if the array is true 
If false, then it is not in our set; return false.
If true, return that it is true and go to the PRINT method.

COUNTS METHOD
Return the values of that exact index.
	Complement METHOD
Make a new set to loop through the universe.
Check if the set doesn't have it.
If not, add it to the new set.
Then return.
	UNION METHOD
Make a new set
Loop through the universe.
Check if one of the first array or the 2nd array has that number.
	If one does have it, add it to the new set.
	Then return the new set.
 
	INTERSECTION METHOD 
Make a new set.
Loop through the universe.
Check if both arrays have the same number.
If they both do, add it to the set.
	

DIFFERENCE METHOD 
Make a new set.
Loop through the universe range.
Bind it in a for loop.
Have an if statement to check if the current array that it has has it.
If the other set does not, then add it to the new set.
	
SYMMETRIC METHOD
Make a new set.
Loop through the universe.
Bind it to a for loop that keeps it within range.
Have it check the current array and whether it's true or false.
Then check if the other array is different.
If yes, add it to the new set.
If no, go until you loop through the universe.

PRINT METHOD 
Have it run through the whole thing.
Make brackets.
And help with printing. 

BITS PRINT METHOD
Should check if the element is there or not.
If there, give a 1.
If not, give a 0.
Have the 1s and 0s be boxed.

====END====



====multiset.java====
CLASS multiset
//this class focuses on repeated numbers and how many times it repeats

	CONSTRUCTOR
Need the size.
Need an int array.
	HAS METHOD
If the value is more than 0 at the index, return true.
If not, return false.
	COUNTS METHOD 
Return how many of that integer there are.
	
DIFFRENCE
Create a new set and loop it through the universe.
Subtract the B set's count from the A set's count; no negative.
And then have the result be stored in a new multiset, then return it until you're done.
SUM METHOD 
Do the same as the subtract method: make a new multiset, loop through the universe.
Add the count of the first set to the other set's count and then get your results back.
Return and repeat. 
INTERSECTION METHOD
Make a new multiset. 
Compare this set with other sets.
Whichever set has the minimum count, pick it and store it.
Return the multiset.
UNION METHOD  
New multiset and loop through the universe.
Compare which has the largest count and store it.
Then return a new set.
====END=====




=====fuzzyset.java====
CLASS fuzzyset 
// focus on degrees from 0.0 to 1.0 (everything before implementing is still changeable)
	CONSTRUCTOR
We need to save the size/range of the universe. 
Create a new double array because fuzzy sets use degrees and decimals.
	COUNTS METHOD
Return the number of decimals for that index.
	Complement METHOD 
Make a new fuzzy set and loop through the universe.
Subtract 1.0 - count so we can get the new decimal in the new fuzzy set.
Store it and return 
	Union METHOD 
Make a new fuzzy set and loop through the universe.
Compare the current degree of this set with the other set, so fuzzy set A compares it to fuzzy set B.
The one with the higher decimal gets stored in a new fuzzy set.
Return the new set.
Intersection METHOD
Make a new fuzzy set; loop through the universe.
Basically like the union, but just find out who has the lower decimal and store that one.
Then return it.
	ToString method 
Loop through the universe; if we have a number higher than 0.0.
Then also include its decimal degree in the string.
And return it.


======END======





====main.java====
Make the Size of the universe(n=10).
Make test cases.
Add the test cases. //do not add them as in 1+1, but as in insert them.
Print out.
And include edge cases.
=====END=====
