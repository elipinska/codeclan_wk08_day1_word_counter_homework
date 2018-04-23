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
            if (!wordHash.containsKey(word)) {
                wordHash.put(word, 0);
            }
            int value = (int) wordHash.get(word);
            wordHash.put(word, value + 1);
        }

        String result = "";

        Map<String, Integer> map = wordHash;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result += (entry.getKey() + ": " + entry.getValue() + "\n");
        }


        return result;
    }

}
