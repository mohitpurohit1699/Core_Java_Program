package ajp_java;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add elements to the TreeMap
        treeMap.put("One", 1);
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);

        // Remove and return the entry associated with the key "Two"
        Integer removedValue = treeMap.remove("Two");
        System.out.println("Removed value: " + removedValue);

        // Check if the entry {Three=3} is removed
        boolean isEntryRemoved = !treeMap.containsKey("Three");
        System.out.println("Is the entry {Three=3} removed? " + isEntryRemoved);

        // Print the updated TreeMap
        System.out.println("Updated TreeMap: " + treeMap);
    }
}