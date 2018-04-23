package com.example.ewa.wordcounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCountProviderTest {


    @Test
    public void canCountWordsFromString() {
        WordCountProvider counter = new WordCountProvider();
        assertEquals("2", counter.getWordCount("Hello world"));
    }

    @Test
    public void getWordHash() {
        WordCountProvider counter = new WordCountProvider();
        assertEquals("name: 2\nis: 1\nMy: 2\n", counter.getWordHash("My name is My name"));
    }
}
