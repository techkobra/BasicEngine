package com.moonstub.basicengine.screens;

import com.moonstub.basicengine.Game;
import com.moonstub.basicengine.GameAssets;
import com.moonstub.basicengine.classes.AnimateImage;
import com.moonstub.basicengine.framework.GameActivity;
import com.moonstub.basicengine.framework.GameGraphics;
import com.moonstub.basicengine.framework.GameScreen;

import java.util.Random;

/**
 * Created by Micah on 1/12/2016.
 */
public class LoadingScreen extends GameScreen {

    public AnimateImage blueGem;
    public AnimateImage greenGem;

    int index = 0;

    public LoadingScreen(GameActivity game) {
        super(game);
    }

    @Override
    public void init() {
        GameAssets.GreenGem = getGameGraphics().newImage("green.png", GameGraphics.ImageFormat.ARGB8888);
        GameAssets.BlueGem = getGameGraphics().newImage("red.png", GameGraphics.ImageFormat.ARGB8888);
        //while(GameAssets.BlueGem.getWidth() != 0){}
        blueGem = new AnimateImage(getGameActivity(),GameAssets.BlueGem,50,50,24);
        blueGem.LoadImageArray();

        greenGem = new AnimateImage(getGameActivity(),GameAssets.GreenGem,42,41,20);
        greenGem.LoadImageArray();

    }

    @Override
    public void update(float delta) {

    }

    @Override
    public void draw(float delta) {
        //Random rnd = new Random();
        //getGameGraphics().drawImage(GameAssets.BlueGem, 0, 0);
        //getGameGraphics().drawImage(GameAssets.GreenGem, 400,0);
        //int index = rnd.nextInt(20);

        getGameGraphics().drawImage(blueGem.getImage(index),100,300);
        getGameGraphics().drawImage(greenGem.getImage(index),400,300);

        index++;
        if(index >19){
            index = 0;
        }

    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public boolean onBackPressed() {
        return false;
    }
}
