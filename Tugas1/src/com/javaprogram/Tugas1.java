package com.javaprogram;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tugas1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
		Set<String> tree_set = new TreeSet<>();

		tree_map.put(2, "kalimat");
		tree_map.put(1, "contoh");
		tree_map.put(4, "treemap");
		tree_map.put(3, "menggunakansalah"); 
		tree_map.put(3, "menggunakan");
    		
    	
    	System.out.println("Contoh tree map = " + tree_map);
    	
    	
    	System.out.println();
    	System.out.print("contoh tree set = "); 
    	
    	tree_set.add("A");
    	tree_set.add("C");
    	tree_set.add("D");
    	tree_set.add("A");
    	tree_set.add("B");
    	tree_set.add("Z");
  
      
        for (String value : tree_set)
        System.out.print(value + ", " ); 
	}

}
