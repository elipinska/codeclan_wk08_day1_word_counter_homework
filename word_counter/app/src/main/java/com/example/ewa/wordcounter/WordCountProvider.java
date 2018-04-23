package com.example.ewa.wordcounter;

import java.util.ArrayList;

public class WordCountProvider {

    public String getWordCount(String text) {
        String[] separatedWords = text.split(" ");
        return String.valueOf(separatedWords.length);
    }

}
