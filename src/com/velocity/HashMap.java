package com.velocity;

import java.util.LinkedHashMap;
import java.util.Map;



public class HashMap {

	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(200, "tanvi");
		map.put(300, "minakshi");
		map.put(400, "piyu");
		map.put(500, "mayu");
		System.out.println(map);

	}

}
