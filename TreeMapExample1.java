package ajp_java;

import java.util.TreeMap;

public class TreeMapExample1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add elements to the TreeMap
        treeMap.put("One", 1);
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);

        // Navigate over the elements using various methods
        System.out.println("Navigating using firstEntry() and lastEntry():");
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());

        System.out.println("Navigating using headMap(), tailMap(), and subMap():");
        System.out.println(treeMap.headMap("Two"));
        System.out.println(treeMap.tailMap("Two"));
        System.out.println(treeMap.subMap("One", "Three"));

        System.out.println("Navigating using lowerEntry(), higherEntry(), floorEntry(), and ceilingEntry():");
        System.out.println(treeMap.lowerEntry("Two"));
        System.out.println(treeMap.higherEntry("Two"));
        System.out.println(treeMap.floorEntry("Two"));
        System.out.println(treeMap.ceilingEntry("Two"));
    }
}