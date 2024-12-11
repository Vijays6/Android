package com.vj.firstapplication;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FindMovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_movie);
        findMovie();
    }

    public void findMovie() {
        TextView textView = findViewById(R.id.movieName);

        Spinner heroesList = findViewById(R.id.heroes);

        heroesList.setOnTouchListener((v, event) -> {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    // Action when the view is touched
                    Toast.makeText(this, "Touch detected!", Toast.LENGTH_SHORT).show();
                    v.performClick(); // Notify accessibility services
                    break;

                case MotionEvent.ACTION_UP:
                    // Action when the touch is released
                    Toast.makeText(this, "Touch released!", Toast.LENGTH_SHORT).show();
                    break;

                case MotionEvent.ACTION_MOVE:
                    // Action when the touch is moved
                    Toast.makeText(this, "Touch moved!", Toast.LENGTH_SHORT).show();
                    break;

                default:
                    break;
            }
            return false; // Allow default behavior
        });


        heroesList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        String selectedHero = heroesList.getSelectedItem().toString();
        textView.setText(selectedHero);


    }
}