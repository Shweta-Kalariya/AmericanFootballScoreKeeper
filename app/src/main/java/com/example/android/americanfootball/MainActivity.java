package com.example.android.americanfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final int TOUCHDOWN_POINTS = 6, FIELD_GOAL_POINTS = 3;
    static final int PAT_2_POINTS = 2, PAT_1_POINT = 1;
    static final int SAFETY_POINTS = 2;

    int teamAScore = 0, teamBScore= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Team A score keeping functions
    /*
     * Adds touchdown points to team A score
     * View required as an input, returns void
     */
    public void addTeamATouchdownPoints(View view){
        Log.v("addTeamATouchDown","before setTeamAScore");
        setTeamAScore(teamAScore+TOUCHDOWN_POINTS);
        Log.v("addTeamATouchDown","after setTeamAScore");
        displayTeamAScore();
        Log.v("addTeamATouchDown","after display team a score");
    }
    /*
     * Adds field goal points to team A score
     * View required as an input, returns void
     */
    public void addTeamAFieldGoalPoints(View view){
        setTeamAScore(teamAScore+FIELD_GOAL_POINTS);
        displayTeamAScore();
    }
    /*
     * Adds PAT 1 points to team A score
     * View required as an input, returns void
     */
    public void addTeamAPAT1Point(View view){
        setTeamAScore(teamAScore+PAT_1_POINT);
        displayTeamAScore();
    }
    /*
     * Adds PAT 2 points to team A score
     * View required as an input, returns void
     */
    public void addTeamAPAT2Points(View view){
        setTeamAScore(teamAScore+PAT_2_POINTS);
        displayTeamAScore();
    }
    /*
     * Adds safety points to team A score
     * View required as an input, returns void
     */
    public void addTeamASafetyPoints(View view){
        setTeamAScore(teamAScore+SAFETY_POINTS);
        displayTeamAScore();
    }
    /*
     * Function displays team A score
     *  No parameters required, No return value
     *
     */
    public void displayTeamAScore(){
        TextView teamA = (TextView)findViewById(R.id.teamAScore);
        teamA.setText(Integer.toString(getTeamAScore()));
    }
    /*
     * Function returns score(int value) of team A
     * No parameters required
     */
    public int getTeamAScore(){
        return teamAScore;
    }
    /*
     * Function updates score for team A
     * It accepts int value and returns void
     *
     */
    public void setTeamAScore(int score){
        teamAScore = score;
    }

    //Team B score counting
    /*
     * Adds touchdown points to team B score
     * View required as an input, returns void
     */
    public void addTeamBTouchdownPoints(View view){
        setTeamBScore(teamBScore+TOUCHDOWN_POINTS);
        displayTeamBScore();
    }
    /*
     * Adds field goal points to team B score
     * View required as an input, returns void
     */
    public void addTeamBFieldGoalPoints(View view){
        setTeamBScore(teamBScore+FIELD_GOAL_POINTS);
        displayTeamBScore();
    }
    /*
     * Adds PAT 1 points to team B score
     * View required as an input, returns void
     */
    public void addTeamBPAT1Point(View view){
        setTeamBScore(teamBScore+PAT_1_POINT);
        displayTeamBScore();
    }
    /*
     * Adds PAT 2 points to team B score
     * View required as an input, returns void
     */
    public void addTeamBPAT2Points(View view){
        setTeamBScore(teamBScore+PAT_2_POINTS);
        displayTeamBScore();
    }
    /*
     * Adds safety points to team B score
     * View required as an input, returns void
     *
     */
    public void addTeamBSafetyPoints(View view){
        setTeamBScore(teamBScore+SAFETY_POINTS);
        displayTeamBScore();
    }
    /*
     * Function displays team B score
     *  No parameters required, No return value
     */
    public void displayTeamBScore(){
        TextView teamB = (TextView)findViewById(R.id.teamBScore);
        teamB.setText(Integer.toString(getTeamBScore()));
    }
    /*
     * Function returns score of team B
     * No parameters required
     */
    public int getTeamBScore(){
        return teamBScore;
    }
    /*
     * Function sets score for team B
     *  int value required as an input
     *
     */
    public void setTeamBScore(int score){
        teamBScore = score;
    }
    /*
     * Function resets score of both team
     * View parameter as an input and returns void
     *
     */
    public void resetScore(View view){
        teamAScore = teamBScore = 0;
        displayTeamAScore();
        displayTeamBScore();
    }
}
