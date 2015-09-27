package com.wesleyreisz.rockpaperscissors.GameTypes;

import com.wesleyreisz.rockpaperscissors.GameResult;
import com.wesleyreisz.rockpaperscissors.GameUtils;
import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by wesleyreisz on 9/13/15.
 */
public class PaperGameType implements GameType {

    @Override
    public GameResult eval(Integer opponentChoice) {
        GameResult result = new GameResult();
        if (opponentChoice== R.id.btnRock){
            result.setWinner(R.id.btnPaper);
            result.setTextResult(GameUtils.COVERS);
            result.setLoser(R.id.btnRock);
            result.setStatus(GameUtils.BEATS);
        }else if (opponentChoice==R.id.btnScissors){
            result.setWinner(R.id.btnScissors);
            result.setTextResult(GameUtils.CUTS);
            result.setLoser(R.id.btnPaper);
            result.setStatus(GameUtils.LOSES_TO);
        }else if (opponentChoice==R.id.btnSpock){
            result.setWinner(R.id.btnPaper);
            result.setTextResult(GameUtils.DISPROVES);
            result.setLoser(R.id.btnSpock);
            result.setStatus(GameUtils.BEATS);
        }else if (opponentChoice==R.id.btnLizard){
            result.setWinner(R.id.btnLizard);
            result.setTextResult(GameUtils.EATS);
            result.setLoser(R.id.btnPaper);
            result.setStatus(GameUtils.LOSES_TO);
        }
        else{
            result.setWinner(R.id.btnPaper);
            result.setTextResult(GameUtils.TIES);
            result.setLoser(R.id.btnPaper);
            result.setStatus(GameUtils.PUSH);
        }
        return result;
    }
}
