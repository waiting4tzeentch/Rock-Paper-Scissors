package com.wesleyreisz.rockpaperscissors;

import android.graphics.Color;

import com.wesleyreisz.rockpaperscissors.GameTypes.GameType;
import com.wesleyreisz.rockpaperscissors.GameTypes.LizardGameType;
import com.wesleyreisz.rockpaperscissors.GameTypes.PaperGameType;
import com.wesleyreisz.rockpaperscissors.GameTypes.RockGameType;
import com.wesleyreisz.rockpaperscissors.GameTypes.ScissorsGameType;
import com.wesleyreisz.rockpaperscissors.GameTypes.SpockGameType;

import java.util.Random;

/**
 * Created by wesleyreisz on 9/13/15.
 */
public class GameUtils {
    public static final String BEATS = "You Win!!!";
    public static final String LOSES_TO = "You Lose!!!";
    public static final String PUSH = "It's a push. Go Again.";
    //----
    public static final String TIES = "ties";
    public static final String CUTS = "cuts";
    public static final String COVERS = "covers";
    public static final String POISONS = "poisons";
    public static final String SMASHES = "smashes";
    public static final String EATS = "eats";
    public static final String VAPORIZES = "vaporizes";
    public static final String CRUSHES = "crushes";
    public static final String DISPROVES = "disproves";
    public static final String DECAPITATES = "decapitates";

    public static Integer getComputerChoice(){
        Integer selectedValue;
        Random r = new Random(System.currentTimeMillis());

        selectedValue = r.nextInt(3);//
        if(selectedValue==0){
            return R.id.btnRock;
        }else if (selectedValue==1){
            return R.id.btnPaper;
        }else{
            return R.id.btnScissors;
        }
    }

    public static Integer convertButtonToImage(Integer buttonChoice) {
        if(buttonChoice==R.id.btnRock){
            return R.drawable.rock;
        }else if (buttonChoice==R.id.btnPaper){
            return R.drawable.paper;
        }else if (buttonChoice==R.id.btnLizard){
            return R.drawable.lizard;
        }else if (buttonChoice==R.id.btnSpock){
            return R.drawable.spock;
        }else {
            return R.drawable.scissors;
        }
    }


    public static GameResult evaluateWinner(Integer playerSelectedChoice, Integer computerSelectedChoice) {
        GameType gameType;

        if (playerSelectedChoice==R.id.btnRock){
            gameType = new RockGameType();
        }else if  (playerSelectedChoice==R.id.btnPaper){
            gameType = new PaperGameType();
        }else if  (playerSelectedChoice==R.id.btnSpock){
            gameType = new SpockGameType();
        }else if  (playerSelectedChoice==R.id.btnLizard){
            gameType = new LizardGameType();
        }else{
            gameType = new ScissorsGameType();
        }
        return gameType.eval(computerSelectedChoice);
    }

    public static int defineTextColor(String msg) {
        if(GameUtils.LOSES_TO.equalsIgnoreCase(msg)){
            return Color.RED;
        }else if(GameUtils.BEATS.equalsIgnoreCase(msg)){
            return Color.GREEN;
        }else{
            return Color.BLACK;
        }
    }

}

