package com.vj.firstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class FindMovieActivity extends AppCompatActivity {
    private MovieExpert movieExpert = new MovieExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_movie);
    }

    public String listToString(List<String> list) {
        StringBuilder builder = new StringBuilder();
        for (String str : list) {
            builder.append(str + "\n");
        }
        return builder.toString();
    }

    public void findMovie(View view) {
        TextView textView = findViewById(R.id.movieName);

        Spinner heroesList = findViewById(R.id.heroes);
        List<String> moviesList = movieExpert.getMovies(heroesList.getSelectedItem().toString());
        textView.setText(listToString(moviesList));


//        heroesList.setOnTouchListener((v, event) -> {
//            switch (event.getAction()) {
//                case MotionEvent.ACTION_DOWN:
//                    // Action when the view is touched
//                    Toast.makeText(this, "Touch detected!", Toast.LENGTH_SHORT).show();
//                    v.performClick(); // Notify accessibility services
//                    break;
//
//                case MotionEvent.ACTION_UP:
//                    // Action when the touch is released
//                    Toast.makeText(this, "Touch released!", Toast.LENGTH_SHORT).show();
//                    break;
//
//                case MotionEvent.ACTION_MOVE:
//                    // Action when the touch is moved
//                    Toast.makeText(this, "Touch moved!", Toast.LENGTH_SHORT).show();
//                    break;
//
//                default:
//                    break;
//            }
//            return false; // Allow default behavior
//        });


        heroesList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                textView.setText(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}