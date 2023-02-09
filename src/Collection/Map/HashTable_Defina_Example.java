package Collection.Map;
/*
The Hashtable class implements a hash table, which maps keys to values.
Any non-null object can be used as a key or as a value. To successfully store and retrieve objects from a
hashtable, the objects used as keys must implement the hashCode method and the equals method.

Features of Hashtable

It is similar to HashMap, but is synchronized.
Hashtable stores key/value pair in hash table.
In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast Enumeration.
 */

import java.util.Hashtable;

/*
HashTable Constructor=> 1.Hashtable()

 2.Hashtable(int initialCapacity): This creates a hash table that has an initial size specified by initialCapacity and
 the default load factor is 0.75.

 3.  Hashtable(int size, float fillRatio):

 4.Hashtable(Map<? extends K,? extends V> m): This creates a hash table that is initialized with the elements in m.
 */
public class HashTable_Defina_Example {

    public static void main(String args[])
    {
        // No need to mention the
        // Generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>();

        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2
                = new Hashtable<Integer, String>();

        // Inserting the Elements
        // using put() method
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");

        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
    }
}


