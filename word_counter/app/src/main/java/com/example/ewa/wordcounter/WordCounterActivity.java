package com.example.ewa.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    private EditText mainTextfieldEditText;
    private TextView answer;
    private TextView wordsCounted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        mainTextfieldEditText = findViewById(R.id.mainTextfieldEditTextID);
        answer = findViewById(R.id.answerTextViewID);
        wordsCounted = findViewById(R.id.wordsCountedTextViewID);

    }

    public void onCountWordsButtonClicked(View button) {
        String textEntered = mainTextfieldEditText.getText().toString();
        Log.d(getClass().toString(), "The text entered was: " + textEntered);
        WordCountProvider counter = new WordCountProvider();
        wordsCounted.setText("Words counted:");
        answer.setText(counter.getWordCount(mainTextfieldEditText.getText().toString()));
    }


}
