package com.wesleyreisz.rockpaperscissors;

import android.app.Application;
import android.test.ApplicationTestCase;

import com.wesleyreisz.rockpaperscissors.util.GameUtil;

import junit.framework.Assert;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testRandomComputerChoice(){
        Integer btnRock = R.id.btnRock;
        Integer btnPaper = R.id.btnPaper;
        Integer btnScissors = R.id.btnScissors;

        boolean bRock =false;
        boolean bPaper = false;
        boolean bScissors = false;

        for(int i =0;i<100;i++){
            Integer choice = GameUtil.randomComputerChoice();
            if (choice==btnRock){
                bRock = true;
            }else if(choice==btnPaper){
                bPaper = true;
            }else{
                bScissors = true;
            }
        }

        Assert.assertEquals(bRock, true);
        Assert.assertEquals(bPaper, true);
        Assert.assertEquals(bScissors, true);

    }
}