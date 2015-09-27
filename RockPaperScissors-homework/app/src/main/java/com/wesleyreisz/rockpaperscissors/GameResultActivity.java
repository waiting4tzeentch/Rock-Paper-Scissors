package com.wesleyreisz.rockpaperscissors;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.wesleyreisz.rockpaperscissors.Game.GameResult;
import com.wesleyreisz.rockpaperscissors.Game.GameUtils;

public class GameResultActivity extends AppCompatActivity {

    private static final String TAG = "Result Page";
    private static final int TEXT_SIZE = 28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_result);

        RelativeLayout rl = (RelativeLayout)findViewById(R.id.resultLayout);
        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent intent = getIntent();
        Integer playerSelectedChoice = (Integer)intent.getIntExtra(MainActivity.PLAYER_CHOICE,1);
        Integer computerSelectedChoice = GameUtils.getComputerChoice();
        GameResult result = GameUtils.evaluateWinner(playerSelectedChoice, computerSelectedChoice);

        ImageView winner = (ImageView) findViewById(R.id.btnWinner);
        winner.setImageResource(GameUtils.convertButtonToImage(result.getWinner()));

        TextView resultText = (TextView)findViewById(R.id.txtResult);
        resultText.setText(result.getTextResult());
        resultText.setTextSize(TEXT_SIZE - 8);
        resultText.setTextColor(GameUtils.defineTextColor(result.getStatus()));

        TextView messageText = (TextView)findViewById(R.id.txtMessage);
        messageText.setText(result.getStatus());
        messageText.setTextSize(TEXT_SIZE);
        messageText.setTextColor(Color.WHITE);
        messageText.setBackgroundColor(GameUtils.defineTextColor(result.getStatus()));

        ImageView loser = (ImageView) findViewById(R.id.btnLoser);
        loser.setImageResource(GameUtils.convertButtonToImage(result.getLoser()));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game_result, menu);
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
}
