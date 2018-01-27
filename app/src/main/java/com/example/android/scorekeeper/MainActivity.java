package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int POINTS_FOR_FREE_THROW = 1;
    final int POINTS_FOR_TWO_POINT = 2;
    final int POINTS_FOR_THREE_POINT = 3;

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase Team A's score by 3
     */
    public void addThreeForTeamA(View v){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase Team A's score by 2
     */
    public void addTwoForTeamA(View v){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase Team A's score by 1
     */
    public void addFreeThrowForTeamA(View v){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase Team B's score by 3
     */
    public void addThreeForTeamB(View v){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase Team B's score by 2
     */
    public void addTwoForTeamB(View v){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase Team A's score by 1
     */
    public void addFreeThrowForTeamB(View v){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
