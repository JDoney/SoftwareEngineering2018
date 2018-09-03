package edu.nd.se2018.homework.hwk1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class Question2 {

	public Question2(){}
	
	public String getMostFrequentWord(String input, String stopwords){
		String winner = null;
		int max = 0;
		List<String> ignore = Arrays.asList(stopwords.split(" "));
		String[] words = input.split(" ");
		HashMap<String, Integer> tally = new HashMap<String, Integer>();
		for(String word:words) {
			if(!ignore.contains(word)) {
				if(tally.containsKey(word)) {
					tally.put(word, tally.get(word)+1);
				}
				else {
					tally.put(word, 1);
				}
				if(tally.get(word) > max) {
					winner = word;
					max = tally.get(word);
				}
				else if(tally.get(word) == max) {
					winner = null;
				}
			}
		}
		return winner;
	}
}
