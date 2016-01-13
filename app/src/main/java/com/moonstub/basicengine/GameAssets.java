package com.moonstub.basicengine;

import com.moonstub.training.app.snakealpha.framework.GameImage;

public class GameAssets {

    //Snake Assets
    public static GameImage SnakeSection;
    public static GameImage SnakeFoodApple;

    public enum LoadingScreens {
        Splash,
        MainMenu,
        GameBoard;
        //Add more options for more screens Loading Screen Loads Assets
    }
    //Splash Screen Assets
    public static GameImage SplashImage;
    //MainMenu Assets
    public static GameImage PlayBtnMenu;
    public static GameImage PlayBtnMenuDefault;
    public static GameImage PlayBtnMenuPressed;
    public static GameImage PlayBtnMenu_Depressed;
    public static GameImage HowToPlayBtnMenu;
    public static GameImage HowToPlayBtnMenu_Depressed;

}
