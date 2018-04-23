package com.example.ewa.wordcounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCountProviderTest {


    @Test
    public void canCountWordsFromString() {
        WordCountProvider counter = new WordCountProvider();
        assertEquals("2", counter.getWordCount("Hello world"));
    }

}
