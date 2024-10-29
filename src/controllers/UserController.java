
package controllers;

import java.util.Hashtable;

/**
 * The UserController class provides methods to manage user-related operations.
 * 
 * <p>
 * This class contains a method to display a hashtable of user names and their
 * corresponding ages.
 * </p>
 * 
 * <p>
 * The {@code show} method creates a hashtable with predefined user names and
 * ages, prints it to the console, and returns it.
 * </p>
 * 
 * @return A hashtable containing user names as keys and their corresponding
 *         ages as values.
 */
public class UserController {
    private Hashtable<String, Integer> hashtable = new Hashtable<>();

    public Integer put(String name, int age) {
        return hashtable.put(name, age);
    }

    public Hashtable<String, Integer> show() {
        System.out.println(hashtable);
        return hashtable;
    }
}
