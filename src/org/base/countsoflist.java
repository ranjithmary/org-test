package org.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class countsoflist {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList();
		
		li.add(10);
		li.add(20);
		li.add(10);
		li.add(40);
		li.add(50);
		
		System.out.println(li);
		
		
		int frequency1 = Collections.frequency(li,10);
		System.out.println("number of times " +frequency1);
		
	
	}

}
