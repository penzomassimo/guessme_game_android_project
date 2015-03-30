package com.example.massimo.guessme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends Activity {

    static int turn = 0 ;						// used to signal turn between the two players
    Random rand = new Random() ;				// creates a random generator object
    static int row = 4 ;						// the number of rows for the tiles
    static int col = 4 ;						// the number of columns for the tiles
    int[][] numbers = new int[row][col] ;		// two dimensional array to hold the numbers for the tiles
    int player1 = 0 ;							// used to track one of the players result
    int player2 = 0 ;							// used to track one of the players result
    TextView playerOneResult ;					// a component responsible to display a cumulative result
    TextView playerTwoResult ;					// a component responsible to display a cumulative result
    Button[][] tiles = new Button[row][col] ;	// the tiles


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // retrieves the these TextView objects
        playerOneResult = (TextView) findViewById(R.id.playerOneResult) ;
        playerTwoResult = (TextView) findViewById(R.id.playerTwoResult) ;

        // calls a methods to populate the two dimensional array with randomly generated numbers
        populate() ;


        // instantiation of object so we can create the toast element
        Context context = getApplicationContext();
        CharSequence text = "Da game is on!";
        int duration = Toast.LENGTH_SHORT;

        // creation of the toast element
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void populate() {
        for (int i=0; i < row; i++) {
            for (int j=0; j < col; j++) {
                numbers[i][j] = rand.nextInt(10) ;
            }
        }
    }

    public void onClick(View v) {

        Button tile = (Button) v ;

        // toast context
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        switch (tile.getId()) {

            case R.id.newGame:
                Intent intent = getIntent();      // using intents to recreate the activity
                finish();
                startActivity(intent);
                break ;

            case R.id.r01:
                if ( turn == 0) {
                    player1 += numbers[0][0] ;
                    tile.setBackgroundColor(Color.rgb(255, 25, 91));
                    tile.setText("" + numbers[0][0]);
                    tile.setTextColor(Color.rgb(255, 255, 255));
                } else {
                    player2 += numbers[0][0] ;
                    tile.setBackgroundColor(Color.rgb(0, 195, 255));
                    tile.setText("" + numbers[0][0]);
                    tile.setTextColor(Color.rgb(0, 0, 0));
                }
                break ;

            case R.id.r02:
                if ( turn == 0) {
                    player1 += numbers[0][1] ;
                    tile.setBackgroundColor(Color.rgb(255, 25, 91));
                    tile.setText("" + numbers[0][1]);
                    tile.setTextColor(Color.rgb(255, 255, 255));
                } else {
                    player2 += numbers[0][1] ;
                    tile.setBackgroundColor(Color.rgb(0, 195, 255));
                    tile.setText("" + numbers[0][1]);
                    tile.setTextColor(Color.rgb(0, 0, 0));
                }
                break ;
            case R.id.r03:
                if ( turn == 0) {
                    player1 += numbers[0][2] ;
                    tile.setBackgroundColor(Color.rgb(255, 25, 91));
                    tile.setText("" + numbers[0][2]);
                    tile.setTextColor(Color.rgb(255, 255, 255));
                } else {
                    player2 += numbers[0][2] ;
                    tile.setBackgroundColor(Color.rgb(0, 195, 255));
                    tile.setText("" + numbers[0][2]);
                    tile.setTextColor(Color.rgb(0, 0, 0));
                }
                break ;
            case R.id.r04:
                if ( turn == 0) {
                    player1 += numbers[0][3] ;
                    tile.setBackgroundColor(Color.rgb(255, 25, 91));
                    tile.setText("" + numbers[0][3]);
                    tile.setTextColor(Color.rgb(255, 255, 255));
                } else {
                    player2 += numbers[0][3] ;
                    tile.setBackgroundColor(Color.rgb(0, 195, 255));
                    tile.setText("" + numbers[0][3]);
                    tile.setTextColor(Color.rgb(0, 0, 0));
                }
                break ;
            case R.id.r05:
                if ( turn == 0) {
                    player1 += numbers[1][0] ;
                    tile.setBackgroundColor(Color.rgb(255, 25, 91));
                    tile.setText("" + numbers[1][0]);
                    tile.setTextColor(Color.rgb(255, 255, 255));
                } else {
                    player2 += numbers[1][0] ;
                    tile.setBackgroundColor(Color.rgb(0, 195, 255));
                    tile.setText("" + numbers[1][0]);
                    tile.setTextColor(Color.rgb(0, 0, 0));
                }
                break ;
            case R.id.r06:
                if ( turn == 0) {
                    player1 += numbers[1][1] ;
                    tile.setBackgroundColor(Color.rgb(255, 25, 91));
                    tile.setText("" + numbers[1][1]);
                    tile.setTextColor(Color.rgb(255, 255, 255));
                } else {
                    player2 += numbers[1][1] ;
                    tile.setBackgroundColor(Color.rgb(0, 195, 255));
                    tile.setText("" + numbers[1][1]);
                    tile.setTextColor(Color.rgb(0, 0, 0));
                }
                break ;
            case R.id.r07:
                if ( turn == 0) {
                    player1 += numbers[1][2] ;
                    tile.setBackgroundColor(Color.rgb(255, 25, 91));
                    tile.setText("" + numbers[1][2]);
                    tile.setTextColor(Color.rgb(255, 255, 255));
                } else {
                    player2 += numbers[1][2] ;
                    tile.setBackgroundColor(Color.rgb(0, 195, 255));
                    tile.setText("" + numbers[1][2]);
                    tile.setTextColor(Color.rgb(0, 0, 0));
                }
                break ;
            case R.id.r08:
                if ( turn == 0) {
                    player1 += numbers[1][3] ;
                    tile.setBackgroundColor(Color.rgb(255, 25, 91));
                    tile.setText("" + numbers[1][3]);
                    tile.setTextColor(Color.rgb(255, 255, 255));
                } else {
                    player2 += numbers[1][3] ;
                    tile.setBackgroundColor(Color.rgb(0, 195, 255));
                    tile.setText("" + numbers[1][3]);
                    tile.setTextColor(Color.rgb(0, 0, 0));
                }
                break ;

            case R.id.r09:
                if ( turn == 0) {
                    player1 += numbers[2][0] ;
                    tile.setBackgroundColor(Color.rgb(255, 25, 91));
                    tile.setText("" + numbers[2][0]);
                    tile.setTextColor(Color.rgb(255, 255, 255));
                } else {
                    player2 += numbers[2][0] ;
                    tile.setBackgroundColor(Color.rgb(0, 195, 255));
                    tile.setText("" + numbers[2][0]);
                    tile.setTextColor(Color.rgb(0, 0, 0));
                }
                break ;

            case R.id.r10:
                if ( turn == 0) {
                    player1 += numbers[2][1] ;
                    tile.setBackgroundColor(Color.rgb(255, 25, 91));
                    tile.setText("" + numbers[2][1]);
                    tile.setTextColor(Color.rgb(255, 255, 255));
                } else {
                    player2 += numbers[2][1] ;
                    tile.setBackgroundColor(Color.rgb(0, 195, 255));
                    tile.setText("" + numbers[2][1]);
                    tile.setTextColor(Color.rgb(0, 0, 0));
                }
                break ;

            case R.id.r11:
                if ( turn == 0) {
                    player1 += numbers[2][2] ;
                    tile.setBackgroundColor(Color.rgb(255, 25, 91));
                    tile.setText("" + numbers[2][2]);
                    tile.setTextColor(Color.rgb(255, 255, 255));
                } else {
                    player2 += numbers[2][2] ;
                    tile.setBackgroundColor(Color.rgb(0, 195, 255));
                    tile.setText("" + numbers[2][2]);
                    tile.setTextColor(Color.rgb(0, 0, 0));
                }
                break ;

            case R.id.r12:
                if ( turn == 0) {
                    player1 += numbers[2][3] ;
                    tile.setBackgroundColor(Color.rgb(255, 25, 91));
                    tile.setText("" + numbers[2][3]);
                    tile.setTextColor(Color.rgb(255, 255, 255));
                } else {
                    player2 += numbers[2][3] ;
                    tile.setBackgroundColor(Color.rgb(0, 195, 255));
                    tile.setText("" + numbers[2][3]);
                    tile.setTextColor(Color.rgb(0, 0, 0));
                }
                break ;

            case R.id.r13:
                if ( turn == 0) {
                    player1 += numbers[3][0] ;
                    tile.setBackgroundColor(Color.rgb(255, 25, 91));
                    tile.setText("" + numbers[3][0]);
                    tile.setTextColor(Color.rgb(255, 255, 255));
                } else {
                    player2 += numbers[3][0] ;
                    tile.setBackgroundColor(Color.rgb(0, 195, 255));
                    tile.setText("" + numbers[3][0]);
                    tile.setTextColor(Color.rgb(0, 0, 0));
                }
                break ;

            case R.id.r14:
                if ( turn == 0) {
                    player1 += numbers[3][1] ;
                    tile.setBackgroundColor(Color.rgb(255, 25, 91));
                    tile.setText("" + numbers[3][1]);
                    tile.setTextColor(Color.rgb(255, 255, 255));
                } else {
                    player2 += numbers[3][1] ;
                    tile.setBackgroundColor(Color.rgb(0, 195, 255));
                    tile.setText("" + numbers[3][1]);
                    tile.setTextColor(Color.rgb(0, 0, 0));
                }
                break ;

            case R.id.r15:
                if ( turn == 0) {
                    player1 += numbers[3][2] ;
                    tile.setBackgroundColor(Color.rgb(255, 25, 91));
                    tile.setText("" + numbers[3][2]);
                    tile.setTextColor(Color.rgb(255, 255, 255));
                } else {
                    player2 += numbers[3][2] ;
                    tile.setBackgroundColor(Color.rgb(0, 195, 255));
                    tile.setText("" + numbers[3][2]);
                    tile.setTextColor(Color.rgb(0, 0, 0));
                }
                break ;
            case R.id.r16:
                if ( turn == 0) {
                    player1 += numbers[3][3] ;
                    tile.setBackgroundColor(Color.rgb(255, 25, 91));
                    tile.setText("" + numbers[3][3]);
                    tile.setTextColor(Color.rgb(255, 255, 255));
                } else {
                    player2 += numbers[3][3] ;
                    tile.setBackgroundColor(Color.rgb(0, 195, 255));
                    tile.setText("" + numbers[3][3]);
                    tile.setTextColor(Color.rgb(0, 0, 0));
                }
                break ;

        }

        playerOneResult.setText("" + player1) ;
        playerTwoResult.setText("" + player2);
        tile.setEnabled(false);
        if (turn == 0) {
            turn = 1 ;
        }
        else {
            turn = 0 ;
        }

        if (player1 > player2){     // showing toast between plays to notify who is winning the game.

            Toast toast = Toast.makeText(context, "Player 1 is winning !!", duration);
            toast.show();
        } else {
            Toast toast = Toast.makeText(context, "Player 2 is winning !!", duration);
            toast.show();
        }

    }

    /*@Override
    public void onClick(DialogInterface dialog, int which) {
        // TODO Auto-generated method stub

    }*/

}
