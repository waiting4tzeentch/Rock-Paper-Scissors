package com.wesleyreisz.rockpaperscissors.util;

import com.wesleyreisz.rockpaperscissors.R;

import java.util.Random;

/**
 * Created by wesleyreisz on 9/21/15.
 */
public class GameUtil {
    private static int COUNT=0;

    public static Integer randomComputerChoice() {
        Integer selectedValue;
        Random r = new Random(System.currentTimeMillis());

        selectedValue = r.nextInt(3);//
        if (selectedValue == 0) {
            return R.id.btnRock;
        } else if (selectedValue == 1) {
            return R.id.btnPaper;
        } else {
            return R.id.btnScissors;
        }
    }
}
