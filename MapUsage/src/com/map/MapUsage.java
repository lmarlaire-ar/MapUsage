package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapUsage {

	public static void main(String[] args) {


		Map<Integer, String> mapHttpErrors = new HashMap<>();
		 
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(404, "Not Found");
		mapHttpErrors.put(500, "Internal Server Error");
		 
		System.out.println(mapHttpErrors);
				
		Map<Integer, String> mapErrors = new HashMap<>(mapHttpErrors);
		mapHttpErrors.put(303, "Modified");
		
		System.out.println(mapErrors);
		System.out.println(mapErrors.get(303));
		
		mapErrors.replace(303, "Now is modified!");
		System.out.println(mapHttpErrors);
		System.out.println(mapErrors);
		
	}

}

