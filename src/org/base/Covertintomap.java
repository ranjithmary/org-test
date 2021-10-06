package org.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sun.util.resources.cldr.ext.TimeZoneNames_en_ZA;

public class Covertintomap {

	public static void main(String[] args) {
		
		int z[] = new int [5];
		z[0] = 10;
		z[1]=20;
		z[2]=30;
		z[3]=40;
		z[4]=50;
		
		
		System.out.println(z[0]);
		
	System.out.println("************************");	
		
		List<Integer> k = new ArrayList ();
k.add(z[0]);
k.add(z[1]);
k.add(z[2]);
k.add(z[3]);
k.add(z[4]);

System.out.println(k);

for (Integer p : k) {
	
	System.out.println(p);
	
	System.out.println(" Set *************");
	
	Set<Integer> m =new LinkedHashSet<>();
	m.addAll(k);
	for (Integer n : k) {
		System.out.println(n);
		
		System.out.println(" map ******************");	
	Map<Integer, Integer> q = new LinkedHashMap();
	
	Integer put = q.put(n, p);
	System.out.println(put);
	
	
		Collection<Integer> values = q.values();
		System.out.println(values);
		 
		for (Integer integer : k) {
			System.out.println(integer);
			
		}
		
	}
	
	
	}
}
	}


