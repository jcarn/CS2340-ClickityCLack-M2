package edu.gatech.oad.antlab.person;
import java.util.Random;
import java.util.ArrayList;
import java.lang.StringBuilder;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here
		Random randGen = new Random(); // random number generator
		ArrayList charList = new ArrayList(input.length()); // ArrayList to hold characters
		for (int i = 0; i < input.length(); i++) {
			charList.add(input.charAt(i));	// add characters to the ArrayList
		}
		StringBuilder sb = new StringBuilder();
		while (charList.size() > 0) {
			int randNum = randGen.nextInt(charList.size()); // random index of the remaining ArrayList
			sb.append(charList.remove(randNum)); // remove another character to put in the StringBuilder
		}
		return new String(sb);
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
