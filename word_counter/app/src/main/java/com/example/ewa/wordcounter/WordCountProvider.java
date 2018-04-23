package com.example.ewa.wordcounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordCountProvider {

    public String getWordCount(String text) {
        String[] separatedWords = text.split(" ");
        return String.valueOf(separatedWords.length);
    }

    public String getWordHash(String text) {
        String[] separatedWords = text.split(" ");
        HashMap<String, Integer> wordHash = new HashMap();

        for (String word:separatedWords) {

            String wordLowerCase = word.toLowerCase();

            if (!wordHash.containsKey(wordLowerCase)) {
                wordHash.put(wordLowerCase, 0);
            }
            int value = (int) wordHash.get(wordLowerCase);
            wordHash.put(wordLowerCase, value + 1);
        }

        String result = "";

        Map<String, Integer> map = wordHash;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result += (entry.getKey() + ": " + entry.getValue() + "\n");
        }


        return result;
    }

}
