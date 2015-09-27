package com.wesleyreisz.rockpaperscissors.GameTypes;

import com.wesleyreisz.rockpaperscissors.Game.GameResult;
import com.wesleyreisz.rockpaperscissors.Game.GameUtils;
import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by wesleyreisz on 9/27/15.
 */
public class LizardGameTypeImpl implements GameType {
    @Override
    public GameResult eval(Integer opponentChoice) {
        GameResult result = new GameResult();
        if (opponentChoice== R.id.btnScissors){
            result.setWinner(R.id.btnScissors);
            result.setTextResult(GameUtils.DECAPITATES);
            result.setLoser(R.id.btnLizard);
            result.setStatus(GameUtils.LOSES_TO);
        }else if (opponentChoice==R.id.btnPaper){
            result.setWinner(R.id.btnLizard);
            result.setTextResult(GameUtils.EATS);
            result.setLoser(R.id.btnPaper);
            result.setStatus(GameUtils.BEATS);
        }else if (opponentChoice==R.id.btnRock){
            result.setWinner(R.id.btnRock);
            result.setTextResult(GameUtils.CRUSHES);
            result.setLoser(R.id.btnLizard);
            result.setStatus(GameUtils.LOSES_TO);
        }else if (opponentChoice==R.id.btnSpock){
            result.setWinner(R.id.btnLizard);
            result.setTextResult(GameUtils.POISONS);
            result.setLoser(R.id.btnSpock);
            result.setStatus(GameUtils.BEATS);
        }else{
            result.setWinner(R.id.btnLizard);
            result.setTextResult(GameUtils.TIES);
            result.setLoser(R.id.btnLizard);
            result.setStatus(GameUtils.PUSH);
        }
        return result;
    }
}
