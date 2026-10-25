/**
 * @author: Mustafa Alrubaye, Owen Francy, Helen Le.
 * Course: CS 2430
 * Term: Fall 2026
 * Instructor: Jon McGowan
 * Programming Project 2: Set Operations
 */

public interface SetInterface {
 void add(int num); // this will be a way for the class to add a number, not add as in 1+1 but just have them added to the set
//this will be used to return a number (changed when the change request changed it it was int, now it's double)
 double counts(int num);
 boolean has(int num); // this will be used to make sure the number does exist
}
