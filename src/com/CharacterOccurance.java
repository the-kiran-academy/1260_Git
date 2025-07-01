package com;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {

		String str = "vaibhav";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				continue;
			}
			int counter = 0;
			for (int j = i; j < str.length(); j++) {

				if (ch == str.charAt(j)) {
					counter++;
				}
			}

			map.put(ch, counter);

		}
		System.out.println(map);
	}

}
