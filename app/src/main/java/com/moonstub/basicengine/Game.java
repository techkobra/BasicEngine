package com.moonstub.basicengine;

import com.moonstub.basicengine.screens.LoadingScreen;
import com.moonstub.basicengine.framework.GameActivity;
import com.moonstub.basicengine.framework.GameScreen;
import com.moonstub.basicengine.screens.LoadingScreen;

public class Game extends GameActivity {

    protected GameScreen initializeScreen() {
        return new LoadingScreen(this);
    }

}
